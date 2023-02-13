package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.param.AddOwnerParam;
import com.example.restaurantsupply.service.RestaurantOwnersService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.RestaurantOwners;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("restaurantOwners")
public class RestaurantOwnersController {
    
    @Autowired
    private RestaurantOwnersService restaurantOwnersService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          RestaurantOwners restaurantOwners) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", restaurantOwners);
        return Result.ok().data(restaurantOwnersService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", restaurantOwnersService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(AddOwnerParam addOwnerParam) {
        return Result.auto(restaurantOwnersService.insert(addOwnerParam));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(restaurantOwnersService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(RestaurantOwners restaurantOwners) {
        return Result.auto(restaurantOwnersService.update(restaurantOwners));
    }

}
