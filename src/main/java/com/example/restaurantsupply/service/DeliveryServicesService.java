package com.example.restaurantsupply.service;

import com.example.restaurantsupply.domain.DeliveryServices;
import com.example.restaurantsupply.param.AddServiceParam;

import java.util.List;
import java.util.Map;


public interface DeliveryServicesService {

    
    DeliveryServices queryById(String id);

    
    List<DeliveryServices> queryAllByLimit(int offset, int limit);

    
    boolean insert(DeliveryServices deliveryServices);

    
    boolean update(DeliveryServices deliveryServices);

    
    boolean deleteById(String id);

    
    Map<String, Object> findAllByPage(Map<String, Object> params);

    boolean manage(DeliveryServices deliveryServices);
}

