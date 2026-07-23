package com.mateo.gymmanager.entity.person.employee;

import com.mateo.gymmanager.entity.account.UserAccount;
import com.mateo.gymmanager.entity.gym.Gym;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "branch_manager")
public class BranchManager extends Employee {

    @OneToOne
    @JoinColumn(name = "account_id", nullable = false)
    private UserAccount account;

    @OneToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private Gym gym;
}
