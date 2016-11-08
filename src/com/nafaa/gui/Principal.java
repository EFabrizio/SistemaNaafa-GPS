package com.nafaa.gui;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;


import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;

public class Principal extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblBienvenido;
	private JPanel panelPaciente;
	private JPanel panelAdmin;
	private JLabel modificarUsuariso; 
	private JPanel panel_2;
	
	public JPanel getPanelPaciente() {
		return panelPaciente;
	}

	public JPanel getPanelAdmin() {
		return panelAdmin;
	}

	public JLabel getLblBienvenido() {
		return lblBienvenido;
	}

	public JLabel getModificarUsuariso() {
		return modificarUsuariso;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	/**
	 * Create the panel.
	 */
	public Principal() {
		setBackground(Color.WHITE);
		
		panelPaciente = new JPanel();
		panelPaciente.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.LIGHT_GRAY));
		
		panelAdmin = new JPanel();
		panelAdmin.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.LIGHT_GRAY));
		
		JButton btnNewButton = new JButton();
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setEnabled(false);
		btnNewButton.setBorderPainted(false);
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
			btnNewButton.setIcon(icon);
			btnNewButton.setDisabledIcon(icon);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblCerrarSesin = new JLabel("Cerrar Sesión");
		
		modificarUsuariso = new JLabel("Gestión de Empleados");
		
		
		GroupLayout gl_panelAdmin = new GroupLayout(panelAdmin);
		gl_panelAdmin.setHorizontalGroup(
			gl_panelAdmin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAdmin.createSequentialGroup()
					.addGap(19)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(modificarUsuariso)
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addComponent(lblCerrarSesin)
					.addGap(30))
		);
		gl_panelAdmin.setVerticalGroup(
			gl_panelAdmin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAdmin.createSequentialGroup()
					.addGroup(gl_panelAdmin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAdmin.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panelAdmin.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCerrarSesin)
								.addComponent(modificarUsuariso)))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelAdmin.setLayout(gl_panelAdmin);
		
		
		GroupLayout gl_panel = new GroupLayout(panelPaciente);
		panelPaciente.setLayout(gl_panel);
		
		
		add(panelAdmin, BorderLayout.NORTH);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.CENTER);
		
		lblBienvenido = new JLabel("");
		lblBienvenido.setFont(new Font("Dialog", Font.BOLD, 14));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(24)
					.addComponent(lblBienvenido, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(33)
					.addComponent(lblBienvenido, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(160))
		);
		panel_2.setLayout(gl_panel_2);

	}
}
