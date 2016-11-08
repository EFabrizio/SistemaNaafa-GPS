package com.nafaa.gui.medico;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class PanelMedico extends JPanel {
	
	private JLabel expedientes;
	private JLabel citas;
	private JLabel lblCerrarSecion;

	public JLabel getExpedientes() {
		return expedientes;
	}

	public JLabel getCitas() {
		return citas;
	}

	public JLabel getLblCerrarSecion() {
		return lblCerrarSecion;
	}

	/**
	 * Create the panel.
	 */
	public PanelMedico() {
		
		expedientes = new JLabel("Consultar Expedientes");
		
		citas = new JLabel("Citas");
		
		lblCerrarSecion = new JLabel("Cerrar Sesion");
		
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
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(expedientes)
					.addGap(18)
					.addComponent(citas)
					.addGap(333)
					.addComponent(lblCerrarSecion)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCerrarSecion)
								.addComponent(expedientes)
								.addComponent(citas)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
