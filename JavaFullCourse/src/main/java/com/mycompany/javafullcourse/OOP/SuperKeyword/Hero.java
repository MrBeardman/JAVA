/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.SuperKeyword;

/**
 *
 * @author janmatyas
 */
public class Hero extends Person {

    String power;

    //Constructor
    Hero(String name, int age, String power) {
        super(name, age); //calls the constructor of the Person class.  
        //"super" woudl call the class, not the constructor

        this.power = power;
        
        

    
}

    @Override
    public String toString() {

        return super.toString() + this.power;

    }
}
