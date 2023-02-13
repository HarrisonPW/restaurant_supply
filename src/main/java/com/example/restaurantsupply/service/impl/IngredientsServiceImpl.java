package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Ingredients;
import com.example.restaurantsupply.mapper.IngredientsMapper;
import com.example.restaurantsupply.service.IngredientsService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("ingredientsService")
public class IngredientsServiceImpl implements IngredientsService {
    @Autowired
    private IngredientsMapper ingredientsMapper;

    
    @Override
    public Ingredients queryById(String barcode) {
        return this.ingredientsMapper.queryById(barcode);
    }

    
    @Override
    public List<Ingredients> queryAllByLimit(int offset, int limit) {
        return this.ingredientsMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Ingredients ingredients) {
        return this.ingredientsMapper.insert(ingredients) != 0;
    }

    
    @Override
    public boolean update(Ingredients ingredients) {
        return this.ingredientsMapper.update(ingredients) != 0;
    }

    
    @Override
    public boolean deleteById(String barcode) {
        return this.ingredientsMapper.deleteById(barcode) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Ingredients> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Ingredients> models = ingredientsMapper.queryAll((Ingredients) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

}
