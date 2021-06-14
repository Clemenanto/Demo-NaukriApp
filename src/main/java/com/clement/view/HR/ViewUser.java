package com.clement.view.HR;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.*;

import com.clement.controller.UserController;



public class ViewUser{
	JFrame frame = new JFrame("VIEW USER");
	UserController usercontroller;

	ViewUser() throws ClassNotFoundException, SQLException {
		
		JTextField tUserId = new JTextField("ENTER USER ID");
		tUserId.setBounds(100, 30, 200, 30);
		frame.add(tUserId);
		tUserId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tUserId.getText().equals("ENTER USER ID")) {
					tUserId.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tUserId.getText().equals("")) {
					tUserId.setText("ENTER USER ID");
				}
			}

	    });


		
		JButton bViewUser = new JButton("VIEW USER");
		bViewUser.setBounds(100, 70, 200, 30);
		frame.add(bViewUser);
		usercontroller = new UserController();
		bViewUser.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int EID;
				EID =Integer.parseInt(tUserId.getText());
				usercontroller.viewUser(EID);
				tUserId.setText("");
			}
		});
		
		JButton bBack = new JButton("BACK");
		bBack.setBounds(100,110, 200, 30);
		frame.add(bBack);
		bBack.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 frame.dispose();
			 }
				 	 });
		
		
		frame.setBounds(480,250,420,200);
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}
}
