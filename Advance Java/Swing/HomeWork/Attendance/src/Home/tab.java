package Home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class tab extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
String c;
private final ButtonGroup buttonGroup = new ButtonGroup();
private JTextField textField_6;
public static JTextField textField_13;
public static JTextField textField_14;
public static JTextField textField_15;
public static JTextField textField_16;
public static JTextField textField_17;
public static JTextField textField_18;
public static JTextField textField_19;
public static JTextField textField_20;
public static JTextField textField_21;
public static JTextField textField_22;
public static JTextField textField_23;
public static JTextField textField_24;
public static JTextField textField_25;
public static JTextField textField_26;
private final ButtonGroup buttonGroup_1 = new ButtonGroup();
private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tab frame = new tab();
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
	public tab() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Apple\\Desktop\\download (3).jpg"));
		setTitle("Student Attendence");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 743, 627);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Fill Attendence Form", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_3.setBackground(new Color(222, 184, 135));
		panel_3.setBounds(0, 0, 751, 610);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(467, 79, 199, 20);
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(467, 110, 199, 20);
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(467, 141, 199, 20);
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(467, 172, 199, 20);
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(467, 203, 199, 20);
		textField_4.setForeground(Color.BLACK);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(467, 234, 199, 20);
		textField_5.setForeground(Color.BLACK);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_5);
		
		JButton button = new JButton("  Submit");
		button.setBounds(435, 446, 188, 34);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				information obj=new information();
				obj.insert(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText());
			}
		});
		panel_3.add(button);
		
		JLabel lblCostumerNo = new JLabel("Roll No#");
		lblCostumerNo.setBounds(139, 80, 246, 14);
		lblCostumerNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblCostumerNo);
		
		JLabel lblFullName = new JLabel("Student Name:");
		lblFullName.setBounds(139, 111, 232, 14);
		lblFullName.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblFullName);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setBounds(139, 142, 232, 14);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblClass);
		
		JLabel lblRollNo = new JLabel("Subject:");
		lblRollNo.setBounds(139, 173, 232, 14);
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblRollNo);
		
		JLabel lblAdmissionFees = new JLabel("Present:");
		lblAdmissionFees.setBounds(139, 204, 246, 14);
		lblAdmissionFees.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblAdmissionFees);
		
		JLabel lblTutionFees = new JLabel("Absent:");
		lblTutionFees.setBounds(139, 235, 246, 14);
		lblTutionFees.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblTutionFees);
		
		JLabel lblAdmissionForm = new JLabel("Attendence Form");
		lblAdmissionForm.setBounds(277, 25, 285, 28);
		lblAdmissionForm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(lblAdmissionForm);
		
		JButton button_2 = new JButton("Cancel");
		button_2.setBounds(201, 446, 155, 35);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_3.add(button_2);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Delete Attendence", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_5.setBackground(new Color(222, 184, 135));
		panel_5.setBounds(0, 0, 728, 599);
		panel_1.add(panel_5);
		
		JButton button_1 = new JButton("Delete");
		button_1.setBounds(407, 327, 89, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete obj=new delete();
				obj.delete(textField_6.getText());
			}
		});
		panel_5.setLayout(null);
		panel_5.add(button_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(407, 155, 243, 20);
		textField_6.setBackground(SystemColor.activeCaptionBorder);
		textField_6.setColumns(10);
		panel_5.add(textField_6);
		
		JLabel lblEnterRegistrationNo = new JLabel("Enter Roll  NO:");
		lblEnterRegistrationNo.setBounds(162, 152, 168, 23);
		lblEnterRegistrationNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_5.add(lblEnterRegistrationNo);
		
		JLabel lblDeleteOrder = new JLabel("Delete Attendence ");
		lblDeleteOrder.setBounds(267, 33, 422, 32);
		lblDeleteOrder.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_5.add(lblDeleteOrder);
		
		JButton button_4 = new JButton("Cancel");
		button_4.setBounds(280, 327, 89, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_5.add(button_4);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Show A", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_9.setBackground(new Color(222, 184, 135));
		panel_6.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(null);
		
		textField_13 = new JTextField();
		textField_13.setBackground(SystemColor.activeCaptionBorder);
		textField_13.setBounds(308, 68, 231, 20);
		textField_13.setColumns(10);
		panel_9.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBackground(SystemColor.activeCaptionBorder);
		textField_14.setBounds(308, 99, 231, 20);
		textField_14.setColumns(10);
		panel_9.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBackground(SystemColor.activeCaptionBorder);
		textField_15.setBounds(308, 141, 231, 20);
		textField_15.setColumns(10);
		panel_9.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBackground(SystemColor.activeCaptionBorder);
		textField_16.setBounds(308, 177, 231, 20);
		textField_16.setColumns(10);
		panel_9.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBackground(SystemColor.activeCaptionBorder);
		textField_17.setBounds(308, 218, 231, 20);
		textField_17.setColumns(10);
		panel_9.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setBackground(SystemColor.activeCaptionBorder);
		textField_18.setBounds(308, 262, 231, 20);
		textField_18.setColumns(10);
		panel_9.add(textField_18);
		
		JButton btnShow = new JButton("Show");
		btnShow.setBounds(330, 439, 142, 23);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				select obj=new select();
				obj.selection(textField_13.getText());
			}
		});
		panel_9.add(btnShow);
		
		JLabel lblRegistrationNo = new JLabel("Roll No#");
		lblRegistrationNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistrationNo.setBounds(96, 71, 130, 14);
		panel_9.add(lblRegistrationNo);
		
		JLabel lblName = new JLabel("Student Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(96, 102, 165, 14);
		panel_9.add(lblName);
		
		JLabel lblClass_1 = new JLabel("Class:");
		lblClass_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClass_1.setBounds(96, 144, 119, 14);
		panel_9.add(lblClass_1);
		
		JLabel lblRollNo_1 = new JLabel("Subject:");
		lblRollNo_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRollNo_1.setBounds(96, 179, 109, 17);
		panel_9.add(lblRollNo_1);
		
		JLabel lblAdmissionNo = new JLabel("Present:");
		lblAdmissionNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdmissionNo.setBounds(96, 221, 130, 14);
		panel_9.add(lblAdmissionNo);
		
		JLabel lblTutionFees_1 = new JLabel("Absent:");
		lblTutionFees_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTutionFees_1.setBounds(96, 264, 119, 17);
		panel_9.add(lblTutionFees_1);
		
		JButton button_8 = new JButton("Cancel");
		button_8.setBounds(159, 439, 89, 23);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_9.add(button_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(222, 184, 135));
		tabbedPane.addTab("Logout", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				form_login obj=new form_login();
				obj.setVisible(true);
			}
		});
		btnLogout.setIcon(new ImageIcon("C:\\Users\\Apple\\Desktop\\i.png"));
		btnLogout.setBackground(new Color(255, 0, 0));
		btnLogout.setBounds(153, 127, 419, 315);
		panel_4.add(btnLogout);
	}
}
