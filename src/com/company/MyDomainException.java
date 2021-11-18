package com.company;

import java.io.IOException;

public class MyDomainException extends Exception {
    public MyDomainException(String message) {
        super(message);
    }

    public MyDomainException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDomainException(Throwable cause) {
        super(cause);
    }
}
