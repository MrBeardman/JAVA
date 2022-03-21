/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Encapsulation;

/**
 *
 * @author janmatyas
 */
public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }

    ;
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
