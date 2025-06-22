package com.yourcompany.singleton;

public class Logger {
    
    private Logger() {
        System.out.println("Logger initialized.");
    }

    public void info(String msg) {
        System.out.println("[INFO] " + msg);
    }

    public void error(String msg) {
        System.err.println("[ERROR] " + msg);
    }
}
