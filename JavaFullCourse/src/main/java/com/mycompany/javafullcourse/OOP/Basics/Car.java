package com.mycompany.javafullcourse.OOP.Basics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
public class Car {

    String make = "Toyota";
    String model = "Supra";
    int year = 2020;
    String color = "blue";
    Double price = 2500000.00;

    void drive() {

        System.out.println("You drive the car");
    }

    void brake() {

        System.out.println("You stopped the car");
    }
}
