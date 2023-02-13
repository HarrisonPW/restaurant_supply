package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.WorkersService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Workers;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("workers")
public class WorkersController {
    
    @Autowired
    private WorkersService workersService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Workers workers) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", workers);
        return Result.ok().data(workersService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", workersService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Workers workers) {
        return Result.auto(workersService.insert(workers));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(workersService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Workers workers) {
        return Result.auto(workersService.update(workers));
    }

}
