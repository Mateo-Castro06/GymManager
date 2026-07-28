package com.mateo.gymmanager.entity.person.employee;

import com.mateo.gymmanager.entity.gym.Gym;
import com.mateo.gymmanager.entity.person.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public abstract class Employee extends Person {

    @Column(nullable = false)
    protected int salary;

    @Column(nullable = false)
    protected LocalDate hireDate;

    protected LocalDate dismissDate;


    @ManyToOne
    @JoinColumn(name = "gym_id")
    protected Gym gym;

    public abstract EmployeeRol getRole();

}
