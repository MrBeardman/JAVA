/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.FileWriter;
import java.io.FileWriter;
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
            // Write to a file
            
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue\nBooty");
            writer.append("\n a poem by Johny");
            writer.close();
        } catch (IOException ex)
        {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
