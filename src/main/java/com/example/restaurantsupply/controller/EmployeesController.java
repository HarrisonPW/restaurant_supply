package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.param.AddEmployeeParam;
import com.example.restaurantsupply.service.EmployeesService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Employees;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("employees")
public class EmployeesController {
    
    @Autowired
    private EmployeesService employeesService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Employees employees) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", employees);
        return Result.ok().data(employeesService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", employeesService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(AddEmployeeParam addEmployeeParam) {
        return Result.auto(employeesService.insert(addEmployeeParam));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(employeesService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Employees employees) {
        return Result.auto(employeesService.update(employees));
    }

}
