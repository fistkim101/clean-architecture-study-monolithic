package com.fistkim.saving.adapter.in.web.command;

import com.fistkim.saving.type.AccountType;

public record CreateAccountCommand(
        Long ownerId,
        AccountType accountType,
        int initialMoney
) {
}
