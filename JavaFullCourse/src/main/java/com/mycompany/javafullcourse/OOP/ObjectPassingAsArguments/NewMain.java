/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.ObjectPassingAsArguments;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");
        
        garage.park(car1);
        garage.park(car2);
    }
    
}
