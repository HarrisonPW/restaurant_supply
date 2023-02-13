package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UsersMapper {

    
    Users queryById(String username);

    
    List<Users> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Users> queryAll(Users users);

    
    int insert(Users users);

    
    int update(Users users);

    
    int deleteById(String username);

}
