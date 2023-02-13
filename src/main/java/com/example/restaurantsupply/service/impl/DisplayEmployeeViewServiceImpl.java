package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.model.DisplayEmployeeView;
import com.example.restaurantsupply.mapper.DisplayEmployeeViewMapper;
import com.example.restaurantsupply.service.DisplayEmployeeViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("displayEmployeeViewService")
public class DisplayEmployeeViewServiceImpl implements DisplayEmployeeViewService {
    @Autowired
    private DisplayEmployeeViewMapper displayEmployeeViewMapper;

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<DisplayEmployeeView> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<DisplayEmployeeView> models = displayEmployeeViewMapper.queryAll((DisplayEmployeeView) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
