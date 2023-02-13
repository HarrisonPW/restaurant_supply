package com.example.restaurantsupply.param;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class AddEmployeeParam {

    private String username;
    private String firstName;
    private String lastName;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdate;
    private String taxid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate hired;
    private Integer employeeExperience;
    private Integer salary;

}
