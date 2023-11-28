package com.example;

public class Guest extends Person{
    private int id;
    private boolean breakfast;
    public Guest(int id, boolean breakfast, int age, String sex, double height, String name, double weight) {
        super(age, sex, height, name, weight);
        this.id= id;
        this.breakfast=breakfast;
    }
    public int getId(){
        return this.id;
    }
    public void setSex(int id) {
        this.id = id;
    }

    public boolean getBreakfast(){
        return this.breakfast;
    }
    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }
}
