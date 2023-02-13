package com.example.restaurantsupply.domain;

import java.io.Serializable;
import lombok.Data;


@Data
public class Workers implements Serializable {
    
    private String username;

    private static final long serialVersionUID = 1L;
}