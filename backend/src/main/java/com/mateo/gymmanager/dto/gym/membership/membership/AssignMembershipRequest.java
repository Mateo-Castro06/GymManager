package com.mateo.gymmanager.dto.gym.membership.membership;

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
public class AssignMembershipRequest {

    @NotNull
    private Long customerId;

    @NotNull
    private Long membershipPlanId;

    @NotNull
    private LocalDate startDate;
}
