package com.fistkim.saving.application.mapper;

import com.fistkim.saving.adapter.in.web.response.AccountResponse;
import com.fistkim.saving.adapter.out.persistence.account.AccountJpaEntity;
import com.fistkim.saving.domain.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "balance.money.value", target = "balance")
    AccountJpaEntity toJpaEntity(Account account);

    @Mapping(source = "balance", target = "balance.money.value")
    Account toDomainEntity(AccountJpaEntity accountJpaEntity);

    AccountResponse toResponse(Account account);
}
