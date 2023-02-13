package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.RestaurantOwners;
import com.example.restaurantsupply.param.AddOwnerParam;

import java.util.List;
import java.util.Map;


public interface RestaurantOwnersService {

    
    RestaurantOwners queryById(String username);

    
    List<RestaurantOwners> queryAllByLimit(int offset, int limit);

    
    boolean insert(AddOwnerParam addOwnerParam);

    
    boolean update(RestaurantOwners restaurantOwners);

    
    boolean deleteById(String username);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

