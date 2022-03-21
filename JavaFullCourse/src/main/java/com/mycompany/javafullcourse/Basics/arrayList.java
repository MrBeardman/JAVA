/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
import java.util.*;
public class arrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ArrayList = a resizable array
		//Elements can be added and removed after compialtion phase
		// store the reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		food.set(0, "sushi");
		food.remove(2);
		food.clear();
		for (int i=0; i<food.size(); i++){
		System.out.println(food.get(i));
		}
    }
    
}
