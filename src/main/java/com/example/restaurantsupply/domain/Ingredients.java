package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class Ingredients implements Serializable {
    
    private String barcode;

    
    private String iname;

    
    private Integer weight;

    private static final long serialVersionUID = 1L;
}