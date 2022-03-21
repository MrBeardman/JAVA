/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.StaticKeyword;

/**
 *
 * @author janmatyas
 */
public class Friend {
    
    String name;
    static int nubmerOfFriends;
    
    Friend(String name){
    this.name = name;
    nubmerOfFriends++;
    }
    
    static void displayFriends(){
    System.out.println("You have "+nubmerOfFriends+" friends");
    }
}
