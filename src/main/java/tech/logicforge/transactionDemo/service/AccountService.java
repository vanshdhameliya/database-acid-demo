package tech.logicforge.transactionDemo.service;

import tech.logicforge.transactionDemo.entity.Account;
import tech.logicforge.transactionDemo.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Account account) {
        accountRepository.save(account);
    }
}
