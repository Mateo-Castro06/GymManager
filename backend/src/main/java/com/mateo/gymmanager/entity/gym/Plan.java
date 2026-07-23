package com.mateo.gymmanager.entity.gym;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "plan")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long planId;

    @Column(nullable = false, unique = true)
    private String planName;

    @Column(nullable = false)
    private BigDecimal monthlyPrice;

    @Column(nullable = false)
    private boolean multiBranch;

    @Column(nullable = false)
    private int maxGyms;

    @Column(nullable = false)
    private int maxEmployees;

    @Column(nullable = false)
    private int maxCustomers;

    @Column(nullable = false)
    private boolean advancedReports;

    @Column(nullable = false)
    private boolean exportToExcel; //funcionalidad para GymManager 2.0

    @Column(nullable = false)
    private boolean automaticBackups; //funcionalidad para GymManager 2.0

    @Column(nullable = false)
    private boolean prioritySupportEnabled;
}