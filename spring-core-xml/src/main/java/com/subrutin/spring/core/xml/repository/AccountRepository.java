package com.subrutin.spring.core.xml.repository;

import com.subrutin.spring.core.xml.domain.Account;

public interface AccountRepository {

    public void update(Account account);

    public  Account find(Long id);
}
