package tech.logicforge.transactionDemo.repository;

import tech.logicforge.transactionDemo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
