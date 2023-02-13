package com.example.restaurantsupply.mapper;

import com.example.restaurantsupply.domain.Drones;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DronesMapper {

    
    Drones queryById(String id);

    
    List<Drones> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    
    List<Drones> queryAll(Drones drones);

    
    int insert(Drones drones);

    
    int update(Drones drones);

    
    int delete(@Param("id") String id, @Param("tag") Integer tag);

    int refuel(Drones drones);

    int joinSwarm(Drones drones);

    int leaveSwarm(Drones drones);

    int flyDrone(Drones drones);

    int takeoverDrone(Drones drones);
}
