package excercise1;

import javax.swing.JOptionPane;

public class showMessage1 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter a number", "Title", 2);
        JOptionPane.showMessageDialog(null, name + "  Welcome ", "Title", 2);
        int m = JOptionPane.showConfirmDialog(null, "Hello World", "Title", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "U say NO");
        }
    }
}
