package com.project.banking_app_spring.service.implementation;

import com.project.banking_app_spring.dto.AccountDto;
import com.project.banking_app_spring.entity.Account;
import com.project.banking_app_spring.mapper.AccountMapper;
import com.project.banking_app_spring.repository.AccountRepository;
import com.project.banking_app_spring.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountServiceImplementation implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
