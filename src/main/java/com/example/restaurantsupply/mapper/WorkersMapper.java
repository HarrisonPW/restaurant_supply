package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Workers;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WorkersMapper {

    
    Workers queryById(String username);

    
    List<Workers> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Workers> queryAll(Workers workers);

    
    int insert(Workers workers);

    
    int update(Workers workers);

    
    int deleteById(String username);

}
