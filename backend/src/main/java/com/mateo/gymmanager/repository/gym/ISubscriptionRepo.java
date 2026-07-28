package com.mateo.gymmanager.repository.gym;

import com.mateo.gymmanager.entity.gym.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubscriptionRepo extends JpaRepository<Subscription, Long> {
}
