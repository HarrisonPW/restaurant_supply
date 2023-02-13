package com.example.restaurantsupply.model;



import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (DisplayIngredientView)实体类
 *
 * @author 
 */
@Data
@Accessors(chain = true)
public class DisplayIngredientView implements Serializable {
    private static final long serialVersionUID = 941877317315416992L;
    
    private String iname;
    
    private String hover;
    
    private Double amountAvailable;
    
    private Integer lowPrice;
    
    private Integer highPrice;


}
