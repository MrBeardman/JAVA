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

public class whileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //WHILE LOOP
		//Excecutes a bloc kof code as logn as its codiniton remaisn true
		Scanner scanner = new Scanner(System.in);
		String name = "";

		while (name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		System.out.println("Hello " + name);
		//Do loop, it will always run at least one and then check for codnition

		do {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		} while (name.isBlank());
		System.out.println("Hello " + name);

		//For loop 
		// executes a block of code a limited amout of times
		for (int i = 10; i >= 0; i -= 2) {// i stands for index
			System.out.println(i);
		}
		System.out.println("Happy New year");
    }
    
}
