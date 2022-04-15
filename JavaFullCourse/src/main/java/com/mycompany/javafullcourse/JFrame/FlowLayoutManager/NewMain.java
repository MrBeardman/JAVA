/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.FlowLayoutManager;

import static java.awt.Color.lightGray;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author honza
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container
        
       //  Flow Layout =    places components in a row, sized at theri preferred size
       //                   If the orizontal space in the container is too small,
       //                   The FlowLayout class uses the next avaliable row
       
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0)); //LEADING - Starting from left, CENTER, TRAILING - STICKIGN TO RIGHT. int - horizontal and vertical spacing
       frame.setVisible(true);
       
       JPanel panel = new JPanel();
       panel.setPreferredSize(new Dimension(250,250));
       panel.setBackground(lightGray);
       panel.setLayout(new FlowLayout());
       
       //JButton button1 = new JButton();
       
       //frame.add(button1);
       panel.add(new JButton("1")); //same as button 1 (declaring and then adding to panel at the same time
       panel.add(new JButton("2"));
       panel.add(new JButton("3"));
       panel.add(new JButton("4"));
       panel.add(new JButton("5"));
       panel.add(new JButton("6"));
       panel.add(new JButton("7"));
       panel.add(new JButton("8"));
       panel.add(new JButton("9"));
       
       
       frame.add(panel);
       frame.setVisible(true); //adding last othervise the elements migh not load on first frame
    }
    
}
