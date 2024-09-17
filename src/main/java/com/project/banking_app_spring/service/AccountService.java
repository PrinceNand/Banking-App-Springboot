package com.project.banking_app_spring.service;

import com.project.banking_app_spring.dto.AccountDto;
import com.project.banking_app_spring.entity.Account;
import lombok.AllArgsConstructor;

import java.util.List;


public interface AccountService {

    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();
}
