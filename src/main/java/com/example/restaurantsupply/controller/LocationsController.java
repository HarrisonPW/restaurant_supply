package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.LocationsService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Locations;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("locations")
public class LocationsController {
    
    @Autowired
    private LocationsService locationsService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Locations locations) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", locations);
        return Result.ok().data(locationsService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", locationsService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Locations locations) {
        return Result.auto(locationsService.insert(locations));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(locationsService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Locations locations) {
        return Result.auto(locationsService.update(locations));
    }

}
