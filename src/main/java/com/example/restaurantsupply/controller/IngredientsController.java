package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.IngredientsService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Ingredients;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("ingredients")
public class IngredientsController {
    
    @Autowired
    private IngredientsService ingredientsService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Ingredients ingredients) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", ingredients);
        return Result.ok().data(ingredientsService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", ingredientsService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Ingredients ingredients) {
        return Result.auto(ingredientsService.insert(ingredients));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(ingredientsService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Ingredients ingredients) {
        return Result.auto(ingredientsService.update(ingredients));
    }

}
