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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // super = keyword refers to the superclass(parent) of an object
        //         very similar to "this" keyword that specifies the class that contains "this"
        
        Hero hero1 = new Hero("Batman",43,"$$$");
        Hero hero2 = new Hero("SuperMan",38,"everything");
        
        System.out.println(hero2.toString());
      
    }
    
}
