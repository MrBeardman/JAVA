/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafullcourse.OOP.AccessModifiers.package2;
import com.mycompany.javafullcourse.OOP.AccessModifiers.package1.*;
/**
 *
 * @author janmatyas
 */
public class C {
    
    private String privateMessage = "This is private"; //Visible only to a class itself
    public String publicMessage = "This is a public message"; //visible everywhere
    protected String protectedtMessage = "This is protected"; //Visible to a class and a  sublcass 
    String defaultMessage = "This is the default";
    
}
