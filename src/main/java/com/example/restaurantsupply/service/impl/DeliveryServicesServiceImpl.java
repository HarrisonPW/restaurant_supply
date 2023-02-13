package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.DeliveryServices;
import com.example.restaurantsupply.mapper.DeliveryServicesMapper;
import com.example.restaurantsupply.param.AddServiceParam;
import com.example.restaurantsupply.service.DeliveryServicesService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("deliveryServicesService")
public class DeliveryServicesServiceImpl implements DeliveryServicesService {
    @Autowired
    private DeliveryServicesMapper deliveryServicesMapper;

    
    @Override
    public DeliveryServices queryById(String id) {
        return this.deliveryServicesMapper.queryById(id);
    }

    
    @Override
    public List<DeliveryServices> queryAllByLimit(int offset, int limit) {
        return this.deliveryServicesMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(DeliveryServices deliveryServices) {
        return this.deliveryServicesMapper.insert(deliveryServices) != 0;
    }

    
    @Override
    public boolean update(DeliveryServices deliveryServices) {
        return this.deliveryServicesMapper.update(deliveryServices) != 0;
    }

    
    @Override
    public boolean deleteById(String id) {
        return this.deliveryServicesMapper.deleteById(id) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<DeliveryServices> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<DeliveryServices> models = deliveryServicesMapper.queryAll((DeliveryServices) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

    @Override
    public boolean manage(DeliveryServices deliveryServices) {
        return this.deliveryServicesMapper.manage(deliveryServices) != 0;
    }

}
