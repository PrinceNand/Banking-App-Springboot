package com.project.banking_app_spring.mapper;

import com.project.banking_app_spring.dto.AccountDto;
import com.project.banking_app_spring.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){

        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }

    public static AccountDto mapToAccountDto(Account account){
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}
