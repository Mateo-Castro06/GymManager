package com.mateo.gymmanager.entity.gym.membership;

import com.mateo.gymmanager.entity.gym.Gym;
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
    private Long membershipPlanId;

    @ManyToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private Gym gym;

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
    private boolean active;
}