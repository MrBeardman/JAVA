/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
public class switchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SWITCH STATEMEN
		//statemen that allow a variable to be test for equality against a list of values
		String day = "Pizza";
		switch (day) {
			case "Sunday":
				System.err.println("It is Sunday");
				break;
			case "Monday":
				System.err.println("It is Monday");
				break;
			case "Tuesday":
				System.err.println("It is Tuesday");
				break;
			case "Wednesday":
				System.err.println("It is Wednesday");
				break;
			case "Thursday":
				System.err.println("It is Thursday");
				break;
			case "Friday":
				System.err.println("It is Friday");
				break;
			case "Saturday":
				System.err.println("It is Saturday");
				break;
			default:
				System.out.println("That is not a day");
		}
    }
    
}
