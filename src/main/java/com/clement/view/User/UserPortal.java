package com.clement.view.User;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

import com.clement.model.User;


public class UserPortal {

	JFrame frame;
	User user;
	
	public UserPortal(User user) throws ClassNotFoundException, SQLException {
		
		frame = new JFrame("USER PORTAL");
		frame.setBounds(480,80,420,600);
		frame.getContentPane().setBackground(Color.gray);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		JLabel lTitle = new JLabel("WELCOME MR");
		lTitle.setForeground(Color.cyan);
		lTitle.setBounds(100, 50, 300, 30);
		frame.add(lTitle);

		JButton bViewProfile = new JButton("VIEW PROFILE");
		bViewProfile.setBounds(100, 100, 200, 30);
		frame.add(bViewProfile);
		bViewProfile.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ViewProfile(user);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton bUpdateProfile = new JButton("UPDATE PROFILE");
		bUpdateProfile.setBounds(100, 150, 200, 30);
		frame.add(bUpdateProfile);
		bUpdateProfile.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new UpdateProfile(user);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		JButton bAddSkill = new JButton("ADD/UPDATE SKILL");
		bAddSkill.setBounds(100, 200, 200, 30);
		frame.add(bAddSkill);
		bAddSkill.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new AddUserSkill(user);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
				
		JButton bApplyJob = new JButton("APPLY JOB");
		bApplyJob.setBounds(100, 250, 200, 30);
		frame.add(bApplyJob);
		bApplyJob.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ApplyJob(user);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton bStatus = new JButton("APPLIED STATUS");
		bStatus.setBounds(100, 300, 200, 30);
		frame.add(bStatus);
		bStatus.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Status(user);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton bLogout = new JButton("LOGOUT");
		bLogout.setBounds(100, 350, 200, 30);
		frame.add(bLogout);
		bLogout.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					new UserLogin();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
	
	}
	
	
}
