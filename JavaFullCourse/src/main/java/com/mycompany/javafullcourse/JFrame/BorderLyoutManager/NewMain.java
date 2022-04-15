/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.BorderLyoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
        //Layout Manager = Defines the natural layout for components within a container

        //3 common managers 
        //Border Layout = A BorderLayout places components in five areas: NORTH,SOUTHWEST,EAST
        //ALL EXTRA SPACE IS PLACED IN THE CENTER AREA
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10)); //NUMBER ADD MARGINS

        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel pane12 = new JPanel();
        JPanel pane13 = new JPanel();
        JPanel pane14 = new JPanel();
        JPanel pane15 = new JPanel();

        panel1.setBackground(Color.red);
        pane12.setBackground(Color.green);
        pane13.setBackground(Color.yellow);
        pane14.setBackground(Color.magenta);
        pane15.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        pane12.setPreferredSize(new Dimension(100, 100));
        pane13.setPreferredSize(new Dimension(100, 100));
        pane14.setPreferredSize(new Dimension(100, 100));
        pane15.setPreferredSize(new Dimension(100, 100));

        /*----------SUB PANELS-------------*/
        JPanel panel6 = new JPanel();
        JPanel pane17 = new JPanel();
        JPanel pane18 = new JPanel();
        JPanel pane19 = new JPanel();
        JPanel pane110 = new JPanel();

        panel6.setBackground(Color.black);
        pane17.setBackground(Color.darkGray);
        pane18.setBackground(Color.gray);
        pane19.setBackground(Color.lightGray);
        pane110.setBackground(Color.white);

        pane15.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50, 50));
        pane17.setPreferredSize(new Dimension(50, 50));
        pane18.setPreferredSize(new Dimension(50, 50));
        pane19.setPreferredSize(new Dimension(50, 50));
        pane110.setPreferredSize(new Dimension(50, 50));

        pane15.add(panel6, BorderLayout.NORTH);
        pane15.add(pane17, BorderLayout.SOUTH);
        pane15.add(pane18, BorderLayout.WEST);
        pane15.add(pane19, BorderLayout.EAST);
        pane15.add(pane110, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(pane12, BorderLayout.WEST);
        frame.add(pane13, BorderLayout.EAST);
        frame.add(pane14, BorderLayout.SOUTH);
        frame.add(pane15, BorderLayout.CENTER);
    }

}
