package com.mateo.gymmanager.repository.membership;

import com.mateo.gymmanager.entity.membership.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMembershipRepo extends JpaRepository<Membership, Long> {
}
