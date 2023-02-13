package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Pilots;
import com.example.restaurantsupply.mapper.PilotsMapper;
import com.example.restaurantsupply.service.PilotsService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("pilotsService")
public class PilotsServiceImpl implements PilotsService {
    @Autowired
    private PilotsMapper pilotsMapper;

    
    @Override
    public Pilots queryById(String username) {
        return this.pilotsMapper.queryById(username);
    }

    
    @Override
    public List<Pilots> queryAllByLimit(int offset, int limit) {
        return this.pilotsMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Pilots pilots) {
        return this.pilotsMapper.insert(pilots) != 0;
    }

    
    @Override
    public boolean update(Pilots pilots) {
        return this.pilotsMapper.update(pilots) != 0;
    }

    
    @Override
    public boolean deleteById(String username) {
        return this.pilotsMapper.deleteById(username) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Pilots> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Pilots> models = pilotsMapper.queryAll((Pilots) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
