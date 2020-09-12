/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18advancejava;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Students
 */
public class WindowHandler extends WindowAdapter{

    public WindowHandler() {
    }
    

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Deiconified"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("iconified"); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void createGUI(){
    JFrame f = new JFrame("Low Level Events"); 
    Toolkit t = f.getToolkit(); 
    Dimension d = t.getScreenSize(); 
    f.setBounds(d.width/4, d.height/4, d.width/2, d.height/2);
    f.setDefaultCloseOperation(1);
    f.addWindowListener(new WindowHandler());
    f.setVisible(true);
    }
}
