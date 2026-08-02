package com.mateo.gymmanager.dto.gym.membership.membershipplan;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateMembershipPlanRequest {

    @NotBlank
    private String name;

    @NotNull
    @Positive
    private BigDecimal price;

    @Positive
    private int durationDays;

    @NotNull
    private Boolean accessToClasses;

    @NotNull
    private Boolean personalTrainer;

    @NotNull
    private Boolean nutritionPlan;

    @NotNull
    private Boolean lockerAccess;

    @NotNull
    private Long gymId;

}
