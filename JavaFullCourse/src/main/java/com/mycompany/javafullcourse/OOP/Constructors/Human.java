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
public class Human {
    
    
    String name;
    int age;
    double weight;
    
    
    //Construktor
    Human(String name, int age, double weight){
    this.name = name;
    this. age = age;
    this.weight = weight;
            
    }
    
    void eat(){
    System.out.println(this.name+ " is eating");
    }
    
     void drink(){
    System.out.println(this.name+ " is drinking *burp*");
    }
}
