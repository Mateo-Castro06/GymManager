package com.mateo.gymmanager.entity.gym;

import com.mateo.gymmanager.entity.person.customer.Customer;
import com.mateo.gymmanager.entity.person.employee.BranchManager;
import com.mateo.gymmanager.entity.person.owner.Owner;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "gym")
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @OneToOne(mappedBy = "gym")
    private BranchManager branchManager;

    @OneToMany(mappedBy = "gym")
    private List<Customer> customers;

    @OneToMany(mappedBy = "gym")
    private List<Subscription> subscriptions;
}
