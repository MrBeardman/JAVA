/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.Audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("/Users/janmatyas/NetBeansProjects/JavaFullCourse/src/main/java/com/mycompany/javafullcourse/OOP/Audio/Don't Wanna Let Myself Down (Instrumental) - NEFFEX.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = ""; // so the program wont terminate and play the song, it will wait for user inut

        while (!response.equals("Q"))
        {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.print("ENTER YOUR CHOICE: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response)
            {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> clip.close();
                default -> System.out.println("not a valid response");
            }
        }
        System.out.println("BYEEEE!");
    }

}
