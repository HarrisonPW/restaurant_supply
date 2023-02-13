package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.model.DisplayServiceView;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DisplayServiceView)表数据库访问层
 *
 * @author 
 */
public interface DisplayServiceViewMapper {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param displayServiceView 实例对象
     * @return 对象列表
     */
    List<DisplayServiceView> queryAll(DisplayServiceView displayServiceView);

 
}
