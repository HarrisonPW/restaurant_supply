package com.example.restaurantsupply.model;



import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (DisplayOwnerView)实体类
 *
 * @author 
 */
@Data
@Accessors(chain = true)
public class DisplayOwnerView implements Serializable {
    private static final long serialVersionUID = 552374877299423256L;
    
    private String username;
    
    private String firstName;
    
    private String lastName;
    
    private String address;
    
    private Long numRestaurants;
    
    private Long numPlaces;
    
    private Long highs;
    
    private Long lows;
    
    private Double debt;


}
