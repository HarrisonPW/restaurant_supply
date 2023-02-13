package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Employees;
import com.example.restaurantsupply.mapper.EmployeesMapper;
import com.example.restaurantsupply.param.AddEmployeeParam;
import com.example.restaurantsupply.service.EmployeesService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("employeesService")
public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesMapper employeesMapper;

    
    @Override
    public Employees queryById(String username) {
        return this.employeesMapper.queryById(username);
    }

    
    @Override
    public List<Employees> queryAllByLimit(int offset, int limit) {
        return this.employeesMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(AddEmployeeParam addEmployeeParam) {
        return this.employeesMapper.insert(addEmployeeParam) != 0;
    }

    
    @Override
    public boolean update(Employees employees) {
        return this.employeesMapper.update(employees) != 0;
    }

    
    @Override
    public boolean deleteById(String username) {
        return this.employeesMapper.deleteById(username) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Employees> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Employees> models = employeesMapper.queryAll((Employees) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
