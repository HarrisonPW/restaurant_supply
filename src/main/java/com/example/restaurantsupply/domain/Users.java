package com.example.restaurantsupply.domain;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


@Data
public class Users implements Serializable {
    
    private String username;

    
    private String firstName;

    
    private String lastName;

    
    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthdate;

    private static final long serialVersionUID = 1L;
}