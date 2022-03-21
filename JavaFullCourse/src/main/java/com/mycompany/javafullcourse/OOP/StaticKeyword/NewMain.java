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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //static = modifier. a signle copy of a variable/method is created and shared.
        //         The class "owns" the static member

        Friend friend1 = new Friend("Obi-Wan");
        Friend friend2 = new Friend("R2-D2");
        Friend friend3 = new Friend("Anakin");
        Friend friend4 = new Friend("Padmé");
        
         Friend.displayFriends();

         
    }
}
