package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Ingredients;

import java.util.List;
import java.util.Map;


public interface IngredientsService {

    
    Ingredients queryById(String barcode);

    
    List<Ingredients> queryAllByLimit(int offset, int limit);

    
    boolean insert(Ingredients ingredients);

    
    boolean update(Ingredients ingredients);

    
    boolean deleteById(String barcode);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

