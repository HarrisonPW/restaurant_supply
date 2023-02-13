package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.model.DisplayLocationView;
import com.example.restaurantsupply.mapper.DisplayLocationViewMapper;
import com.example.restaurantsupply.service.DisplayLocationViewService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

/**
 * (DisplayLocationView)表服务实现类
 *
 * @author 
 */
@Service("displayLocationViewService")
public class DisplayLocationViewServiceImpl implements DisplayLocationViewService {
    @Autowired
    private DisplayLocationViewMapper displayLocationViewMapper;
    /**
     * 通过条件查询数据
     *
     * @param params 参数
     * @return 结果集
     */
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<DisplayLocationView> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<DisplayLocationView> models = displayLocationViewMapper.queryAll((DisplayLocationView) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }
    
}
