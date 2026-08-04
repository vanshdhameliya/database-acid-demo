package tech.logicforge.transactionDemo.repository;

import tech.logicforge.transactionDemo.entity.TransferRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferRecord, Long> {
}
