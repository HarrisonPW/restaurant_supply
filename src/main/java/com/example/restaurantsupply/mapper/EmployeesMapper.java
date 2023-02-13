package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Employees;
import com.example.restaurantsupply.param.AddEmployeeParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmployeesMapper {

    
    Employees queryById(String username);

    
    List<Employees> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Employees> queryAll(Employees employees);

    
    int insert(AddEmployeeParam addEmployeeParam);

    
    int update(Employees employees);

    
    int deleteById(String username);

}
