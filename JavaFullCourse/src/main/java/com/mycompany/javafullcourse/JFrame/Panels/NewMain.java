/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // JPnael = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("parky.jpeg");
        
        JLabel label = new JLabel();
        label.setText("HI");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.add(label);
        redPanel.setLayout(new BorderLayout());
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250,0,250,250);
        
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0,250,500,250);
       
        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 640);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
        
               
    }
    
}
