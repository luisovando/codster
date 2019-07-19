package com.luisovando.demo.repositories;

import com.luisovando.demo.domain.models.MedicalRecord;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordJpaRepository extends JpaRepository<MedicalRecord, Integer> {

  Optional<MedicalRecord> findByAccountId(int accountId);
}
