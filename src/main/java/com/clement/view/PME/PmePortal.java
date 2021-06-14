package com.clement.view.PME;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import com.clement.view.HR.AdminLogin;

public class PmePortal {

	JFrame frame = new JFrame("PME PORTAL");
	JButton bAddJob, bViewAllJobs, bViewJob, bDeleteJob, bUpdateJob, bLogout;
	
	public PmePortal() throws ClassNotFoundException, SQLException{
		
		JLabel lTitle = new JLabel("WELCOME TO PME PORTAL");
		lTitle.setForeground(Color.cyan);
		lTitle.setBounds(100, 50, 300, 30);
		frame.add(lTitle);
		
		bAddJob = new JButton("ADD JOB");
		bAddJob.setBounds(100,100,200,30);
		frame.add(bAddJob);	
		bAddJob.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new AddJob();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			}
			
		});



		bDeleteJob = new JButton("DELETE JOB");
		bDeleteJob.setBounds(100,200,200,30);
		frame.add(bDeleteJob);	
		bDeleteJob.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new DeleteJob();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		
		
		bUpdateJob = new JButton("UPDATE JOB");
		bUpdateJob.setBounds(100,150,200,30);
		frame.add(bUpdateJob);
		bUpdateJob.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new UpdateJob();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			}
			
		});

		
		bViewAllJobs = new JButton("VIEW ALL JOBS");
		bViewAllJobs.setBounds(100,300,200,30);
		frame.add(bViewAllJobs);	
		bViewAllJobs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ViewAllJob();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			}
			
		});

		
		bViewJob = new JButton("VIEW JOB");
		bViewJob.setBounds(100,250,200,30);
		frame.add(bViewJob);	
		bViewJob.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ViewJobId();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			}
			
		});

		bLogout = new JButton("LOGOUT");
		bLogout.setBounds(100,350,200,30);
		frame.add(bLogout);
		bLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					new AdminLogin();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			}
			
		});

		
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.gray);
		frame.setBounds(480,80,420,600);
		frame.setVisible(true);
		frame.setResizable(false);

	}
	
	public static void main(String args[])
	{
		try {
			new PmePortal();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
