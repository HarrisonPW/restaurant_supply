package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.Users;

import java.util.List;
import java.util.Map;


public interface UsersService {

    
    Users queryById(String username);

    
    List<Users> queryAllByLimit(int offset, int limit);

    
    boolean insert(Users users);

    
    boolean update(Users users);

    
    boolean deleteById(String username);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

