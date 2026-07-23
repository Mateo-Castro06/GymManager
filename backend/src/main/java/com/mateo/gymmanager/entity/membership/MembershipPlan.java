package com.mateo.gymmanager.entity.membership;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "membership_plan")
public class MembershipPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long membershipPlanId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private int durationDays;

    @Column(nullable = false)
    private boolean accessToClasses;

    @Column(nullable = false)
    private boolean personalTrainer;

    @Column(nullable = false)
    private boolean nutritionPlan;

    @Column(nullable = false)
    private boolean lockerAccess;

    @Column(nullable = false)
    private boolean active; //para gymManagerV2
}