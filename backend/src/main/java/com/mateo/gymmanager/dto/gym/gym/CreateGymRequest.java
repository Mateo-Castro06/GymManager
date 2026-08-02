package com.mateo.gymmanager.dto.gym.gym;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CreateGymRequest {

    @NotBlank
    private String name;

    @NotNull
    private Long ownerId;

    @NotNull
    private Long subscriptionId;
}
