/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Polymorphism;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Polymorphism  =  greek for poly - "many", morph - "form"
        //                  The ability of an object to identify as more than one type
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        
        Vehicle[] racers = {car,bicycle,boat};
        
        for(Vehicle x : racers){
         x.go();
        
        }
    }
    
}
