package com.directi.training.srp.exercise;


public class CarManager {
    private CarDatabaseHandler carDatabase = new CarDatabaseHandler();
    private CarNamesListHandler carName = new CarNamesListHandler();
    private  BestCarSelectorHandler bestCarSelector = new BestCarSelectorHandler();

    public Car getCarFromDb(final String carId) {
        return carDatabase.getFromDb(carId);
    }

    public String getCarsNames() {
        return carName.formatCarNames(carDatabase.getAllCars());
    }

    public Car getBestCar() {
        return bestCarSelector.getBestCar(carDatabase.getAllCars());
    }
}

