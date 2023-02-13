package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Restaurants;
import com.example.restaurantsupply.mapper.RestaurantsMapper;
import com.example.restaurantsupply.service.RestaurantsService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("restaurantsService")
public class RestaurantsServiceImpl implements RestaurantsService {
    @Autowired
    private RestaurantsMapper restaurantsMapper;

    
    @Override
    public Restaurants queryById(String longName) {
        return this.restaurantsMapper.queryById(longName);
    }

    
    @Override
    public List<Restaurants> queryAllByLimit(int offset, int limit) {
        return this.restaurantsMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Restaurants restaurants) {
        return this.restaurantsMapper.insert(restaurants) != 0;
    }

    
    @Override
    public boolean update(Restaurants restaurants) {
        return this.restaurantsMapper.update(restaurants) != 0;
    }

    
    @Override
    public boolean deleteById(String longName) {
        return this.restaurantsMapper.deleteById(longName) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Restaurants> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Restaurants> models = restaurantsMapper.queryAll((Restaurants) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

    @Override
    public boolean startFunding(String longName, String owner) {
        return this.restaurantsMapper.startFunding(longName, owner) != 0;
    }

    @Override
    public boolean purchaseIngredient(String longName, String id, Integer tag, String barcode, Integer quantity) {
        return this.restaurantsMapper.purchaseIngredient(longName, id, tag, barcode, quantity) != 0;
    }

}
