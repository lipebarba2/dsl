package com.integrations.exceptions;

public class EmailException extends RuntimeException{
    private static final long serialVersion = 1L;

    public EmailException(String msg) {
        super(msg);
    }
}
