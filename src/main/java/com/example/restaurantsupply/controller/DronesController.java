package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DronesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.domain.Drones;
import com.example.restaurantsupply.util.Result;

import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("drones")
public class DronesController {
    
    @Autowired
    private DronesService dronesService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum,
                          @RequestParam(required = false) Integer pageSize,
                          Drones drones) {
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", drones);
        return Result.ok().data(dronesService.findAllByPage(params));
    }

    @PostMapping("/query/{id}")
    public Result findById(@PathVariable String id) {
        return Result.ok().data("model", dronesService.queryById(id));
    }

    @PostMapping("/create")
    public Result insertModel(Drones drones) {
        return Result.auto(dronesService.insert(drones));
    }

    @PostMapping("/refuel")
    public Result refuelModel(Drones drones) {
        return Result.auto(dronesService.refuel(drones));
    }

    @PostMapping("/join-swarm")
    public Result joinSwarm(Drones drones) {
        return Result.auto(dronesService.joinSwarm(drones));
    }

    @PostMapping("/leave-swarm")
    public Result leaveSwarm(Drones drones) {
        return Result.auto(dronesService.leaveSwarm(drones));
    }

    @PostMapping("/fly-drone")
    public Result flyDrone(Drones drones) {
        return Result.auto(dronesService.flyDrone(drones));
    }

    @PostMapping("/takeover-drone")
    public Result takeoverDrone(Drones drones) {
        return Result.auto(dronesService.takeoverDrone(drones));
    }

    @GetMapping("/remove")
    public Result removeModel(String id, Integer tag) {
        return Result.auto(dronesService.delete(id, tag));
    }

    @PostMapping("/update")
    public Result updateModel(Drones drones) {
        return Result.auto(dronesService.update(drones));
    }

}
