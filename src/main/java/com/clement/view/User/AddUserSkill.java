package com.clement.view.User;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.*;

import com.clement.controller.UserController;
import com.clement.model.User;

public class AddUserSkill {
		
		JFrame frame = new JFrame("ADD/UPDATE SKILL");
		UserController usercontroller;
		
		AddUserSkill(User user) throws ClassNotFoundException, SQLException {
						
			
			JTextField tSkill=new JTextField("ENTER SKILLS");
			tSkill.setBounds(100, 30, 200, 30);
			frame.add(tSkill);
			tSkill.addFocusListener(new FocusListener() {

				@Override
				public void focusGained(FocusEvent e) {
					if(tSkill.getText().equals("ENTER SKILLS")) {
					tSkill.setText("");}
				}

				@Override
				public void focusLost(FocusEvent e) {
					if(tSkill.getText().equals("")) {
					tSkill.setText("ENTER SKILLS");}
				}

			});

			
			
						
			JButton bSubmit=new JButton("SUBMIT");
			bSubmit.setBounds(100, 70, 200, 30);
			frame.add(bSubmit);
			usercontroller=new UserController();
			bSubmit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String UID,SN;
					UID = user.getUserId();	
					SN=tSkill.getText();
					usercontroller.addUserSkill(UID , SN);		
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
