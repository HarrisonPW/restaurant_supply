package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class Locations implements Serializable {
    
    private String label;

    
    private Integer xCoord;

    
    private Integer yCoord;

    
    private Integer space;

    private static final long serialVersionUID = 1L;
}