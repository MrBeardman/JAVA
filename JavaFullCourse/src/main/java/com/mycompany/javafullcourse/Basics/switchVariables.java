/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
public class switchVariables {
        public static void main(String[] arghs){ 
            //VARIABLE SWITCH
        String x = "water";
		String y = "Kool-Aid";
		String temp;

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
        
        }
}
