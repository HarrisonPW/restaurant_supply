package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Pilots;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PilotsMapper {

    
    Pilots queryById(String username);

    
    List<Pilots> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Pilots> queryAll(Pilots pilots);

    
    int insert(Pilots pilots);

    
    int update(Pilots pilots);

    
    int deleteById(String username);

}
