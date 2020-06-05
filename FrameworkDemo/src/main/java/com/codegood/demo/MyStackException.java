package com.codegood.demo;

public class MyStackException extends RuntimeException {
    public MyStackException() {
        super();
    }

    public MyStackException(String message) {
        super(message);
    }

    public MyStackException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyStackException(Throwable cause) {
        super(cause);
    }

    protected MyStackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
