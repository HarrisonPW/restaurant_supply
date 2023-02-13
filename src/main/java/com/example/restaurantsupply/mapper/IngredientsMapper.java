package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Ingredients;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IngredientsMapper {

    
    Ingredients queryById(String barcode);

    
    List<Ingredients> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Ingredients> queryAll(Ingredients ingredients);

    
    int insert(Ingredients ingredients);

    
    int update(Ingredients ingredients);

    
    int deleteById(String barcode);

}
