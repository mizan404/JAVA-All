package excercise1;

import javax.swing.JFrame;

public class FrameDemo extends JFrame {
    
    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400, 300);
        frame.setBounds(500, 400, 400, 300);
        frame.setResizable(false);
        frame.setTitle("Mizan");
    }
    
}
