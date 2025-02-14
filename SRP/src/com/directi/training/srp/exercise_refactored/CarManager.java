package com.directi.training.srp.exercise_refactored;

public class CarManager {
    private CarDb _carDb;
    private CarStr _carStr;

    public CarManager(CarDb carDb)
    {
        _carDb = carDb;
    }

    public String getCarsNames()
    {
        return _carStr.getAllNames(_carDb.getAll());
    }

    public String getUniqueBrands()
    {
        return _carStr.getUniqueBrands(_carDb.getAll());
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carDb.getAll()) {
            if (bestCar == null || car.compareTo(bestCar) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
