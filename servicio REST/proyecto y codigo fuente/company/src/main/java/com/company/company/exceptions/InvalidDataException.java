package com.company.company.exceptions;
public class InvalidDataException extends RuntimeException {
    private static final long serialVersionUID = 8885173172323095604L;
    public InvalidDataException(String message) {
        super(message);
    }
}