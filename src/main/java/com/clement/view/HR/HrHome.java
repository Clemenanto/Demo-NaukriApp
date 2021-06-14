package com.clement.view.HR;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

import com.clement.view.PME.ViewAllJob;
import com.clement.view.PME.ViewJobId;

public class HrHome {
		
	JFrame frame = new JFrame("HRA PORTAL");
	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		new HrHome();
	}

 	HrHome() throws ClassNotFoundException, SQLException{
 		
	JLabel lTitle = new JLabel("WELCOME TO HR PORTAL");
	lTitle.setBounds(100, 30, 200, 30);
	lTitle.setForeground(Color.cyan);
	frame.add(lTitle); 
	
	
	JButton bActivateJob = new JButton("ACTIVATE JOB");
	bActivateJob.setBounds(100,250,200,30);
	frame.add(bActivateJob);
	bActivateJob.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {				 
				new ActivateJob();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });
	
	JButton bDeactivateJob = new JButton("DEACTIVATE JOB");
	bDeactivateJob.setBounds(100,295,200,30);
	frame.add(bDeactivateJob);
	bDeactivateJob.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {
				new DeactivateJob();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });
	
	JButton bViewAllUsers = new JButton("VIEW ALL USERS");
	bViewAllUsers.setBounds(100,115,200,30);
	frame.add(bViewAllUsers);    
	bViewAllUsers.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {
				new ViewAllUsers();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });
	
	JButton bViewUser = new JButton("VIEW USER");
	bViewUser.setBounds(100,70,200,30);
	frame.add(bViewUser);
	bViewUser.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {
				new ViewUser();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });
	
	
	JButton bViewJob = new JButton("VIEW JOB");
	bViewJob.setBounds(100,160,200,30);
	frame.add(bViewJob);
	bViewJob.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {
				new ViewJobId();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });
	
	JButton bViewAllJob = new JButton("VIEW ALL JOB");
	bViewAllJob.setBounds(100,205,200,30);
	frame.add(bViewAllJob);
	bViewAllJob.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {
				new ViewAllJob();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });

	
	JButton bDelete = new JButton("DELETE USER");
	bDelete.setBounds(100,340,200,30);
	frame.add(bDelete);
	bDelete.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {
				new DeleteUser();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });	
	
	
	JButton bRequest = new JButton("VIEW ALL REQUEST");
	bRequest.setBounds(100,385,200,30);
	frame.add(bRequest);
	bRequest.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {			 
			 try {
				new Request();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 		 }
	 });	
	

	
	JButton bLogout = new JButton("LOGOUT");
	bLogout.setBounds(100,430,200,30);
	frame.add(bLogout);
	bLogout.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 try {
				new AdminLogin();
				frame.dispose();
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
		 }
	 });
	
	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(480,80,420,600);
	frame.getContentPane().setBackground(Color.gray);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setResizable(false);
	}
		
}
	

