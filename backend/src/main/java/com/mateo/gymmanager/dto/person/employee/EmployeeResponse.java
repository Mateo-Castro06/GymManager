package com.mateo.gymmanager.dto.person.employee;

import com.mateo.gymmanager.entity.person.employee.EmployeeRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeResponse {
    private Long employeeId;

    private String firstName;

    private String lastName;

    private EmployeeRole role;

    private Integer salary;

    private LocalDate hireDate;
}
