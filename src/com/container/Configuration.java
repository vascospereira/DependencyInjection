package com.container;

import com.interfaces.IApplication;
import com.interfaces.IBusinessLogic;
import com.interfaces.IDataAccess;
import com.interfaces.ILogger;
import com.logic.BetterBusinessLogic;
import com.logic.BusinessLogic;
import com.utilities.Application;
import com.utilities.DataAccess;
import com.utilities.Logger;

public class Configuration {

    public static IBusinessLogic configureBusinessLogic(){
        return new BusinessLogic(createLogger(), createDataAccess());
        //return new BetterBusinessLogic(createLogger(), createDataAccess());
    }

    private static IDataAccess createDataAccess() {
        return new DataAccess();
    }

    private static ILogger createLogger() {
        return new Logger();
    }

    public static IApplication createApplication() {
        return new Application(configureBusinessLogic());
    }
}
