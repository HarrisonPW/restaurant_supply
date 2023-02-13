package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.model.DisplayIngredientView;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DisplayIngredientView)表数据库访问层
 *
 * @author 
 */
public interface DisplayIngredientViewMapper {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param displayIngredientView 实例对象
     * @return 对象列表
     */
    List<DisplayIngredientView> queryAll(DisplayIngredientView displayIngredientView);

 
}
