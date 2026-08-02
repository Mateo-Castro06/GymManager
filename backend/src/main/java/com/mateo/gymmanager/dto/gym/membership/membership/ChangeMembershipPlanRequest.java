package com.mateo.gymmanager.dto.gym.membership.membership;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChangeMembershipPlanRequest {

    @NotNull
    private Long membershipPlanId;

}
