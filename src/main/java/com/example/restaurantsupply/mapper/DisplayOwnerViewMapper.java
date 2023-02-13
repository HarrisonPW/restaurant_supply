package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.model.DisplayOwnerView;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DisplayOwnerView)表数据库访问层
 *
 * @author 
 */
public interface DisplayOwnerViewMapper {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param displayOwnerView 实例对象
     * @return 对象列表
     */
    List<DisplayOwnerView> queryAll(DisplayOwnerView displayOwnerView);

 
}
