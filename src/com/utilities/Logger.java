package com.utilities;

import com.interfaces.ILogger;

public class Logger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println(" == logging '" + msg + "'");
    }
}
