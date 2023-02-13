package com.example.restaurantsupply.model;



import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (DisplayServiceView)实体类
 *
 * @author 
 */
@Data
@Accessors(chain = true)
public class DisplayServiceView implements Serializable {
    private static final long serialVersionUID = 518924261356133265L;
    
    private String id;
    
    private String longName;
    
    private String homeBase;
    
    private String manager;
    
    private Double revenue;
    
    private Long ingredientsCarried;
    
    private Double costCarried;
    
    private Double weightCarried;


}
