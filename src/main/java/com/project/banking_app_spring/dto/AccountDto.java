package com.project.banking_app_spring.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        description = "Account Dto Model Information"
)
public class AccountDto {

    @Schema(
            description = "User Account Id"
    )
    private Long id;

    @Schema(
            description = "User Account Name"
    )
    private String accountHolderName;

    @Schema(
            description = "User Account balance"
    )
    private double balance;
}
