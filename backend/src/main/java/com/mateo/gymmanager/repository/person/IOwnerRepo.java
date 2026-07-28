package com.mateo.gymmanager.repository.person;

import com.mateo.gymmanager.entity.person.owner.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerRepo extends JpaRepository<Owner, Long> {
}
