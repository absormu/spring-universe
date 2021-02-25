package com.subrutin.spring.core.xml.repository.impl;

import com.subrutin.spring.core.xml.domain.Account;
import com.subrutin.spring.core.xml.repository.AccountRepository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository {

    private Map<Long, Account> accountMap = new HashMap<Long, Account>();
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setAccountNumber("001");
        account1.setBalance(new BigDecimal(100000));
        account1.setName("Absor");

        Account account2 = new Account();
        account2.setId(2L);
        account2.setAccountNumber("002");
        account2.setBalance(new BigDecimal(200000));
        account2.setName("Ulil");
    }

    @Override
    public void update(Account account) {
            accountMap.put(account.getId(), account);
    }

    @Override
    public Account find(Long id) {
        return accountMap.get(id);
    }
}
