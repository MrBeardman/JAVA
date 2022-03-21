/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.ToStringMethod;

/**
 *
 * @author janmatyas
 */
public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2020;

    //overide java class of toString()
    public String toString() {

        return make+"\n"+model+"\n"+color+"\n"+year;

    }
}
