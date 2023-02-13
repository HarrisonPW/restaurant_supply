package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Drones;

import java.util.List;
import java.util.Map;


public interface DronesService {

    
    Drones queryById(String id);

    
    List<Drones> queryAllByLimit(int offset, int limit);

    
    boolean insert(Drones drones);

    
    boolean update(Drones drones);

    
    boolean delete(String id, Integer tag);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

    boolean refuel(Drones drones);

    boolean joinSwarm(Drones drones);

    boolean leaveSwarm(Drones drones);

    boolean flyDrone(Drones drones);

    boolean takeoverDrone(Drones drones);
}

