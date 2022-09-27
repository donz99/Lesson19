package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    int weight;

    public Lorry(){}

    public Lorry(String carClass, String brand, Engine engine, Driver driver, int weight) {
        super(carClass, brand, engine, driver);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", weight=" + weight +
                '}';
    }
}
