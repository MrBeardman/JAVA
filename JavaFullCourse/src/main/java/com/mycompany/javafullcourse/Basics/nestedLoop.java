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
public class nestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NESTED LOOP
		//loop inside of a loop
		Scanner scanner = new Scanner(System.in);

		int rows;
		int columns;
		String symbol = "";

		System.out.println("Enter # of rows ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns ");
		columns = scanner.nextInt();

		System.out.println("Enter symbol to use ");
		symbol = scanner.next();

		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= columns; j++) {
				System.out.print(symbol);

			}

		}

    }
    
}
