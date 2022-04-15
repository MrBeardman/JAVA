/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.Graphics2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author honza
 */
public class MyPanel extends JPanel {
Image image;
    MyPanel() {
        image = new ImageIcon("C:\\home\\Personal\\JAVA\\JavaFullCourse\\src\\main\\java\\com\\mycompany\\javafullcourse\\JFrame\\Graphics2D\\parky.jpeg").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        // g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0, 0, 500, 500);
        //g2D.drawRect(0, 0, 100, 200);
        //g2D.fillRect(0,0,200,200);
        //g2D.fillOval(50, 50, 100, 100); 
        g2D.drawImage(image, 0,0, null);
        g2D.setPaint(Color.red);
        g2D.fillArc(0, 0, 100, 100, 0, 180);
        g2D.setPaint(Color.white);
        g2D.fillArc(0, 0, 100, 100, 180, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        g2D.setPaint(Color.magenta);
        g2D.fillPolygon(xPoints, yPoints, 3);
         g2D.setPaint(Color.yellow);
        g2D.setFont(new Font("Ink Free",Font.BOLD,50));
        g2D.drawString("U R A Q T", 50, 50);
        

    }
}
