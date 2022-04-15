/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.ProgressBar;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author honza
 */
public final class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100); //sets minimum and maximum

    ProgressBar() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true); //adds a procentage
        bar.setFont(new Font("MV BOLi",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        
        
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;

        while (counter<=100){
        
        bar.setValue(counter);
        try {
            Thread.sleep(30);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        counter +=1;
        }
        bar.setString("Done :)");
    }
}
