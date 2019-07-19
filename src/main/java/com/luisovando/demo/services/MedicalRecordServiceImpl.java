package com.luisovando.demo.services;

import com.luisovando.demo.domain.models.MedicalRecord;
import com.luisovando.demo.exceptions.NotFoundException;
import com.luisovando.demo.repositories.MedicalRecordJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

  @Autowired
  private MedicalRecordJpaRepository repository;

  @Override
  public MedicalRecord findOne(int accountId) throws NotFoundException {
    return repository.findByAccountId(accountId)
        .orElseThrow(() -> new NotFoundException("El usuario no tiene ningún expediente asociado"));
  }
}
