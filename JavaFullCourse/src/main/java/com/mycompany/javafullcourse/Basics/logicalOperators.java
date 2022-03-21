/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
import java.util.Scanner;


public class logicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LOGICAL OEPRATORS
		// . && = (AND) both conditions must be true
		// . || = (OR) either condition must be true
		// . ! = (NOT) reverses boolean value of condition
		int temp = 25;

		if (temp > 30) {
			System.out.println("It is hot outide");
		} else if (temp >= 20 && temp <= 30) {
			System.out.println("It is warm outide");
		} else {
			System.out.println("It is cold outide");
		}

		Scanner scanner = new Scanner(System.in);

		System.out.println("Youre playing a game! press q or Q to quit");
		String response = scanner.next();

		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("You are still playing the game");
		}

    }
    
}
