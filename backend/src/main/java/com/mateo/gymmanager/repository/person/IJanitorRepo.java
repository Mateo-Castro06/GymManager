package com.mateo.gymmanager.repository.person;

import com.mateo.gymmanager.entity.person.employee.Janitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJanitorRepo extends JpaRepository<Janitor, Long> {
}
