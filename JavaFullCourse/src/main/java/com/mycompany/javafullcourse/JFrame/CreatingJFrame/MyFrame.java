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
public class MyFrame extends JFrame {
    
    
    MyFrame(){
    
        
        this.setTitle("Frame"); //sets title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false); //prefent frame from being resizable
        this.setSize(420,420); // sets the x-dimension and the y-dimension of frame
        this.setVisible(true);  //make frame visible
        
        
        ImageIcon image = new ImageIcon("parky.jpeg");// create an imageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0xFFFFF));//change color of a background
    
    
    }
}