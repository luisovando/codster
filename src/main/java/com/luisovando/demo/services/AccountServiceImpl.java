package com.luisovando.demo.services;

import com.luisovando.demo.domain.models.Account;
import com.luisovando.demo.repositories.AccountJpaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  private AccountJpaRepository repository;

  @Override
  public boolean exists(int accountId) {
    Optional<Account> account = repository.findById(accountId);

    return account.isPresent();
  }
}
