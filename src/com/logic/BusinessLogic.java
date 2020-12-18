package com.logic;

import com.interfaces.IBusinessLogic;
import com.interfaces.IDataAccess;
import com.interfaces.ILogger;

public class BusinessLogic implements IBusinessLogic {

    private final ILogger logger;
    private final IDataAccess dataAccess;

    public BusinessLogic(ILogger logger, IDataAccess dataAccess) {
        this.logger = logger;
        this.dataAccess = dataAccess;
    }

    @Override
    public void processData() {
        logger.log("starting the processing of data.");
        System.out.println(" processing the data...");
        dataAccess.loadData();
        dataAccess.saveData(" -- processed info -- ");
        logger.log("finished processing of the data.");
    }
}
