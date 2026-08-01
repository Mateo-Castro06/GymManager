package com.mateo.gymmanager.dto.person.employee;

import com.mateo.gymmanager.entity.person.employee.EmployeeRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CreateEmployeeRequest {
    @NotBlank
    private String firstName;

    private String middleName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String dni;

    @NotNull
    private LocalDate birthDate;

    @NotNull
    private LocalDate hireDate;

    @NotNull
    private Integer salary;

    private LocalDate dismissDate;

    @NotNull
    private Long gymId;

    @NotNull
    private EmployeeRole role;
}
