/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janmatyas
 */
import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] arghs) {
    //GUI
		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your aheight"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
