/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Interfaces;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //interface =  a template that can be applied to a class.
        //             similar to inheritance, but specifies what a class has/must do.
        //             classes can pply more than oen interface, inheritance is limited to 1 super class
        
        
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        rabbit.Flee();
        hawk.Hunt();
        fish.Hunt();
    }
    
}
