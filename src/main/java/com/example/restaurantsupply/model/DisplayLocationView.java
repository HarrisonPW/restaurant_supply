package com.example.restaurantsupply.model;



import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (DisplayLocationView)实体类
 *
 * @author 
 */
@Data
@Accessors(chain = true)
public class DisplayLocationView implements Serializable {
    private static final long serialVersionUID = 854862716651965305L;
    
    private String label;
    
    private Integer xCoord;
    
    private Integer yCoord;
    
    private Long numRestaurants;
    
    private Long numDeliveryServices;
    
    private Long numDrones;


}
