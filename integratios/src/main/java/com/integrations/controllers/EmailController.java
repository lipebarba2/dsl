package com.integrations.controllers;


import com.integrations.dto.EmailDTO;
import com.integrations.services.EmailService;
import com.integrations.services.SendGridEmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    private EmailService service;
    public EmailController(EmailService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto) {
        service.sendEmail(dto);
        return ResponseEntity.noContent().build();
    }
}
