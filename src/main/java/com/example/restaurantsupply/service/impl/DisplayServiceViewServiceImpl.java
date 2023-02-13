package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.model.DisplayServiceView;
import com.example.restaurantsupply.mapper.DisplayServiceViewMapper;
import com.example.restaurantsupply.service.DisplayServiceViewService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

/**
 * (DisplayServiceView)表服务实现类
 *
 * @author 
 */
@Service("displayServiceViewService")
public class DisplayServiceViewServiceImpl implements DisplayServiceViewService {
    @Autowired
    private DisplayServiceViewMapper displayServiceViewMapper;
    /**
     * 通过条件查询数据
     *
     * @param params 参数
     * @return 结果集
     */
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<DisplayServiceView> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<DisplayServiceView> models = displayServiceViewMapper.queryAll((DisplayServiceView) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }
    
}
