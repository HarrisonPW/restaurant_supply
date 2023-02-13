package com.example.restaurantsupply.model;



import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (DisplayPilotView)实体类
 *
 * @author 
 */
@Data
@Accessors(chain = true)
public class DisplayPilotView implements Serializable {
    private static final long serialVersionUID = 386065955928367339L;
    
    private String username;
    
    private String licenseid;
    
    private Integer experience;
    
    private Long numDrones;
    
    private Long numLocations;


}
