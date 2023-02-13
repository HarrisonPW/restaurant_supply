package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Locations;

import java.util.List;
import java.util.Map;


public interface LocationsService {

    
    Locations queryById(String label);

    
    List<Locations> queryAllByLimit(int offset, int limit);

    
    boolean insert(Locations locations);

    
    boolean update(Locations locations);

    
    boolean deleteById(String label);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

