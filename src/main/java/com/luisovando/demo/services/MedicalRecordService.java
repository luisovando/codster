package com.luisovando.demo.services;

import com.luisovando.demo.domain.models.MedicalRecord;
import com.luisovando.demo.exceptions.NotFoundException;

public interface MedicalRecordService {
  MedicalRecord findOne(int accountId) throws NotFoundException;
}
