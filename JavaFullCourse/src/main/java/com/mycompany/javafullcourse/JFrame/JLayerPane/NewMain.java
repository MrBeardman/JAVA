/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.JLayerPane;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author honza
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // JLyerPane = Swing container thar provides a third dimension for
        //  positioning components ex. depth, Z-Index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);
        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500); // xposition,yposition,width,height
        
        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2,Integer.valueOf(0)); //same as JLayeredPane.DEFAULT_LAYER
        layeredPane.add(label3, Integer.valueOf(2));

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.setVisible(true);
    }

}
