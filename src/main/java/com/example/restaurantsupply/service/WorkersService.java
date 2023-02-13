package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Workers;

import java.util.List;
import java.util.Map;


public interface WorkersService {

    
    Workers queryById(String username);

    
    List<Workers> queryAllByLimit(int offset, int limit);

    
    boolean insert(Workers workers);

    
    boolean update(Workers workers);

    
    boolean deleteById(String username);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

