/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.OverloadedConstructors;

/**
 *
 * @author janmatyas
 */
public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    //Constructor
    Pizza(/* parameters*/String bread, String sauce, String cheese, String topping) {

        // to construct a pizza object (in Main class) we need 4 strings (becasue we have 4 parameters)
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    //Overloaded constructor (is same as the other one but is missing one parameter
    Pizza(/* parameters*/String bread, String sauce, String cheese) {

        // to construct a pizza object (in Main class) we need 4 strings (becasue we have 4 parameters)
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    //Overloaded constructor (is same as the other one but is missing two parameter
     Pizza(/* parameters*/String bread, String sauce) {

        // to construct a pizza object (in Main class) we need 4 strings (becasue we have 4 parameters)
        this.bread = bread;
        this.sauce = sauce;

    }
     //Overloaded constructor (is same as the other one but is missing three parameter
     Pizza(/* parameters*/String bread) {

        // to construct a pizza object (in Main class) we need 4 strings (becasue we have 4 parameters)
        this.bread = bread;
    }
}
