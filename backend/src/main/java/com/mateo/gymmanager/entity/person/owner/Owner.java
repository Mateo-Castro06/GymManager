package com.mateo.gymmanager.entity.person.owner;

import com.mateo.gymmanager.entity.account.UserAccount;
import com.mateo.gymmanager.entity.gym.Gym;
import com.mateo.gymmanager.entity.person.Person;
import jakarta.persistence.*;
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

    @OneToOne
    @JoinColumn(name = "account_id")
    private UserAccount account;

    @OneToMany(mappedBy = "owner")
    private List<Gym> gyms;
}
