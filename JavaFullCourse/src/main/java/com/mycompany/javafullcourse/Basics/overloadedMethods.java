/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
public class overloadedMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Overloaded Methods = method that share the same name but have different parameters
       //  method name + parameters = method signature
       
        double x = add(1.0,2.0,3.0,4.0);
        System.out.println(x);
    }
    static int add(int a , int b){
        System.out.println("This is overloeaded method #1");
        return a + b;
    }
     static int add(int a , int b, int c   ){
          System.out.println("This is overloeaded method #2");
        return a + b + c;
    }
     static int add(int a , int b, int c, int d   ){
          System.out.println("This is overloeaded method #3");
        return a + b+ c + d;
    }
     static double add(double a , double b){
        System.out.println("This is overloeaded method #4");
        return a + b;
    }
     static double add(double a , double b, double c   ){
          System.out.println("This is overloeaded method #5");
        return a + b + c;
    }
     static double add(double a , double b, double c, double d   ){
          System.out.println("This is overloeaded method #6");
        return a + b+ c + d;
    }
     
}
