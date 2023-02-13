package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Payload;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PayloadMapper {

    
    Payload queryById(String id);

    
    List<Payload> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Payload> queryAll(Payload payload);

    
    int insert(Payload payload);

    
    int update(Payload payload);

    
    int deleteById(String id);

}
