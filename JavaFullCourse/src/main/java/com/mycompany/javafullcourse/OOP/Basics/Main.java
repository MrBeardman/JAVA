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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        
        
        //myCar1.drive();
        //myCar1.brake();
     
    }
    
}
