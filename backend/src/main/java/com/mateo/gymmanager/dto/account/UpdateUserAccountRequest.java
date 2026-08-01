package com.mateo.gymmanager.dto.account;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserAccountRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String email;
}
