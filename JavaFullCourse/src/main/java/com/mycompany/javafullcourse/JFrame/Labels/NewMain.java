/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.Labels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // JLabel = a GUI display area for string of text, an image, or both

        JLabel label = new JLabel(); //create a label
        label.setText("WHAZUUUP"); //set text of label

        Border border = BorderFactory.createLineBorder(Color.green, 3);
        ImageIcon image = new ImageIcon("/Users/janmatyas/NetBeansProjects/JavaFullCourse/src/main/java/com/mycompany/javafullcourse/JFrame/Labels/parky.jpeg");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text to left,cener or right of image
        label.setVerticalTextPosition(JLabel.TOP); //set text top, center or bootom of image icon
        label.setForeground(new Color(0x00FFFF));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(25);// set gap of text to image
        label.setBackground(Color.black);
        label.setOpaque(true); //will set the color to set background color
        label.setBorder(border);// display border
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon(image) plus text
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of an icon and tet within label
        //label.setBounds(250,0,500,500); //set x,y position within frame as well as dimensions
        
        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 640);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //will resize window to exactly fit label, add after adding all other components
    }

}
