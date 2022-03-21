/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.VariableScope;

import java.util.Random;

/**
 *
 * @author janmatyas
 */



public final class DiceRoller {
//Construktor
Random random;
int number;

    DiceRoller(){
        random = new Random();
           
            roll();
        }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
