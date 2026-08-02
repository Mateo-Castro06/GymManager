package com.mateo.gymmanager.entity.person.customer;

import com.mateo.gymmanager.entity.gym.Gym;
import com.mateo.gymmanager.entity.gym.membership.Membership;
import com.mateo.gymmanager.entity.person.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer extends Person {

    @ManyToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private Gym gym;

    @OneToMany(mappedBy = "customer")
    private List<Membership> memberships;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CustomerStatus status;

    @Column(nullable = false)
    private LocalDate joinDate;

    private LocalDate leaveDate;


}
