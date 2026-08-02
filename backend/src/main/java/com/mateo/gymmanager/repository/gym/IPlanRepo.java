package com.mateo.gymmanager.repository.gym;

import com.mateo.gymmanager.entity.person.owner.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlanRepo extends JpaRepository<Plan, Long> {
}
