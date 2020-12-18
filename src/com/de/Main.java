package com.de;

import com.container.Configuration;
import com.interfaces.IApplication;

public class Main {

    public static void main(String[] args) {
        IApplication app = Configuration.createApplication();
        app.run();
    }
}
