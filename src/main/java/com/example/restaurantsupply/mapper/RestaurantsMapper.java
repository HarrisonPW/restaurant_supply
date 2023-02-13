package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Restaurants;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RestaurantsMapper {

    
    Restaurants queryById(String longName);

    
    List<Restaurants> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Restaurants> queryAll(Restaurants restaurants);

    
    int insert(Restaurants restaurants);

    
    int update(Restaurants restaurants);

    
    int deleteById(String longName);

    int startFunding(@Param("longName") String longName, @Param("owner") String owner);

    int purchaseIngredient(@Param("longName") String longName, @Param("id") String id, @Param("tag") Integer tag, @Param("barcode") String barcode, @Param("quantity") Integer quantity);

}
