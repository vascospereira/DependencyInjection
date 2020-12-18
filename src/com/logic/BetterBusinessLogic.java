package com.logic;

import com.interfaces.IBusinessLogic;
import com.interfaces.IDataAccess;
import com.interfaces.ILogger;

public class BetterBusinessLogic implements IBusinessLogic {

    private final ILogger logger;
    private final IDataAccess dataAccess;

    public BetterBusinessLogic(ILogger logger, IDataAccess dataAccess) {
        this.logger = logger;
        this.dataAccess = dataAccess;
    }

    @Override
    public void processData() {
        logger.log("starting the processing of data.");
        System.out.println();
        System.out.println(" processing the data...");
        System.out.println();
        dataAccess.loadData();
        System.out.println();
        dataAccess.saveData(" -- processed info -- ");
        System.out.println();
        logger.log("finished processing of the data.");
    }
}
