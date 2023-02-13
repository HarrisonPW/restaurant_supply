package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Pilots;

import java.util.List;
import java.util.Map;


public interface PilotsService {

    
    Pilots queryById(String username);

    
    List<Pilots> queryAllByLimit(int offset, int limit);

    
    boolean insert(Pilots pilots);

    
    boolean update(Pilots pilots);

    
    boolean deleteById(String username);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

