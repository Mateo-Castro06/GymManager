package com.mateo.gymmanager.repository.account;

import com.mateo.gymmanager.entity.account.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserAccountRepo extends JpaRepository<UserAccount, Long> {
}
