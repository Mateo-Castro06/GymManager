package com.mateo.gymmanager.dto.person.employee;

import com.mateo.gymmanager.entity.person.employee.EmployeeRole;

import java.time.LocalDate;

public class EmployeeResponse {
    private Long employeeId;

    private String firstName;

    private String lastName;

    private EmployeeRole role;

    private Integer salary;

    private LocalDate hireDate;
}
