package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class DeliveryServices implements Serializable {
    
    private String id;

    
    private String longName;

    
    private String homeBase;

    
    private String manager;

    private static final long serialVersionUID = 1L;
}