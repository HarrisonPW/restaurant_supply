package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Locations;
import com.example.restaurantsupply.mapper.LocationsMapper;
import com.example.restaurantsupply.service.LocationsService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("locationsService")
public class LocationsServiceImpl implements LocationsService {
    @Autowired
    private LocationsMapper locationsMapper;

    
    @Override
    public Locations queryById(String label) {
        return this.locationsMapper.queryById(label);
    }

    
    @Override
    public List<Locations> queryAllByLimit(int offset, int limit) {
        return this.locationsMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Locations locations) {
        return this.locationsMapper.insert(locations) != 0;
    }

    
    @Override
    public boolean update(Locations locations) {
        return this.locationsMapper.update(locations) != 0;
    }

    
    @Override
    public boolean deleteById(String label) {
        return this.locationsMapper.deleteById(label) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Locations> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Locations> models = locationsMapper.queryAll((Locations) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
