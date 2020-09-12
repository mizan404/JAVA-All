package example3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu1 {

    public static void getCommonMenu(JFrame f) {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newDB = new JMenuItem("Dash Board");
        newDB.setMnemonic('D');
        newDB.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
        newDB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        file.add(newDB);

        JMenuItem newP = new JMenuItem("Product");
        newP.setMnemonic('P');
        newP.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_DOWN_MASK));
        newP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Product().setVisible(true);
            }
        });
        file.add(newP);
        JMenuItem newPC = new JMenuItem("Product Catagory");
        newPC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductCatagory().setVisible(true);
            }
        });
        file.add(newPC);
        JMenuItem newPur = new JMenuItem("Purchase");
        newPur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Purchase().setVisible(true);
            }
        });
        file.add(newPur);
        JMenuItem newR = new JMenuItem("Registar");
        newR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Registar().setVisible(true);
            }
        });
        file.add(newR);
        JMenuItem newRp = new JMenuItem("Report");
        newRp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Report().setVisible(true);
            }
        });
        file.add(newRp);
        JMenuItem newS = new JMenuItem("Sales");
        newS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Sales().setVisible(true);
            }
        });
        file.add(newS);
        JMenuItem newSm = new JMenuItem("Summary");
        newSm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Summary().setVisible(true);
            }
        });
        file.add(newSm);

        jMenuBar.add(file);
        f.setJMenuBar(jMenuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
