package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.WorkForService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.WorkFor;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("workFor")
public class WorkForController {
    
    @Autowired
    private WorkForService workForService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          WorkFor workFor) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", workFor);
        return Result.ok().data(workForService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", workForService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(WorkFor workFor) {
        return Result.auto(workForService.insert(workFor));
    }

    @GetMapping("/remove")
    public Result removeModel(WorkFor workFor) {
        return Result.auto(workForService.delete(workFor));
    }

    @PostMapping("/update")
    public Result updateModel(WorkFor workFor) {
        return Result.auto(workForService.update(workFor));
    }

}
