package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(150,"BMW");
        Driver d1 = new Driver("Ivan Ivanov",40,15);
        Car c1 = new Car("lorry", "Volvo", e1, d1); //это агрегация!!! т.к. передали по ссылке, создали вне класса кар
        System.out.println(c1);

        final int size = 2;

        Car[] mas = new Car[size];
        Lorry l1 = new Lorry("lorry","b2",e1,d1,125);
        SportCar s1 = new SportCar("SportC","b3",e1,d1,190);
        mas[0]=l1;
        mas[1]=s1;
        Car c5 = new Lorry ("lorry2","b3",e1,d1,130);
        System.out.println(c5.toString());
    }
}
