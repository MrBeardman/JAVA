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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Encapsulation  =  attributes of a class will be hidden or private,
        //                   Can be accessed only trough methods (getters &setters)
        //                   You should make attributes private if you don't have a reason to make them public/protected.
        Car car = new Car("CHevrolet","Camaro",1955);
        
        
        
        car.setYear(2022);
        
        System.out.println(car.getMake());
        System.out.println(car.getYear());
        System.out.println(car.getModel());
    }
    
}
