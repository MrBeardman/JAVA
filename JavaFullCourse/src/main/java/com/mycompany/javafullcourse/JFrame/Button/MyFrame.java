/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.Button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author janmatyas
 */
public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ImageIcon icon = new ImageIcon("download.png");
    ImageIcon image = new ImageIcon("download.png");

    MyFrame() {
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("Im a button");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.red);
        button.setBackground(Color.cyan);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 640);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);

    }

    ;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            //System.out.println("poo");
            label.setVisible(true);
        }
    }
}
