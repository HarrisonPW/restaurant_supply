package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DisplayEmployeeViewService;
import com.example.restaurantsupply.util.Result;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.model.DisplayEmployeeView;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;


@RestController
@RequestMapping("displayEmployeeView")
public class DisplayEmployeeViewController {
    
    @Resource
    private DisplayEmployeeViewService displayEmployeeViewService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          DisplayEmployeeView displayEmployeeView) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", displayEmployeeView);
        return Result.ok().data(displayEmployeeViewService.findAllByPage(params));
    }


}
