package com.example;

import java.util.ArrayList;

public class Person {
    private int age;
    private String sex;
    private double height;
    private String name;
    private double weight;

    public Person(int age, String sex, double height, String name, double weight) {
        this.age=age;
        this.sex=sex;
        this.height=height;
        this.name=name;
        this.weight=weight;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex(){
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }    

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}
