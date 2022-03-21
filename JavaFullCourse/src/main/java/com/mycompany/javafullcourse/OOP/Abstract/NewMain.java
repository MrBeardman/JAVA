/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Abstract;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Abstract = astract classes cannot be instantiated, but they can have a subclass
        //            abstact methods are declared without an implementation 
        
        
        //Vehicle vehicle = new Vehicle(); Cannot be declared because its abstract
        Car car = new Car();
        car.go();
    }
    
}
