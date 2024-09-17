package com.project.banking_app_spring.service;

import com.project.banking_app_spring.dto.AccountDto;
import com.project.banking_app_spring.entity.Account;
import lombok.AllArgsConstructor;


public interface AccountService {

    AccountDto createAccount(AccountDto account);
}
