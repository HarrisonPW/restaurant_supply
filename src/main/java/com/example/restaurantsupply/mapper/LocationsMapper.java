package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Locations;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface LocationsMapper {

    
    Locations queryById(String label);

    
    List<Locations> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Locations> queryAll(Locations locations);

    
    int insert(Locations locations);

    
    int update(Locations locations);

    
    int deleteById(String label);

}
