package com.integrations.config;

import com.integrations.services.EmailService;
import com.integrations.services.MockEmailService;
import com.integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService(){

        return new MockEmailService();
    }
}
