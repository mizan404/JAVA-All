package MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu {

    public static void getCommonMenu(JFrame f) {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newM = new JMenuItem("New");
        newM.setMnemonic('N');
        newM.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
        newM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new NewPage().setVisible(true); //To change body of generated methods, choose Tools | Templates.
            }
        });

        //To change body of generated methods, choose Tools | Templates.
        file.add(newM);
        JMenuItem openM = new JMenuItem("Open");
        openM.setMnemonic('O');
        openM.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
        openM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new OpenPage().setVisible(true);
            }
        });

        file.add(openM);

        JMenu about = new JMenu("About");
        JMenuItem M = new JMenuItem("Contact");
        about.add(M);
        jMenuBar.add(about);

        JMenu exit = new JMenu("Exit");
        jMenuBar.add(exit);
        jMenuBar.add(file);
        f.setJMenuBar(jMenuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
