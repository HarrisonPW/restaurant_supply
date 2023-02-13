package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.PilotsService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Pilots;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("pilots")
public class PilotsController {
    
    @Autowired
    private PilotsService pilotsService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Pilots pilots) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", pilots);
        return Result.ok().data(pilotsService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", pilotsService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Pilots pilots) {
        return Result.auto(pilotsService.insert(pilots));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(pilotsService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Pilots pilots) {
        return Result.auto(pilotsService.update(pilots));
    }

}
