package com.mizan;

import java.awt.EventQueue;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class menu {

	private JFrame frame;
	private JTextField resultField;
	//private JTextField anserField;
	//private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,sub,multiply,div,equals;
	public String sanswer=null,stemp1="",stemp2="";
	public double answer=0.0;
	public boolean ss=true,dec=false;
	public char operation;
	private JTextField num1;
	private JTextField num2;
	private JTextField OpField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String piku=".3";
					System.out.println(Double.parseDouble(piku)+1.0);
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//menu obj = new menu();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 651, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="1";resultField.setText(stemp1);}
				else {stemp2+="1";resultField.setText(stemp2);}
			}
		});
		button1.setBounds(45, 140, 115, 25);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="2";resultField.setText(stemp1);}
				else {stemp2+="2";resultField.setText(stemp2);}
			}
		});
		button2.setBounds(185, 140, 115, 25);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="3";resultField.setText(stemp1);}
				else {stemp2+="3";resultField.setText(stemp2);}
			}
		});
		button3.setBounds(320, 140, 115, 25);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="4";resultField.setText(stemp1);}
				else {stemp2+="4";resultField.setText(stemp2);}
			}
		});
		button4.setBounds(45, 180, 117, 25);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="5";resultField.setText(stemp1);}
				else {stemp2+="5";resultField.setText(stemp2);}
			}
		});
		button5.setBounds(185, 180, 115, 25);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="6";resultField.setText(stemp1);}
				else {stemp2+="6";resultField.setText(stemp2);}
			}
		});
		button6.setBounds(320, 180, 115, 25);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="7";resultField.setText(stemp1);}
				else {stemp2+="7";resultField.setText(stemp2);}
			}
		});
		button7.setBounds(45, 217, 117, 25);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="8";resultField.setText(stemp1);}
				else {stemp2+="8";resultField.setText(stemp2);}
			}
		});
		button8.setBounds(185, 217, 117, 25);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="9";resultField.setText(stemp1);}
				else {stemp2+="9";resultField.setText(stemp2);}
			}
		});
		button9.setBounds(320, 217, 117, 25);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="0";resultField.setText(stemp1);
				//if(stemp2=="")num1.setText("num1 : "+stemp1);
				}
				else {stemp2+="0";resultField.setText(stemp2);
				//if(stemp1!="")num2.setText("num2 : "+stemp2);
				}
			}
		});
		button0.setBounds(183, 254, 117, 25);
		frame.getContentPane().add(button0);
		
		/*JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});*/
		JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss && dec==false){stemp1+=".";resultField.setText(stemp1);
				dec=true;
				//if(stemp2=="")num1.setText("num1 : "+stemp1);
				}
				else if(dec==false) {stemp2+=".";resultField.setText(stemp2);dec=true;
				//if(stemp1!="")num2.setText("num2 : "+stemp2);
				}
			}
		});
		buttonDecimal.setBounds(320, 254, 117, 25);
		frame.getContentPane().add(buttonDecimal);
		
		
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss==true && stemp1!=""){ss=false;resultField.setText("");
				//if(stemp2=="")num1.setText("num1 : "+stemp1);
				dec=false;
				}
				if(ss==false)operation='+';
				//if(stemp1!="")num2.setText("num2 : "+stemp2);
			}
		});
		buttonAdd.setBounds(45, 304, 117, 25);
		frame.getContentPane().add(buttonAdd);
		
		JButton buttonSub = new JButton("-");
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss==true && stemp1!=""){ss=false;resultField.setText("");
				//if(stemp2=="")num1.setText("num1 : "+stemp1);
				dec=false;
				}
				if(ss==false)operation='-';
				//if(stemp1!="")num2.setText("num2 : "+stemp2);
			}
		});
		buttonSub.setBounds(185, 304, 117, 25);
		frame.getContentPane().add(buttonSub);
		
		JButton buttonMul = new JButton("*");
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ss==true && stemp1!=""){ss=false;resultField.setText("");
				//if(stemp2=="")num1.setText("num1 : "+stemp1);
				dec=false;
				}
				if(ss==false)operation='*';
				//if(stemp1!="")num2.setText("num2 : "+stemp2);
			}
		});
		buttonMul.setBounds(318, 304, 117, 25);
		frame.getContentPane().add(buttonMul);
		
		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ss==true && stemp1!=""){ss=false;resultField.setText("");
				//if(stemp2=="")num1.setText("num1 : "+stemp1);
				dec=false;
				}
				if(ss==false)operation='/';
				//if(stemp1!="")num2.setText("num2 :"+stemp2);
			}
		});
		buttonDiv.setBounds(469, 304, 117, 25);
		frame.getContentPane().add(buttonDiv);
		
		JButton buttonEq = new JButton("=");
		buttonEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss==false && stemp1!="" && stemp2!=""){
					ss=true;dec=false;
					if(stemp1.lastIndexOf(".")==stemp1.length()-1){
						stemp1=stemp1.substring(0,stemp1.length()-1);
						if(stemp1.length()<=0)stemp1="0";
					}
					if(stemp2.lastIndexOf(".")==stemp2.length()-1){
						stemp2=stemp2.substring(0,stemp2.length()-1);
						if(stemp2.length()<=0)stemp2="0";
					}
					stemp1.replaceAll("^0+", "");
					stemp2.replaceAll("^0+", "");
					num1.setText("num1 : "+stemp1);
					num2.setText("num2 : "+stemp2);
					OpField.setText("         "+Character.toString(operation));
					if(operation=='+')
						resultField.setText(Double.toString
							(Double.parseDouble(stemp1)+Double.parseDouble(stemp2)));
					else if(operation=='-')
						resultField.setText(Double.toString
								(Double.parseDouble(stemp1)-Double.parseDouble(stemp2)));
					else if(operation=='*')
						resultField.setText(Double.toString
								(Double.parseDouble(stemp1)*Double.parseDouble(stemp2)));
					else if(operation=='/'){
						if(Double.parseDouble(stemp2)==0.0){
							JOptionPane.showMessageDialog(null, "Can't divide by zero, can you?");
						}else{
						resultField.setText(Double.toString
								(Double.parseDouble(stemp1)/Double.parseDouble(stemp2)));
						}
						}
				stemp1="";stemp2="";operation='a';
				}
			}
		});
		buttonEq.setBounds(497, 180, 117, 25);
		frame.getContentPane().add(buttonEq);
		
		resultField = new JTextField();
		resultField.setFont(new Font("Accanthis ADF Std", Font.BOLD, 15));
		resultField.setEditable(false);
		resultField.setBounds(46, 36, 389, 66);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);
		
		
		
		JButton buttonX = new JButton("X");
		buttonX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){
					if(stemp1!=""){
						stemp1=stemp1.substring(0,stemp1.length()-1);
						if(stemp1.lastIndexOf(".")!=-1)dec=true;else dec=false;
					}
					if(stemp1.length()<=0){stemp1="";dec=false;}
					resultField.setText(stemp1);
					if(stemp1=="" && stemp2==""){resultField.setText("0.0");}
					//if(stemp2=="")num1.setText("num1 : "+stemp1);
				}
				else{
					if(stemp1.length()<=0)ss=true;
					else{
					if(stemp2!=""){
						stemp2=stemp2.substring(0,stemp2.length()-1);
						if(stemp2.lastIndexOf(".")!=-1)dec=true;else dec=false;
					}
					if(stemp2.length()<=0){stemp2="";dec=false;}
					//else ss=true;
					resultField.setText(stemp2);
					//if(stemp1!="")num2.setText("num2 : "+stemp2);
					}
				}
			}
		});
		buttonX.setBounds(497, 56, 117, 25);
		frame.getContentPane().add(buttonX);
		
		num1 = new JTextField();
		num1.setEditable(false);
		num1.setText("num1 : ");
		num1.setBounds(46, 13, 114, 19);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setEditable(false);
		num2.setText("num2 : ");
		num2.setBounds(321, 13, 114, 19);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		OpField = new JTextField();
		OpField.setForeground(Color.BLUE);
		OpField.setFont(new Font("Dialog", Font.BOLD, 17));
		OpField.setEditable(false);
		OpField.setBounds(186, 13, 114, 19);
		frame.getContentPane().add(OpField);
		OpField.setColumns(10);
	}
}
