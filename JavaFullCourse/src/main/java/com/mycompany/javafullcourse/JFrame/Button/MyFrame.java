/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author janmatyas
 */
public class MyFrame extends JFrame implements ActionListener {
    
    JButton button;
    
     MyFrame(){
        
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(e -> System.out.println("poo"));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 640);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
    
    
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==button){
        System.out.println("poo");
        }
    }
}
