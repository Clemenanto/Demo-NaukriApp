package com.clement.view.HR;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.*;

import com.clement.controller.AdminController;
import com.clement.model.Admin;
import com.clement.view.PME.PmePortal;
import com.clement.view.User.*;  
	
	public class AdminLogin{
		JFrame frame= new JFrame("Admin Login");
		JLabel lTitle;
		JTextField tUserId;
	    JPasswordField tPassword;
	    JButton bLogin, bRegister, bUserLogin;
	    AdminController admincontroller;
		
	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			try {
				new AdminLogin();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	});		
}
			
		  
	public AdminLogin() throws ClassNotFoundException, SQLException{

	    
	    lTitle = new JLabel("ADMIN LOGIN");
	    lTitle.setBounds(100,100,200,30);
	    lTitle.setForeground(Color.cyan);
	    frame.add(lTitle);
	    
	    tUserId = new JTextField("USER ID");
	    tUserId.setBounds(100,150,200,30);
	    frame.add(tUserId);
	    tUserId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tUserId.getText().equals("USER ID")) {
				tUserId.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tUserId.getText().equals("")) {
				tUserId.setText("USER ID");
				}
			}

	    });
	    

	    
	    
	    
	    tPassword = new JPasswordField("PASSWORD");
	    tPassword.setEchoChar((char)0);
	    tPassword.setBounds(100,200,200,30);
	    frame.add(tPassword);
	    tPassword.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(new String(tPassword.getPassword()).equals("PASSWORD")) {
				tPassword.setText("");}
				tPassword.setEchoChar('*');
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(new String(tPassword.getPassword()).equals("")) {
				tPassword.setText("PASSWORD");
				tPassword.setEchoChar((char)0);
				}
			}

	    });

	    
	    bLogin = new JButton("LOGIN");
	    bLogin.setBounds(100,250,200,30);
	    frame.add(bLogin);
	    admincontroller = new AdminController();
	    bLogin.addActionListener(new ActionListener() {
	    
	    @Override	
	    public void actionPerformed(ActionEvent arg) {
	    	try {
	    	String UID, UP;
	    	Admin admin=new Admin();
	    	UID = tUserId.getText();
	    	UP  = new String(tPassword.getPassword());
	    	admin = admincontroller.checkLogin(UID);
	 
	    	if(admin.getPassword().equals(UP)) {
	    		if(admin.getRole().equals("HRA")) {
	    		frame.dispose();
	    		new HrHome(); }
	    		else {
	    			frame.dispose();
		    		new PmePortal();
	    		}
	    	}

	    	else {
	    			JFrame frame = new JFrame();
	    			JOptionPane.showMessageDialog(frame,"Wrong Passord or Register");} 	    		
	    }
	    catch(Exception e) {		
	   		e.printStackTrace();
	   		}
	    }
});
	    
	    
	    bUserLogin = new JButton("USER LOGIN");
	    bUserLogin.setBounds(100,300,200,30);
	    frame.add(bUserLogin);
	    bUserLogin.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent arg) {
	    		try {
	    			frame.dispose();
					new UserLogin();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	}
	    });
	    



	    
	    bRegister = new JButton("USER REGISTER");
	    bRegister.setBounds(100,350,200,30);
	    frame.add(bRegister);
	    bRegister.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent arg) {
	    		try {
	    			frame.dispose();
					new UserRegistration();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	}
	    });
	    
	      
	    frame.setBounds(480,80,420,600);
	    frame.getContentPane().setBackground(Color.gray);
	    frame.setLayout(null);  
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(false);
	}  
	
}

