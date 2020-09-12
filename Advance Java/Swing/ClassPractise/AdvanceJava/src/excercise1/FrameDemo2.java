package excercise1;

import javax.swing.JFrame;

public class FrameDemo2 extends JFrame {

    FrameDemo2() {
// Jframe call in contractor.
        setTitle("Being");
        setBounds(222, 222, 222, 222);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        FrameDemo2 frame = new FrameDemo2();
        frame.setVisible(true);

    }
}
