package com.example.restaurantsupply.model;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@Accessors(chain = true)
public class DisplayEmployeeView implements Serializable {
    private static final long serialVersionUID = -85815051190594747L;

    private String username;

    private String taxid;

    private Integer salary;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hired;

    private Integer employeeExperience;

    private String licenseid;

    private String pilotingExperience;

    private String managerStatus;


}
