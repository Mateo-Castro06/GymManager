package com.mateo.gymmanager.entity.person.owner;

import com.mateo.gymmanager.entity.gym.Gym;
import com.mateo.gymmanager.entity.gym.Subscription;
import com.mateo.gymmanager.entity.person.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "owner")
public class Owner extends Person {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "owner")
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "owner")
    private List<Gym> gyms;
}
