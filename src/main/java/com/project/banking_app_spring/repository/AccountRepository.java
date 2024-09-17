package com.project.banking_app_spring.repository;


import com.project.banking_app_spring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
