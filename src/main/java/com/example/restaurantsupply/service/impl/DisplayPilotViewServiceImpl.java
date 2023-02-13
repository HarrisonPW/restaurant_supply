package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.model.DisplayPilotView;
import com.example.restaurantsupply.mapper.DisplayPilotViewMapper;
import com.example.restaurantsupply.service.DisplayPilotViewService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

/**
 * (DisplayPilotView)表服务实现类
 *
 * @author 
 */
@Service("displayPilotViewService")
public class DisplayPilotViewServiceImpl implements DisplayPilotViewService {
    @Autowired
    private DisplayPilotViewMapper displayPilotViewMapper;
    /**
     * 通过条件查询数据
     *
     * @param params 参数
     * @return 结果集
     */
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<DisplayPilotView> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<DisplayPilotView> models = displayPilotViewMapper.queryAll((DisplayPilotView) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }
    
}
