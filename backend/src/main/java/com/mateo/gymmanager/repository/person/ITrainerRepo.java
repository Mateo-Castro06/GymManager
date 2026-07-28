package com.mateo.gymmanager.repository.person;

import com.mateo.gymmanager.entity.person.employee.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainerRepo extends JpaRepository<Trainer, Long> {
}
