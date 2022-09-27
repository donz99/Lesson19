package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    int speed;

    public SportCar(){}

    public SportCar(String carClass, String brand, Engine engine, Driver driver, int speed) {
        super(carClass, brand, engine, driver);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", speed=" + speed +
                '}';
    }
}
