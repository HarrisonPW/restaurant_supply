package com.example.restaurantsupply.param;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class AddServiceParam {

    private String ipUsername;
    private String ipFirstName;
    private String ipLastName;
    private String ipAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ipBirthdate;
    private String ipTaxID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ipHired;
    private Integer ipEmployeeExperience;
    private Integer ipSalary;

}
