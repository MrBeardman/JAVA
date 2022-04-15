/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.JFrame.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author honza
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // JOptionPade  =  popup a standart dialog box that promts users for value
        //                 or informs them of something
        
        //   JOptionPane.showMessageDialog(null, "This is some usseless info","Useless",JOptionPane.PLAIN_MESSAGE);
        //   JOptionPane.showMessageDialog(null, "This is some usseless info","Useless",JOptionPane.INFORMATION_MESSAGE);
        //   JOptionPane.showMessageDialog(null, "This is some usseless info","Useless",JOptionPane.QUESTION_MESSAGE);
         //  JOptionPane.showMessageDialog(null, "This is some usseless info","Useless",JOptionPane.WARNING_MESSAGE);
         //  JOptionPane.showMessageDialog(null, "This is some usseless info","Useless",JOptionPane.ERROR_MESSAGE);
        //int answer = JOptionPane.showConfirmDialog(null,"Bro","MyTitle",JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("WHAT IS YOUR name");
        //System.out.println("Hello " + name);
        String[] responses = {"you are awesome", "wtf bruh","hell yeah","whatevs"};
        ImageIcon icon = new ImageIcon("C:/home/Personal/JAVA/JavaFullCourse/src/main/java/com/mycompany/javafullcourse/JFrame/JOptionPane/PROBIO_STICKER_icon.png");
        
        JOptionPane.showOptionDialog(null, "you are awesome","secret message",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses ,0);
    }
    
}
