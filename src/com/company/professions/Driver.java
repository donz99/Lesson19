package com.company.professions;

import com.company.Person;

public class Driver extends Person {
    private int exp;
    Driver(){}

    public Driver(String fullName, int age, int exp) {
        super(fullName, age);
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                '}';
    }
}
