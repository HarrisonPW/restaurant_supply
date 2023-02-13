package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Payload;
import com.example.restaurantsupply.mapper.PayloadMapper;
import com.example.restaurantsupply.service.PayloadService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("payloadService")
public class PayloadServiceImpl implements PayloadService {
    @Autowired
    private PayloadMapper payloadMapper;

    
    @Override
    public Payload queryById(String id) {
        return this.payloadMapper.queryById(id);
    }

    
    @Override
    public List<Payload> queryAllByLimit(int offset, int limit) {
        return this.payloadMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Payload payload) {
        return this.payloadMapper.insert(payload) != 0;
    }

    
    @Override
    public boolean update(Payload payload) {
        return this.payloadMapper.update(payload) != 0;
    }

    
    @Override
    public boolean deleteById(String id) {
        return this.payloadMapper.deleteById(id) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Payload> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Payload> models = payloadMapper.queryAll((Payload) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
