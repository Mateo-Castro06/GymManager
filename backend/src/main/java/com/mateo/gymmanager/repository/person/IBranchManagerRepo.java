package com.mateo.gymmanager.repository.person;

import com.mateo.gymmanager.entity.person.employee.BranchManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchManagerRepo extends JpaRepository<BranchManager, Long> {
}
