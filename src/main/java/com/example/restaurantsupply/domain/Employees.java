package com.example.restaurantsupply.domain;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


@Data
public class Employees implements Serializable {
    
    private String username;

    
    private String taxid;

    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date hired;

    
    private Integer experience;

    
    private Integer salary;

    private static final long serialVersionUID = 1L;
}