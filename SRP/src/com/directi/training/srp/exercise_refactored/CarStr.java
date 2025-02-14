package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarStr {

    public String getAllNames(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.toString());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getUniqueBrands(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            if (sb.indexOf(car.getBrand()) == -1) {
                sb.append(car.getBrand());
                sb.append(", ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }
}
