package com.mateo.gymmanager.dto.person.owner;

import com.mateo.gymmanager.dto.account.CreateUserAccountRequest;
import jakarta.validation.Valid;
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
public class CreateOwnerRequest {

    @NotBlank
    private String firstName;

    private String middleName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String dni;

    @NotNull
    private LocalDate birthDate;

    @Valid
    @NotBlank
    private CreateUserAccountRequest ownerAccount;
}
