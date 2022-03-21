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
public class arrayList2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2D ARRAYLIST
		//a dymanic list of lists
		//You can change the site of these lists durign runtime
		
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic break");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zuchhini");
		produceList.add("peppers");
		
		ArrayList<String>drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
			groceryList.add(produceList);
			groceryList.add(drinksList);
			
		System.out.println(groceryList.get(0).get(0));
    }
    
}
