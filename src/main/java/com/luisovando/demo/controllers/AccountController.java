package com.luisovando.demo.controllers;

import com.luisovando.demo.domain.models.MedicalRecord;
import com.luisovando.demo.domain.responses.MedicalRecordResponse;
import com.luisovando.demo.exceptions.ClientNotFoundException;
import com.luisovando.demo.exceptions.NotFoundException;
import com.luisovando.demo.services.AccountService;
import com.luisovando.demo.services.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/accounts")
public class AccountController {

  @Autowired
  private AccountService accountService;

  @Autowired
  private MedicalRecordService medicalRecordService;

  @GetMapping("/{id}/record")
  public MedicalRecordResponse getRecord(@PathVariable("id") int accountId)
      throws ClientNotFoundException, NotFoundException {

    if (!accountService.exists(accountId)) {
      throw new ClientNotFoundException("El id de usuario no existe");
    }

    MedicalRecord medicalRecord = medicalRecordService.findOne(accountId);

    return MedicalRecordResponse.builder()
        .status(HttpStatus.OK)
        .statusMessage("Petición completada")
        .payload(medicalRecord).build();
  }

}
