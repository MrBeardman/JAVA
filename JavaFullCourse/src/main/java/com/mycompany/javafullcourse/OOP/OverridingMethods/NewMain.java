/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.OverridingMethods;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // method verriding = Declaring a methos in a sub class,
        //                    which is already present in a parent class.
        //                    done so that a child class can give its own implementation
        
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.speak();
        dog.speak();
    }
    
}
