package com.nafaa.gui.laboratorista;

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
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class AnalisisOtros extends JPanel {
	
	//public JLabel getActualizarDatos() {
			//return actualizarDatos;
		//}

	private JLabel lblResultados;
	private JLabel lblComentarios;
    private JLabel lblCerrarSesion;
	private JTextArea textResultados;
	private JTextArea textComentarios;
	
	public JLabel getLblResultados() {
		return lblResultados;
	}

	public JLabel getLblComentarios() {
		return lblComentarios;
	}

	public JLabel getLblCerrarSesion() {
		return lblCerrarSesion;
	}

	public JTextArea getTextResultados() {
		return textResultados;
	}

	public JTextArea getTextComentarios() {
		return textComentarios;
	}


	/**
	 * Create the panel.
	 */
	public AnalisisOtros() {
		setBackground(SystemColor.window);
		setForeground(Color.WHITE);
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
		lblCerrarSesion = new JLabel("Cerrar Sesion");
		
		textResultados = new JTextArea();
		
		textResultados.setBackground(Color.WHITE);
		textResultados.setLineWrap(true);
		
		lblResultados = new JLabel("RESUTADOS");
		
		lblComentarios = new JLabel("Comentarios:");
		
		textComentarios = new JTextArea();
		textComentarios.setLineWrap(true);
		
		JTextArea textArea_2 = new JTextArea();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblComentarios)
								.addComponent(lblResultados)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(59)
									.addComponent(textResultados, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(62)
									.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(368, Short.MAX_VALUE)
					.addComponent(lblCerrarSesion, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblCerrarSesion)
					.addGap(33)
					.addComponent(lblResultados)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textResultados, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblComentarios)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(414))
		);
		setLayout(groupLayout);

	}
}
