/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
public class printfMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Printf = an aditional method to control, fromat, and display text to the console window
        //          two arguments = format string + (object/var/value)
        //          %[flags] [precision] [widht] [conversion-character]

        // System.out.printf("%d This is a format string ",123); //replacing the format specifier (in this case %d) for the second value (in this case 123)
        boolean myBoolean = true;
        char myChar = '^';
        String myString = "John";
        int myInt = 123;
        double myDouble = 13.4;

        System.out.printf("%b This is a format string ",myBoolean);
        //System.out.printf("%c This is a format string ",myChar);
        //System.out.printf("%s This is a format string ",myString);
        //System.out.printf("%d This is a format string ",myInt);
        //System.out.printf("%f This is a format string ",myDouble);
        // [Width]
        //minimum number of characters to be written
        System.out.printf("Hello %-10s",myString);
        // [Precision]
        //sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f",myDouble);
        // [Flags]
        //adds an effect to output based on the flag added to the format specifier
        //adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : Output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers> 1000
        System.out.printf("You have this much money %,f", myDouble);
    }
}