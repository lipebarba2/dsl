package com.integrations.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDTO {

    private  String fromEmail;
    private  String fromName;
    private  String replyTo;
    private  String to;
    private  String subject;
    private  String body;
    private  String contentType;


}
