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
public class forEachLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FOR EACH LOOP
        //traversign techique to iterate trough the elements in an array/collections¨
        // less steps, more readable
        //less flexible
        //String[] animals = {"cat","dog","rat","bird"};
        ArrayList<String> animals = new ArrayList<>();
        
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        
        for (String i : animals){
            System.out.println(i);
        }
 
    }
    
}
