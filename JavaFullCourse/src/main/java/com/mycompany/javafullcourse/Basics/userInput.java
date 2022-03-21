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
public class userInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //USER INPUT
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		//clean the "next line character" from before
		scanner.nextLine();

		System.out.println("Whag is yoru favourite food?");
		String food = scanner.nextLine();

		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old.");
		System.out.println("Your favourite food is " + food);
    }
    
}
