/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.Graphics2D;

import javax.swing.JFrame;

/**
 *
 * @author honza
 */
public class MyFrame extends JFrame {
    MyPanel panel;
    
    MyFrame(){
        
     panel = new MyPanel();   
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     this.add(panel);
     this.pack();
     this.setLocationRelativeTo(null);
     this.setVisible(true);
    
    }
    
}
