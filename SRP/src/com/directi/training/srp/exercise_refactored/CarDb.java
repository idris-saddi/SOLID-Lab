package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarDb {

    private static List<Car> _carsDb = Arrays
        .asList(
            new Car("1", "Golf III", "Volkswagen"), 
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")
        );

    private static CarDb _instance = null;

    private CarDb() {}

    public static CarDb getInstance()
    {
        if (_instance == null) {
            _instance = new CarDb();
        }
        return _instance;
    }


    public List<Car> getAll()
    {
        return _carsDb;
    }

    public Car getById(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getBymModel(final String model)
    {
        return _carsDb.stream()
            .filter(car -> car.getModel().equals(model))
            .toList();
    }

    public List<Car> getByBrand(final String brand)
    {
        return _carsDb.stream()
            .filter(car -> car.getBrand().equals(brand))
            .toList();
    }

    public void addCar(final Car car)
    {
        if(getById(car.getId()) == null) {
            _carsDb.add(car);
        }
    }

    public void removeCar(final Car car)
    {
        _carsDb.remove(car);
    }

    
}
