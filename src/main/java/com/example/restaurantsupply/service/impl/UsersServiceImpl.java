package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Users;
import com.example.restaurantsupply.mapper.UsersMapper;
import com.example.restaurantsupply.service.UsersService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    
    @Override
    public Users queryById(String username) {
        return this.usersMapper.queryById(username);
    }

    
    @Override
    public List<Users> queryAllByLimit(int offset, int limit) {
        return this.usersMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Users users) {
        return this.usersMapper.insert(users) != 0;
    }

    
    @Override
    public boolean update(Users users) {
        return this.usersMapper.update(users) != 0;
    }

    
    @Override
    public boolean deleteById(String username) {
        return this.usersMapper.deleteById(username) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Users> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Users> models = usersMapper.queryAll((Users) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
