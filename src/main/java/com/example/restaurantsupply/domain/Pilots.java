package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class Pilots implements Serializable {
    
    private String username;

    
    private String licenseid;

    
    private Integer experience;

    private static final long serialVersionUID = 1L;
}