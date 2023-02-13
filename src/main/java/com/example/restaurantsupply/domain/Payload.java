package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class Payload implements Serializable {
    
    private String id;

    
    private Integer tag;

    
    private String barcode;

    
    private Integer quantity;

    
    private Integer price;

    private static final long serialVersionUID = 1L;
}