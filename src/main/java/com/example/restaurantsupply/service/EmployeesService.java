package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Employees;
import com.example.restaurantsupply.param.AddEmployeeParam;

import java.util.List;
import java.util.Map;


public interface EmployeesService {

    
    Employees queryById(String username);

    
    List<Employees> queryAllByLimit(int offset, int limit);

    
    boolean insert(AddEmployeeParam addEmployeeParam);

    
    boolean update(Employees employees);

    
    boolean deleteById(String username);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

