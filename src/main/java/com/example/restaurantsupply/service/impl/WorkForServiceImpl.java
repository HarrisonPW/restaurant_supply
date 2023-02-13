package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.WorkFor;
import com.example.restaurantsupply.mapper.WorkForMapper;
import com.example.restaurantsupply.service.WorkForService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("workForService")
public class WorkForServiceImpl implements WorkForService {
    @Autowired
    private WorkForMapper workForMapper;

    
    @Override
    public WorkFor queryById(String username) {
        return this.workForMapper.queryById(username);
    }

    
    @Override
    public List<WorkFor> queryAllByLimit(int offset, int limit) {
        return this.workForMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(WorkFor workFor) {
        return this.workForMapper.insert(workFor) != 0;
    }

    
    @Override
    public boolean update(WorkFor workFor) {
        return this.workForMapper.update(workFor) != 0;
    }

    
    @Override
    public boolean delete(WorkFor workFor) {
        return this.workForMapper.delete(workFor) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<WorkFor> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<WorkFor> models = workForMapper.queryAll((WorkFor) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
