package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DeliveryServicesService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.DeliveryServices;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("deliveryServices")
public class DeliveryServicesController {
    
    @Autowired
    private DeliveryServicesService deliveryServicesService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          DeliveryServices deliveryServices) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", deliveryServices);
        return Result.ok().data(deliveryServicesService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", deliveryServicesService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(DeliveryServices deliveryServices) {
        return Result.auto(deliveryServicesService.insert(deliveryServices));
    }

    @PostMapping("/manage")
    public Result manage(DeliveryServices deliveryServices) {
        return Result.auto(deliveryServicesService.manage(deliveryServices));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(deliveryServicesService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(DeliveryServices deliveryServices) {
        return Result.auto(deliveryServicesService.update(deliveryServices));
    }

}
