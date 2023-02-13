package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.model.DisplayEmployeeView;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DisplayEmployeeViewMapper {

    
    List<DisplayEmployeeView> queryAll(DisplayEmployeeView displayEmployeeView);


}
