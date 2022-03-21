/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.ArrayOfObjects;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Food[] refrigerator = new Food[3]; verze1

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");
        
        Food[] refrigerator = {food1,food2,food3};//verze 2
        /* verze 1
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        */
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }

}
