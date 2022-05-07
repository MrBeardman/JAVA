/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.Apps.DuelSimulator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author honza
 */
public class DuelSimulator {

    String[] fighters = {"(A)rcher","(R)ogue","(B)rawler"};
    public ArrayList<String> opponents;
    public Random random;
    DuelSimulator() {
        random = new Random();
        askQuestion();

    }  
    
    public void askQuestion() {

        while (true) {
            System.out.println("*******************************");
            System.out.println("Welcome to the duel simualtor!");
            System.out.println("Choose Your Fighter!");
            System.out.println(fighters);
            Scanner scanner = new Scanner(System.in);
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (response) {
                case 'A':
                    System.out.println("You chose Archer!");
                    Archer.Create(1, 1, 2); //make this load atributes automatically
                    Archer.Duel(10,10,10);
                    break;
                case 'R':
                    System.out.println("You chose Rogue!");
                    break;
                case 'B':
                    System.out.println("You chose Brawler!");

                default:
                    System.out.println("Not a valid answer");
            }
        }

    }
//Implement to just use one class for all fighters

    public void Duel() {
        System.out.println("Entering the arena");
        System.out.println("You encountered a Cobold"); // this should choose from an array of opponents
        System.out.println("Round 1");
        
    }
}
