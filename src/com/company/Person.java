package com.company;

public class Person {
    protected String fullName;
    protected int age;

    public Person(){}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {        return fullName;    }
    public void setFullName(String fullName) {        this.fullName = fullName;    }
    public int getAge() {        return age;    }
    public void setAge(int age) {        this.age = age;    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
