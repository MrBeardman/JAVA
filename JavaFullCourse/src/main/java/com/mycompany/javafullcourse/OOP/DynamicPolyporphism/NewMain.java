/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.DynamicPolyporphism;
import java.util.Scanner;
/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Polymorphism = many shapes/forms
        // dynamic = after compilation(during runtime)
        
        //ex. A corvette is a : corvette, and a car, and a vehicle and an object
        
        
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        
        System.out.println("What animal do you want? ");
        System.out.println("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();
        
        if(choice == 1){
        animal = new Dog();
        animal.speak();
        }
        else if (choice == 2){
        animal = new Cat();
        animal.speak();
        }
        else{
        
        animal = new Animal();
        System.out.println("That choice was invalid");
        animal.speak();
        }
    }
    
}
