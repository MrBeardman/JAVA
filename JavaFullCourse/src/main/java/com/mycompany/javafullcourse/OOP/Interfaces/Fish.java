/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Interfaces;

/**
 *
 * @author janmatyas
 */
public class Fish implements Prey,Predator {

    @Override
    public void Flee() {
        System.out.println("This fish is fleeing from a bigger fish");
    }

    @Override
    public void Hunt() {
                System.out.println("This fish is hunting smaller fish");

    }
    
}
