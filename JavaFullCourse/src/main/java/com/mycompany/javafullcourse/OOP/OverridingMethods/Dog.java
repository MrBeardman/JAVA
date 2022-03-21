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
public class Dog extends Animal{
    
    @Override //Good practice to type when a method from parent variable is being veridden
    void speak(){
    System.out.println("The dog barks *woof *woof");
    
    }
}
