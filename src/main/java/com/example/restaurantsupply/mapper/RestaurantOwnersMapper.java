package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.RestaurantOwners;
import com.example.restaurantsupply.param.AddOwnerParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RestaurantOwnersMapper {

    
    RestaurantOwners queryById(String username);

    
    List<RestaurantOwners> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<RestaurantOwners> queryAll(RestaurantOwners restaurantOwners);

    
    int insert(AddOwnerParam addOwnerParam);

    
    int update(RestaurantOwners restaurantOwners);

    
    int deleteById(String username);

}
