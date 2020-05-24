package com.kerkro.bc.business;

public class HelloWorldBL {
    private static final String HELLO_FROM_CDI = "<h1>Hello from CDI</h1>";

    public String getMessage() {
        return HELLO_FROM_CDI;
    }
}
