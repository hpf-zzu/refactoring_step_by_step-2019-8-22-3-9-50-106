package com.tws.refactoring;

public class Driver {
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //public int age;
    private int age;
    public Driver(int age) {
        this.age = age;
    }
}
