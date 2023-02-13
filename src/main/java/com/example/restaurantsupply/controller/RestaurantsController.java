package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.RestaurantsService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Restaurants;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("restaurants")
public class RestaurantsController {
    
    @Autowired
    private RestaurantsService restaurantsService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Restaurants restaurants) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", restaurants);
        return Result.ok().data(restaurantsService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", restaurantsService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Restaurants restaurants) {
        return Result.auto(restaurantsService.insert(restaurants));
    }

    @PostMapping("/start-funding")
    public Result startFunding(String longName, String owner) {
        return Result.auto(restaurantsService.startFunding(longName, owner));
    }

    @PostMapping("/purchase-ingredient")
    public Result purchaseIngredient(String longName, String id, Integer tag, String barcode, Integer quantity) {
        return Result.auto(restaurantsService.purchaseIngredient(longName, id, tag, barcode, quantity));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(restaurantsService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Restaurants restaurants) {
        return Result.auto(restaurantsService.update(restaurants));
    }

}
