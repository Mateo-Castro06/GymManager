package com.mateo.gymmanager.dto.person.customer;

import com.mateo.gymmanager.entity.person.customer.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {

    private Long customerId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String dni;

    private LocalDate birthDate;

    private Long gymId;

    private CustomerStatus status;

    private LocalDate joinDate;

    private LocalDate leaveDate;
}