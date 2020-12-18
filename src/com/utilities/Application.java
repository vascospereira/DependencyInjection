package com.utilities;

import com.interfaces.IApplication;
import com.interfaces.IBusinessLogic;

public class Application implements IApplication {
    IBusinessLogic businessLogic;

    public Application(IBusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

    @Override
    public void run(){
        businessLogic.processData();
    }
}
