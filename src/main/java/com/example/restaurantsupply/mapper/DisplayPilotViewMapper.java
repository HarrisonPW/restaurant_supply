package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.model.DisplayPilotView;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DisplayPilotView)表数据库访问层
 *
 * @author 
 */
public interface DisplayPilotViewMapper {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param displayPilotView 实例对象
     * @return 对象列表
     */
    List<DisplayPilotView> queryAll(DisplayPilotView displayPilotView);

 
}
