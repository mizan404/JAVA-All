
package chapter18advancejava;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;


public class Chapter18AdvanceJava extends M{

   
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public void createGUI(){
    JFrame f = new JFrame("Low Level Events"); 
    Toolkit t = f.getToolkit(); 
    Dimension d = t.getScreenSize(); 
    f.setBounds(d.width/4, d.height/4, d.width/2, d.height/2);
    f.setDefaultCloseOperation(1);
    f.addMouseListener((MouseListener) this);
    f.setVisible(true);
    
    }
}
