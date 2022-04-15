/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.JCheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author honza
 */
public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkbox;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkbox = new JCheckBox();
        checkbox.setText("Im not a robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 30));

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkbox.isSelected());
        }
    }

}
