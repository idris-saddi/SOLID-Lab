package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarComp {
    public Car getBestCar(List<Car> cars)
    {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.compareTo(bestCar) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
