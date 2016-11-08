package com.nafaa.gui.laboratorista;


import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;

public class RegistroCita extends JPanel {

	private JTextArea textArea;
	public JTextArea getTextArea() {
		return textArea;
	}

	public JButton getBtnAgendar() {
		return btnAgendar;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	private JButton btnAgendar;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public RegistroCita() {
		
		JLabel lblPdp = new JLabel("Problematica:");
		
		textArea = new JTextArea();
		
		btnAgendar = new JButton("Agendar");
		btnAgendar.setBackground(new Color(30, 144, 255));
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBackground(new Color(144, 238, 144));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPdp)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAgendar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton)))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblPdp)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAgendar)
						.addComponent(btnNewButton))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
