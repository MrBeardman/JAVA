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
public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    
    public String toString(){
    
    return this.name+"\n"+ this.age + "\n";  }
}


