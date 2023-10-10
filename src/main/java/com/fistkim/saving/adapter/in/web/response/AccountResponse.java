package com.fistkim.saving.adapter.in.web.response;

import com.fistkim.saving.domain.Balance;
import com.fistkim.saving.type.AccountType;

public record AccountResponse(
        Long id,
        Long ownerId,
        AccountType accountType,
        Balance balance) {
}
