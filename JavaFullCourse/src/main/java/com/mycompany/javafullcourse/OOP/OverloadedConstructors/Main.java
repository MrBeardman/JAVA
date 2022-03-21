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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // overloaded constructors =  Multiple constructors within a class with the same name,
        //                            but have a different parameters
        //                            name + parameters = singature
        
        
        
        //instanciate an instance of the pizza class
          Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
          
          
          System.out.println("Here are the ingredietns for your pizza");
          System.out.println(pizza.bread);
          System.out.println(pizza.sauce);
          System.out.println(pizza.cheese);
          System.out.println(pizza.topping);
    }
    
}
