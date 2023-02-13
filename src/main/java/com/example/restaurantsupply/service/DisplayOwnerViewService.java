package com.example.restaurantsupply.service;

import com.example.restaurantsupply.model.DisplayOwnerView;
import java.util.List;
import java.util.Map;

/**
 * (DisplayOwnerView)表服务接口
 *
 * @author 
 */
public interface DisplayOwnerViewService {
    /**
     * 分页查询所有数据
     *
     * @param params 分页信息及查询条件
     * @return 分页结果集
     */
    Map<String, Object> findAllByPage(Map<String, Object> params);

}

