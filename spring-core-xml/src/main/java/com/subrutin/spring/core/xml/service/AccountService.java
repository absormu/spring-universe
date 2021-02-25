package com.subrutin.spring.core.xml.service;

import com.subrutin.spring.core.xml.domain.Account;

import java.math.BigDecimal;

public interface AccountService {


    public void tranferMoney(Long sourceId, Long destinationId, BigDecimal balance);

    public Account getAccount(Long id);
}
