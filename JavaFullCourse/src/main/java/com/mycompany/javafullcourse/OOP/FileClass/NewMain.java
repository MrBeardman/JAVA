/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.FileClass;

import java.io.File;

/**
 *
 * @author janmatyas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // File = an abstract representatiot of a file and directory pathnames

        File file = new File("/Users/janmatyas/Downloads/3.png");

        if (file.exists())
        {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.delete());
        } else
        {
            System.out.println("That file doesn't exists");
        }

    }

}
