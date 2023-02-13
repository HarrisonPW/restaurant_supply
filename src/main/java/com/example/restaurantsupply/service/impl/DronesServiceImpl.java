package com.example.restaurantsupply.service.impl;

import com.example.restaurantsupply.domain.Drones;
import com.example.restaurantsupply.mapper.DronesMapper;
import com.example.restaurantsupply.service.DronesService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Service("dronesService")
public class DronesServiceImpl implements DronesService {
    @Autowired
    private DronesMapper dronesMapper;

    
    @Override
    public Drones queryById(String id) {
        return this.dronesMapper.queryById(id);
    }

    
    @Override
    public List<Drones> queryAllByLimit(int offset, int limit) {
        return this.dronesMapper.queryAllByLimit(offset, limit);
    }

    
    @Override
    public boolean insert(Drones drones) {
        return this.dronesMapper.insert(drones) != 0;
    }

    
    @Override
    public boolean update(Drones drones) {
        return this.dronesMapper.update(drones) != 0;
    }

    
    @Override
    public boolean delete(String id, Integer tag) {
        return this.dronesMapper.delete(id, tag) != 0;
    }

    
    @Override
    public Map<String, Object> findAllByPage(Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>(2);
        Page<Drones> page = null;
        Object pageSize = params.get("pageSize");
        if (!Objects.isNull(pageSize)) {
            Object pageNum = params.get("pageNum");
            page = PageHelper.startPage((Integer) (Objects.isNull(pageNum) ? 1 : pageNum), (Integer) pageSize);
        }
        List<Drones> models = dronesMapper.queryAll((Drones) params.get("entity"));
        map.put("rows", models);
        map.put("count", Objects.isNull(page) ? models.size() : page.getTotal());
        return map;
    }

    @Override
    public boolean refuel(Drones drones) {
        return this.dronesMapper.refuel(drones) != 0;
    }

    @Override
    public boolean joinSwarm(Drones drones) {
        return this.dronesMapper.joinSwarm(drones) != 0;
    }

    @Override
    public boolean leaveSwarm(Drones drones) {
        return this.dronesMapper.leaveSwarm(drones) != 0;
    }

    @Override
    public boolean flyDrone(Drones drones) {
        return this.dronesMapper.flyDrone(drones) != 0;
    }

    @Override
    public boolean takeoverDrone(Drones drones) {
        return this.dronesMapper.takeoverDrone(drones) != 0;
    }

}
