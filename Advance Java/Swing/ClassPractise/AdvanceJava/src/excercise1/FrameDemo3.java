package excercise1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameDemo3 extends JFrame {

    private ImageIcon icon;
    private Container c;

    FrameDemo3() {
        mizan();
    }

    public void mizan() {
        c = this.getContentPane();
        c.setBackground(Color.GREEN);
        icon = new ImageIcon(getClass().getResource("1.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        FrameDemo3 frame = new FrameDemo3();
        frame.setVisible(true);
        frame.setTitle("Being");
        frame.setBounds(500, 222, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
