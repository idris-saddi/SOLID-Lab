package com.directi.training.srp.exercise_refactored;

public class CarManager {
    private CarDb _carDb;
    private CarStr _carStr;
    private CarComp _carComp;

    public CarManager(CarDb carDb, CarStr carStr, CarComp carComp)
    {
        _carDb = carDb;
        _carStr = carStr;
        _carComp = carComp;
    }

    public String getCarsNames()
    {
        return _carStr.getAllNames(_carDb.getAll());
    }

    public String getUniqueBrands()
    {
        return _carStr.getUniqueBrands(_carDb.getAll());
    }

    public String getBestCar()
    {
        return _carComp.getBestCar(_carDb.getAll()).toString();
    }
}
