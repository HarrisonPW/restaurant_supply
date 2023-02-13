package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class WorkFor implements Serializable {
    
    private String username;

    
    private String id;

    private static final long serialVersionUID = 1L;
}