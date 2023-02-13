package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Payload;

import java.util.List;
import java.util.Map;


public interface PayloadService {

    
    Payload queryById(String id);

    
    List<Payload> queryAllByLimit(int offset, int limit);

    
    boolean insert(Payload payload);

    
    boolean update(Payload payload);

    
    boolean deleteById(String id);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

