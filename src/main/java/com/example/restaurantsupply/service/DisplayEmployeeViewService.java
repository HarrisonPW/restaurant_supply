package com.example.restaurantsupply.service;

import java.util.Map;


public interface DisplayEmployeeViewService {

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

