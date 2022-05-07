/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.Apps.DuelSimulator;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author honza
 */
public class Archer extends Fighter {

    public int[] stats;

    static int[] Create(int healthModifier, int strenghtModifier, int dexterityModifier) {

        System.out.println("Creating new Archer");
        System.out.println("Choose a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your archers name is " + name);
        System.out.println("Rolling Stats");
        Archer archer = new Archer();
        Random random = new Random();
        int archerHealth = random.nextInt(10) + 1 * healthModifier;
        int archerStrenght = random.nextInt(10) + 1 * strenghtModifier;
        int archerDexterity = random.nextInt(10) + 1 * dexterityModifier;
        int[] stats = {archerHealth, archerStrenght, archerDexterity};
        System.out.println("Your archer has: " + archerHealth + " Health " + archerStrenght + " Strenght and " + archerDexterity + " Dexterity");

        return stats;
    }

    static void Duel(int archerHealth, int archerStrenght, int archerDexterity) {

        //Roll enemy stats
        Random random = new Random();
        Enemy.Create(1, 1, 1);

    }

}
