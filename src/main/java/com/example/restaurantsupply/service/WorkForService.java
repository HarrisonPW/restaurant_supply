package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.WorkFor;

import java.util.List;
import java.util.Map;


public interface WorkForService {

    
    WorkFor queryById(String username);

    
    List<WorkFor> queryAllByLimit(int offset, int limit);

    
    boolean insert(WorkFor workFor);

    
    boolean update(WorkFor workFor);

    
    boolean delete(WorkFor workFor);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

