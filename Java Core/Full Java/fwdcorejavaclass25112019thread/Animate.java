package threadnew;

import javax.swing.*;
import java.awt.*;

public class Animate extends JFrame {

    private JLabel banner = null;
    private String bannername = "This is a sample text ";
    int i = 0, count = bannername.length();

    public Animate() {
        super("Banner Using Threads In Java");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        banner = new JLabel("Default");
        banner.setFont(new Font("Georgia", Font.BOLD, 24));
        add(banner);
        animateBanner();
    }

    public void animateBanner() {
        Thread t = new Thread() {

            public void run() {
                while (i < count) {
                    banner.setText(bannername.substring(0, i));
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    if (i == count - 1) {
                        i = 0;
                    } else {
                        i++;
                    }
                }
            }
        };
        t.start();
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new Animate().setVisible(true);
            }
        });
    }
}