package Home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class form_delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form_delete frame = new form_delete();
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
	public form_delete() {
		setTitle("Sui Northen Gas Pipeline Limted");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete obj=new delete();
				obj.delete(textField.getText());
			}
		});
		btnDelete.setBounds(435, 327, 89, 23);
		contentPane.add(btnDelete);
		
		textField = new JTextField();
		textField.setBounds(243, 95, 243, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterConsumerNo = new JLabel("Enter Consumer  NO");
		lblEnterConsumerNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterConsumerNo.setBounds(10, 94, 136, 23);
		contentPane.add(lblEnterConsumerNo);
		
		JLabel lblThisFormIs = new JLabel("This form is for dis connection ");
		lblThisFormIs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblThisFormIs.setBounds(29, 11, 422, 32);
		contentPane.add(lblThisFormIs);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				log obj=new log();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(324, 327, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancel.setBounds(225, 327, 89, 23);
		contentPane.add(btnCancel);
	}
}
