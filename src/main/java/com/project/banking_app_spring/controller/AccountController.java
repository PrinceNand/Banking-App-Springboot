package com.project.banking_app_spring.controller;

import com.project.banking_app_spring.dto.AccountDto;
import com.project.banking_app_spring.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
@AllArgsConstructor
public class AccountController {

    private AccountService accountService;

    // Add Account REST API
    @PostMapping("create")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){

        AccountDto account = accountService.createAccount(accountDto);
        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    // Get Account REST API
    @GetMapping("getAccountById/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }
}
