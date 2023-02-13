package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class Restaurants implements Serializable {
    
    private String longName;

    
    private Integer rating;

    
    private Integer spent;

    
    private String location;

    
    private String fundedBy;

    private static final long serialVersionUID = 1L;
}