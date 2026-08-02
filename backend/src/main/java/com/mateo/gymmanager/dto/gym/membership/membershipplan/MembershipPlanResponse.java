package com.mateo.gymmanager.dto.gym.membership.membershipplan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MembershipPlanResponse {

    private Long membershipPlanId;

    private String name;

    private BigDecimal price;

    private int durationDays;

    private boolean accessToClasses;

    private boolean personalTrainer;

    private boolean nutritionPlan;

    private boolean lockerAccess;

    private boolean active;
}