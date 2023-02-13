package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.WorkFor;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WorkForMapper {

    
    WorkFor queryById(String username);

    
    List<WorkFor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<WorkFor> queryAll(WorkFor workFor);

    
    int insert(WorkFor workFor);

    
    int update(WorkFor workFor);

    
    int delete(WorkFor workFor);

}
