package Home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class form_insertinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
public static JTextField textField_3;
	public static  JTextField textField_4;
	public static JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
public static JComboBox comboBox;
	/**
	 * Launch the application.
	 */
String c;
int t;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				form_insertinfo frame = new form_insertinfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form_insertinfo() {
		
	
		JRadioButton rdbtnCommercial = new JRadioButton("Male");
		rdbtnCommercial.setBackground(SystemColor.activeCaption);
		rdbtnCommercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			c="Male";
			t=1;
			
			}
		});
		buttonGroup.add(rdbtnCommercial);
		contentPane.add(rdbtnCommercial);
		
		JRadioButton rdbtnHome = new JRadioButton("Female");
		rdbtnHome.setBackground(SystemColor.activeCaption);
		rdbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			c="Female";
		t=0;
			}
		});
		buttonGroup.add(rdbtnHome);
		contentPane.add(rdbtnHome);
		
		JButton btnInsertRecord = new JButton("Admission");
		btnInsertRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				information obj=new information();
				obj.insert(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText());
			}
		});
	}}