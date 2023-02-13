package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class Drones implements Serializable {
    
    private String id;

    
    private Integer tag;

    
    private Integer fuel;

    
    private Integer capacity;

    
    private Integer sales;

    
    private String flownBy;

    
    private String swarmId;

    
    private Integer swarmTag;

    
    private String hover;

    private static final long serialVersionUID = 1L;
}