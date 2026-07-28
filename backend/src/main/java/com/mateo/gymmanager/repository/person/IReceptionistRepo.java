package com.mateo.gymmanager.repository.person;

import com.mateo.gymmanager.entity.person.employee.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceptionistRepo extends JpaRepository<Receptionist, Long> {
}
