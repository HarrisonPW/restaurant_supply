package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.UsersService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Users;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("users")
public class UsersController {
    
    @Autowired
    private UsersService usersService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Users users) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", users);
        return Result.ok().data(usersService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", usersService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Users users) {
        return Result.auto(usersService.insert(users));
    }

    @GetMapping("/remove/{id}")
    public Result removeModel(@PathVariable String id) {
        return Result.auto(usersService.deleteById(id));
    }

    @PostMapping("/update")
    public Result updateModel(Users users) {
        return Result.auto(usersService.update(users));
    }

}
