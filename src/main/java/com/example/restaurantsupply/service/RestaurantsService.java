package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Restaurants;

import java.util.List;
import java.util.Map;


public interface RestaurantsService {

    
    Restaurants queryById(String longName);

    
    List<Restaurants> queryAllByLimit(int offset, int limit);

    
    boolean insert(Restaurants restaurants);

    
    boolean update(Restaurants restaurants);

    
    boolean deleteById(String longName);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

    boolean startFunding(String longName, String owner);

    boolean purchaseIngredient(String longName, String id, Integer tag, String barcode, Integer quantity);
}

