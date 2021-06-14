package com.clement.view.User;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import javax.swing.*;
import com.clement.controller.*;

public class UserRegistration{

	JFrame frame = new JFrame("USER REGISTERATION");
	
	private JLabel lTitle= new  JLabel("USER REGISTERATION FORM");
	private JTextField tFirstName;
	private JTextField tLastName;
	private JComboBox<String> cGender;
	String gender[] = {"Male","Female","Others"};
	private JPasswordField tPassword;
	private JPasswordField tConfirmPassword;
	private JTextField tUserId;
	private JTextField tPhoneNumber;
	private JButton bSubmit;
	public static UserController usercontroller= null;
	
	public static void main(String agrs[]) throws ClassNotFoundException, SQLException {
		new UserRegistration();
	}
	
	public UserRegistration() throws ClassNotFoundException, SQLException{
		
		lTitle.setBounds(100,50,200,30);
		lTitle.setForeground(Color.cyan);
		frame.add(lTitle);
		
		tFirstName = new JTextField("ENTER YOUR FIRST NAME");
		tFirstName.setBounds(100,100,200,30);
		frame.add(tFirstName);
		tFirstName.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tFirstName.getText().equals("ENTER YOUR FIRST NAME")) {
				tFirstName.setText("");}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tFirstName.getText().equals("")) {
				tFirstName.setText("ENTER YOUR FIRST NAME");}
			}

		});


	
		tLastName = new JTextField("ENTER YOUR LAST NAME");
		tLastName.setBounds(100,150,200,30);
		frame.add(tLastName);
		tLastName.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tLastName.getText().equals("ENTER YOUR LAST NAME")) {
				tLastName.setText("");}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tLastName.getText().equals("")) {
				tLastName.setText("ENTER YOUR LAST NAME");}
			}

		});

		cGender = new JComboBox<String>(gender);
		cGender.setBounds(100,200,200,30);
		frame.add(cGender);
		
		tPassword = new JPasswordField();
		tPassword.setEchoChar((char)0);
		tPassword.setText("ENTER PASSWORD");
		tPassword.setBounds(100,250,200,30);
		frame.add(tPassword);
		tPassword.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(new String(tPassword.getPassword()).equals("ENTER PASSWORD")) {
				tPassword.setText("");
				tPassword.setEchoChar('*');
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(new String(tPassword.getPassword()).equals("")) {
				tPassword.setText("ENTER PASSWORD");
				tPassword.setEchoChar((char)0);
				}
			}

		});


		tConfirmPassword = new JPasswordField();
		tConfirmPassword.setEchoChar((char)0);
		tConfirmPassword.setText("ENTER CONFIRM PASSWORD");
		tConfirmPassword.setBounds(100,300,200,30);
		frame.add(tConfirmPassword);
		tConfirmPassword.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(new String(tConfirmPassword.getPassword()).equals("ENTER CONFIRM PASSWORD")) {
				tConfirmPassword.setText("");}
				tConfirmPassword.setEchoChar('*');
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(new String(tConfirmPassword.getPassword()).equals("")) {
				tConfirmPassword.setText("ENTER CONFIRM PASSWORD");
				tConfirmPassword.setEchoChar((char)0);
				}
			}

		});


		tUserId = new JTextField("ENTER USER ID");
		tUserId.setBounds(100,350,200,30);
		frame.add(tUserId);
		tUserId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tUserId.getText().equals("ENTER USER ID")) {
				tUserId.setText("");}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tUserId.getText().equals("")) {
				tUserId.setText("ENTER USER ID");}
			}

		});


		tPhoneNumber = new JTextField("ENTER PHONE NUMBER");
		tPhoneNumber.setBounds(100,400,200,30);
		frame.add(tPhoneNumber);
		tPhoneNumber.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tPhoneNumber.getText().equals("ENTER PHONE NUMBER")) {
				tPhoneNumber.setText("");}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tPhoneNumber.getText().equals("")) {
				tPhoneNumber.setText("ENTER PHONE NUMBER");}
			}

		});

		
		bSubmit = new JButton("SUBMIT");
		bSubmit.setBounds(100,450,200,30);
		frame.add(bSubmit);
		usercontroller = new UserController();
		bSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String UID, UFN, ULN, UP, UCP, UG, UPN;
				UID=tUserId.getText();
				UFN=tFirstName.getText();
				ULN=tLastName.getText();
				UP=new String(tPassword.getPassword());
				UG=cGender.getSelectedItem().toString();
				UPN=tPhoneNumber.getText();
				UCP=new String(tConfirmPassword.getPassword());
				

				if(UP.equals(UCP))
				{
					usercontroller.addUser(UID, UFN, ULN, UP, UPN, UG);							
					try {
						frame.dispose();
						new UserLogin();
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}

				}else {
					JOptionPane.showMessageDialog(frame, "Mismatch in Password and ConfirmPassword");
				}
			}
		});
		
		JButton bUserLogin = new JButton("USER LOGIN");
		bUserLogin.setBounds(100,500, 200, 30);
		frame.add(bUserLogin);
		bUserLogin.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 frame.dispose();
				 try {
					new UserLogin();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			 }
				 	 });

		
				
		frame.setBounds(480,80,420,600);
		frame.getContentPane().setBackground(Color.gray);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
}		
