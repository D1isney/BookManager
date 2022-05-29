package com.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class DisneyInterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisneyInterFrm frame = new DisneyInterFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DisneyInterFrm() {
		getContentPane().setBackground(Color.ORANGE);
		setClosable(true);
		setIconifiable(true);
		setTitle("关于Disney");
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("Disney");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 28));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel)
					.addContainerGap(296, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel)
					.addContainerGap(203, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
