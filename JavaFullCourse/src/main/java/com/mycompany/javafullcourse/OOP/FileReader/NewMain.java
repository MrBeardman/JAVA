/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            // FileReader = Read the contects of a file as a stream of characters. Oney by one
            //              read() returns an int value which contains the byte value
            //              when read() retunrs -1, there is no more data to read
            
            FileReader reader = new FileReader("/Users/janmatyas/NetBeansProjects/JavaFullCourse/src/main/java/com/mycompany/javafullcourse/OOP/FileReader/art.html");
            try
            {
                int data = reader.read();
                while(data != -1){
                System.out.print((char)data);
                data = reader.read();
                }
                reader.close();
            } catch (IOException ex)
            {
                Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
