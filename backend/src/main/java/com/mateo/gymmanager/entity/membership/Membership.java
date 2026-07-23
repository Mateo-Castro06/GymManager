package com.mateo.gymmanager.entity.membership;

import com.mateo.gymmanager.entity.person.customer.Customer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "membership")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long membershipId;

    @ManyToOne
    @JoinColumn(name = "customer_id" ,nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "membership_plan_id",nullable = false)
    private MembershipPlan plan;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MembershipStatus status;



}
