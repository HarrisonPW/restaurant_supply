package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.model.DisplayLocationView;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DisplayLocationView)表数据库访问层
 *
 * @author 
 */
public interface DisplayLocationViewMapper {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param displayLocationView 实例对象
     * @return 对象列表
     */
    List<DisplayLocationView> queryAll(DisplayLocationView displayLocationView);

 
}
