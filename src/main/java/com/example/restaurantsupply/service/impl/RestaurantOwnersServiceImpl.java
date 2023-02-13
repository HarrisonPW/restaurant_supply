package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.RestaurantOwners;
import com.example.restaurantsupply.mapper.RestaurantOwnersMapper;
import com.example.restaurantsupply.param.AddOwnerParam;
import com.example.restaurantsupply.service.RestaurantOwnersService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("restaurantOwnersService")
public class RestaurantOwnersServiceImpl implements RestaurantOwnersService {
    @Autowired
    private RestaurantOwnersMapper restaurantOwnersMapper;

    
    @Override
    public RestaurantOwners queryById(String username) {
        return this.restaurantOwnersMapper.queryById(username);
    }

    
    @Override
    public List<RestaurantOwners> queryAllByLimit(int offset, int limit) {
        return this.restaurantOwnersMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(AddOwnerParam addOwnerParam) {
        return this.restaurantOwnersMapper.insert(addOwnerParam) != 0;
    }

    
    @Override
    public boolean update(RestaurantOwners restaurantOwners) {
        return this.restaurantOwnersMapper.update(restaurantOwners) != 0;
    }

    
    @Override
    public boolean deleteById(String username) {
        return this.restaurantOwnersMapper.deleteById(username) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<RestaurantOwners> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<RestaurantOwners> models = restaurantOwnersMapper.queryAll((RestaurantOwners) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
