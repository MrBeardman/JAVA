/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Constructors;

/**
 *
 * @author janmatyas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);
         
        human2.eat();
        human1.drink();
        System.out.println(human1.name);
        System.out.println(human2.name);
    }
    
}
