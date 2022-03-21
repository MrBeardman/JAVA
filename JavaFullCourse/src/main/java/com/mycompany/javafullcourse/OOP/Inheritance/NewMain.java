/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Inheritance;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inheritance =   the process where one class acquiers,
        //                  the atribuets and methods of another.

        Car car = new Car();
        Bycicle bycicle = new Bycicle();
        car.go();
        bycicle.stop();
        
        System.out.println(car.speed);
        System.out.println(bycicle.speed);
        System.out.println(car.doors);
        System.out.println(bycicle.pedals);
}
}
