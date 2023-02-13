package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Workers;
import com.example.restaurantsupply.mapper.WorkersMapper;
import com.example.restaurantsupply.service.WorkersService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("workersService")
public class WorkersServiceImpl implements WorkersService {
    @Autowired
    private WorkersMapper workersMapper;

    
    @Override
    public Workers queryById(String username) {
        return this.workersMapper.queryById(username);
    }

    
    @Override
    public List<Workers> queryAllByLimit(int offset, int limit) {
        return this.workersMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Workers workers) {
        return this.workersMapper.insert(workers) != 0;
    }

    
    @Override
    public boolean update(Workers workers) {
        return this.workersMapper.update(workers) != 0;
    }

    
    @Override
    public boolean deleteById(String username) {
        return this.workersMapper.deleteById(username) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Workers> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Workers> models = workersMapper.queryAll((Workers) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
