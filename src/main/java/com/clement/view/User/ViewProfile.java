package com.clement.view.User;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import com.clement.model.User;

public class ViewProfile {
		
		JFrame frame = new JFrame("VIEW PROFILE");
		
		ViewProfile(User user) throws ClassNotFoundException, SQLException {
			
			
			JLabel lUserId1=new JLabel("USER ID");
			lUserId1.setBounds(60, 100, 100, 30);
			JLabel lUserId2=new JLabel(user.getUserId());
			lUserId2.setBounds(190, 100, 200, 30);
			frame.add(lUserId1);
			frame.add(lUserId2);
			lUserId1.setForeground(Color.cyan);
			lUserId2.setForeground(Color.cyan);
			
			JLabel lFirstName1=new JLabel("FIRST NAME");
			lFirstName1.setBounds(60, 150, 100, 30);
			JLabel lFirstName2=new JLabel(user.getFirstName());
			lFirstName2.setBounds(190, 150, 200, 30);
			frame.add(lFirstName1);
			frame.add(lFirstName2);
			lFirstName1.setForeground(Color.cyan);
			lFirstName2.setForeground(Color.cyan);
			
			JLabel lLastName1=new JLabel("LAST NAME");
			lLastName1.setBounds(60, 200, 100, 30);
			JLabel lLastName2=new JLabel(user.getLastName());
			lLastName2.setBounds(190, 200, 200, 30);
			frame.add(lLastName1);
			frame.add(lLastName2);
			lLastName1.setForeground(Color.cyan);
			lLastName2.setForeground(Color.cyan);
			
			JLabel lGender1=new JLabel("GENDER");
			lGender1.setBounds(60, 250, 100, 30);
			JLabel lGender2=new JLabel(user.getGender());
			lGender2.setBounds(190, 250, 200, 30);
			frame.add(lGender1);
			frame.add(lGender2);
			lGender1.setForeground(Color.cyan);
			lGender2.setForeground(Color.cyan);
			
			JLabel lPhone1=new JLabel("PHONE NUMBER");
			lPhone1.setBounds(60, 300, 100, 30);
			JLabel lPhone2=new JLabel(user.getPhoneNumber());
			lPhone2.setBounds(190,300,200,30);
			frame.add(lPhone1);
			frame.add(lPhone2);
			lPhone1.setForeground(Color.cyan);
			lPhone2.setForeground(Color.cyan);
			
			JLabel lSkill1=new JLabel("SKILL");
			lSkill1.setBounds(60, 350, 100, 30);
			JLabel lSkill2=new JLabel(user.getSkill());
			lSkill2.setBounds(190, 350, 200, 30);
			frame.add(lSkill1);
			frame.add(lSkill2);
			lSkill1.setForeground(Color.cyan);
			lSkill2.setForeground(Color.cyan);
			
			JButton bBack=new JButton("BACK");
			bBack.setBounds(190, 450, 100, 30);
			frame.add(bBack);
			bBack.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
						frame.dispose();
				}
				
			});
			
			
			frame.setBounds(480,80,420,600);
			frame.getContentPane().setBackground(Color.gray);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setResizable(false);
		}
}


