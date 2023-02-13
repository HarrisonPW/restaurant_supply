package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.PayloadService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Payload;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("payload")
public class PayloadController {
    
    @Autowired
    private PayloadService payloadService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Payload payload) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", payload);
        return Result.ok().data(payloadService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", payloadService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Payload payload) {
        return Result.auto(payloadService.insert(payload));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(payloadService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Payload payload) {
        return Result.auto(payloadService.update(payload));
    }

}
