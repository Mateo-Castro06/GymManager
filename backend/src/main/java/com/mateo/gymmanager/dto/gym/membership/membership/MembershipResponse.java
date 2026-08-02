package com.mateo.gymmanager.dto.gym.membership.membership;

import com.mateo.gymmanager.entity.gym.membership.MembershipStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MembershipResponse {
    private Long membershipId;

    private Long customerId;

    private Long membershipPlanId;

    private String membershipPlanName;

    private LocalDate startDate;

    private LocalDate endDate;

    private MembershipStatus status;
}
