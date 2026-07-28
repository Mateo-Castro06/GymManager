package com.mateo.gymmanager.repository.gym;

import com.mateo.gymmanager.entity.gym.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGymRepo extends JpaRepository<Gym, Long> {
}
