package com.integrations.dto;


import java.io.Serializable;

public class EmailDTO implements Serializable {
    private static final long serialVersion = 1L;

    private String fromEmail;
    private String fromName;
    private String replyTo;
    private String to;
    private String subject;
    private String body;
    private String contentType;

    public EmailDTO() {
    }

    public EmailDTO(String contentType, String body, String subject, String to, String replyTo, String fromName, String fromEmail) {
        this.contentType = contentType;
        this.body = body;
        this.subject = subject;
        this.to = to;
        this.replyTo = replyTo;
        this.fromName = fromName;
        this.fromEmail = fromEmail;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
