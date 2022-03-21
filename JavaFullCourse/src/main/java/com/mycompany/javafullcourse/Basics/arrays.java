/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
public class arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARRAYS
		//store multiple values in a single variable
		String[] cars0 = {"Camaro", "Corvette", "Tesla"};//STARTS WITH 0

		cars0[0] = "Mustang";
		System.out.println(cars0[2]);
		
		//different way to declare an array

		String[] cars1 = new String[3];

		cars1[0] = "Camaro";
		cars1[1] = "Corvette";
		cars1[2] = "Tesla";

		for (int i = 0; i < cars1.length; i++) {
			System.out.println(cars1[i]);
		}
		
		String[][] cars = { 
		
			{"Camaro","Corvette", "Silverado "},
			{"Mustang", "Ranger", "F-150"},
			{"Ferrari", "Lambo", "Tesla"}
	};
		for(int i=0; i<cars.length; i++){
			System.out.println();
			for(int j=0; j<cars[i].length;j++){
			System.out.print(cars[i][j]+" ");
			}
		}
    }
    
}
