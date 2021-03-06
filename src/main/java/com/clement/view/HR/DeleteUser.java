package com.clement.view.HR;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import javax.swing.*;

import com.clement.controller.AdminController;

public class DeleteUser {
	JFrame frame = new JFrame("DELETE USER");
	AdminController admincontroller;
	
	DeleteUser() throws ClassNotFoundException, SQLException{
		
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

		
		JButton bDelete = new JButton("DELETE");
		bDelete.setBounds(100,70, 200, 30);
		frame.add(bDelete);
		admincontroller = new AdminController();
		bDelete.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent e) {			 
				 try {
					 String UID;
					 UID = tUserId.getText();
					 admincontroller.deleteUser(UID);
					 tUserId.setText("");
				} catch (Exception e1) {
					e1.printStackTrace();
				} 		 }
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
