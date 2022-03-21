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
public class mathClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MATH CLASSES
		double x1 = 3.14;
		double y1 = -10;
		double z0 = Math.max(x1, y1);
		double z1 = Math.min(x1, y1);
		double z2 = Math.abs(y1); //absolute value
		double z3 = Math.sqrt(y1); //square root value
		double z4 = Math.round(y1); //round
		double z5 = Math.ceil(y1); //round up
		double z6 = Math.floor(y1); //round down 
		System.out.println(z1);

		double x;
		double y;
		double z;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();

		z = Math.sqrt((x * x) + (y * y));

		System.out.println("The hypotenous is : " + z);
		scanner.close();
    }
    
}
