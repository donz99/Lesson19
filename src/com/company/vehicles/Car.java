package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    protected String carClass;
    protected String brand;
    protected Engine engine;
    protected Driver driver;

    public Car(){}

    public Car(String carClass, String brand, Engine engine, Driver driver) {
        this.carClass = carClass;
        this.brand = brand;
        this.engine = engine;
        this.driver = driver;
    }

    public void start(){        System.out.println("Поехали");    }
    public void stop(){        System.out.println("Останавливаемся");    }
    public void turnLeft(){        System.out.println("Повернули налево");    }
    public void turnRight(){        System.out.println("Повернули направо");    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
