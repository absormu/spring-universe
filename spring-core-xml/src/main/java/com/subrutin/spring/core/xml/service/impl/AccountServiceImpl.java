package com.subrutin.spring.core.xml.service.impl;

import com.subrutin.spring.core.xml.domain.Account;
import com.subrutin.spring.core.xml.repository.AccountRepository;
import com.subrutin.spring.core.xml.service.AccountService;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    @Override
    public void tranferMoney(Long sourceId, Long destinationId, BigDecimal balance) {
        Account sourceAccount = accountRepository.find(sourceId);
        Account destinationAccount = accountRepository.find(destinationId);

        sourceAccount.setBalance(sourceAccount.getBalance().subtract(balance));
        destinationAccount.setBalance(destinationAccount.getBalance().add(balance));

        accountRepository.update(sourceAccount);
        accountRepository.update(destinationAccount);
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepository.find(id);
    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
