package com.clement.view.HR;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import javax.swing.*;

import com.clement.controller.JobController;

public class DeactivateJob {
	JFrame frame = new JFrame("DEACTIVATE JOB");
	JobController jobcontroller;
	
	DeactivateJob() throws ClassNotFoundException, SQLException{
		jobcontroller = new JobController();
		
		JTextField tJobId = new JTextField("ENTER JOB ID");
		tJobId.setBounds(100, 30, 200, 30);
		frame.add(tJobId);
		tJobId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tJobId.getText().equals("ENTER JOB ID")) {
				tJobId.setText("");}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tJobId.getText().equals("")) {
				tJobId.setText("ENTER JOB ID");}
			}

		});

		
		JButton bDeactivate = new JButton("DEACTIVATE JOB");
		bDeactivate.setBounds(100,70, 200, 30);
		frame.add(bDeactivate);
		bDeactivate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int ID;
				ID=Integer.parseInt(tJobId.getText());
				jobcontroller.deactivateJob(ID);
				tJobId.setText("");
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


