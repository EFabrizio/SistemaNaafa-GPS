package com.nafaa.gui.paciente;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseEvent;
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

public class PanelPaciente extends JPanel {

	private JLabel actualizarDatos;
	private JLabel expedienteMédico;
	private JLabel lblAgendaDeCitas;
	private JLabel lblCerrarSecion;

	/**
	 * Create the panel.
	 */
	public PanelPaciente() {
		
		actualizarDatos = new JLabel("Actualizar Datos");
		
		expedienteMédico = new JLabel("Expediente Médico");
		
		lblAgendaDeCitas = new JLabel("Agenda de citas médicas");
		
		lblCerrarSecion = new JLabel("Cerrar Secion");
		
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
					.addComponent(actualizarDatos)
					.addGap(18)
					.addComponent(expedienteMédico)
					.addGap(18)
					.addComponent(lblAgendaDeCitas)
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(lblCerrarSecion)
					.addGap(56))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(expedienteMédico)
								.addComponent(actualizarDatos)
								.addComponent(lblAgendaDeCitas)
								.addComponent(lblCerrarSecion)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	public JLabel getActualizarDatos() {
		return actualizarDatos;
	}

	public JLabel getExpedienteMedico() {
		return expedienteMédico;
	}

	public JLabel getLblAgendaDeCitas() {
		return lblAgendaDeCitas;
	}



	public JLabel getLblCerrarSecion() {
            
		return lblCerrarSecion;
	}
        
        
        
}
