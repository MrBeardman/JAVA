/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.CreatingJFrame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // JFrame  =  a GUI window to add components to
        /*
        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("Frame"); //sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false); //prefent frame from being resizable
        frame.setSize(420,420); // sets the x-dimension and the y-dimension of frame
        frame.setVisible(true);  //make frame visible
        
        
        ImageIcon image = new ImageIcon("parky.jpeg");// create an imageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(0xFFFFF));//change color of a background
    */
            MyFrame myFrame = new MyFrame();
}
    
}
