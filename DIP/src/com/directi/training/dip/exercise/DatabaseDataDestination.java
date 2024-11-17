package com.directi.training.dip.exercise;

public class DatabaseDataDestination implements DataDestinationInt {
    private final MyDatabase database;

    public DatabaseDataDestination(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String encodedData) {
        database.write(encodedData);
    }
}