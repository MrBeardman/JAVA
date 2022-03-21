/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exception = an event tha occurs during the excecution of a program that,
        //             disrupts the normal flow of the instuctions
        
        Scanner scanner = new Scanner(System.in);
        try{
       
        System.out.println("Enter a whole nubmer to divide: ");
        int x = scanner.nextInt();
        
        System.out.println("Enter a whole nubmer to divide: ");
        int y = scanner.nextInt();
        
        int z = x/y;
        
        System.out.println("result: "+ z);
        
        }
        catch(ArithmeticException e){
        System.out.println("You cant divide by zero! IDIOT!");
        }
        catch(InputMismatchException e){
        System.out.println("Please enter a number!");
        }
        catch(Exception e){
        System.out.println("Something wen wrong");//lazy, but will catch all exceptions
        }
        finally {
        System.out.println("This will always print!");
        scanner.close();
        }
    }
    
}
