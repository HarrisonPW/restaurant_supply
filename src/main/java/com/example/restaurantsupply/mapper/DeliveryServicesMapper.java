package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.DeliveryServices;
import com.example.restaurantsupply.param.AddServiceParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DeliveryServicesMapper {

    
    DeliveryServices queryById(String id);

    
    List<DeliveryServices> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<DeliveryServices> queryAll(DeliveryServices deliveryServices);

    
    int insert(DeliveryServices deliveryServices);

    
    int update(DeliveryServices deliveryServices);

    
    int deleteById(String id);

    int manage(DeliveryServices deliveryServices);

}
