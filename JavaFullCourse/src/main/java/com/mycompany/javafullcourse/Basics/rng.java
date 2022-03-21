/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
import java.util.Random;
public class rng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GENERATE RANDOM NUMBER
		Random random = new Random();

		int x = random.nextInt(6) + 1;//adding +1 because computer starts with 0 so 6 means 0-5

		double y = random.nextDouble();

		boolean z = random.nextBoolean();
		System.out.println(z);

		//IF  STATEMENTS
		//if statement = performs a block of code if a condition evaluates to be true 
		int age = 75;

		if (age == 75)//== mean if its equal 
		{
			System.err.println("Ok Boomer!");
		} else if (age >= 18) {
			System.out.println("You are an Adlult");
		} else {
			System.err.println("You are just a kid");
		}
    }
    
}
