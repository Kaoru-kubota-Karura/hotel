package com.example;

public class Employee extends Person{
    private String position;
    private int id;

    public Employee(String position, int id, int age, String sex, double height, String name, double weight) {
        super(age, sex, height, name, weight);
        this.position=position;
        this.id=id;
    }
    public String getPosition(){
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int getId(){
        return this.id;
    }
    public void setSex(int id) {
        this.id = id;
    }
}
