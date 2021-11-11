package com.example.demospringboot.demointerceptor.exception;

public class InvalidIdException extends Exception{
    public InvalidIdException(String message) {
        super(message);
    }
}
