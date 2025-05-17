package com.integrations.services;

import com.integrations.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);
}
