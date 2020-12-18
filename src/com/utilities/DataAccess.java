package com.utilities;

import com.interfaces.IDataAccess;

public class DataAccess implements IDataAccess {
    @Override
    public void loadData() {
        System.out.println("loading data...");
    }

    @Override
    public void saveData(String data) {
        System.out.println("## saving the data: " + data);
    }
}
