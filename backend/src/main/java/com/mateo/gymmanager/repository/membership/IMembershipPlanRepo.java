package com.mateo.gymmanager.repository.membership;

import com.mateo.gymmanager.entity.gym.membership.MembershipPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMembershipPlanRepo extends JpaRepository<MembershipPlan, Long> {
}
