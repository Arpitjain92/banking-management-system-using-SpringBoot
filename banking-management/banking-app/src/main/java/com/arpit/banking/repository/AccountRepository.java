package com.arpit.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arpit.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
