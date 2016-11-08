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

public class AnalisisCoprologico extends JPanel {
	private JTextField textConsistencia;
	private JTextField textHemoglobina;
	private JTextField textPH;
	private JTextField textMicelios;
	private JTextField textMoco;
	private JTextField textGlobulosR;
	private JTextField textPolimorfos;
	private JTextField textEsporas;
	private JTextField textQuiste;
	private JTextField textTrofo;
	private JTextField textHelmintos;
	private JTextField textColor;
	private JTextField textProtozoarios;
	private JTextField textHuevo;
	private JTextField textGrasa;
	private JTextField textAlmidon;
	private JTextField textFibras;
	private JTextField textLarva;
	private JLabel lblCerrarSesion;
	private JLabel lblConsitencia;
	private JLabel lblHemoglobina;
	private JLabel lblPH;
	private JLabel lblGlobulosR;
	private JLabel lblPolimorfos;
	private JLabel lblMicelios;
	private JLabel lblEsporas;
	private JLabel lblMoco;
	private JLabel lblMonoc;
	private JLabel lblAlmidon;
	private JLabel lblGrasa;
	private JLabel lblProtozoarios;
	private JLabel lblQuiste;
	private JLabel lblTrofo;
	private JLabel lblHelmintos;
	private JLabel lblHuevo;
	private JLabel lblCoombsIndirecto;
	private JLabel lblTtp;
	private JLabel lblColor;
	private JLabel lblFibras;
	private JLabel lblCometarios;
	private JLabel lblLarva;
	private JLabel lblComentarios;
	private JTextArea textComentarios;
	
	
	public JTextField getTextConsistencia() {
		return textConsistencia;
	}

	public JTextField getTextHemoglobina() {
		return textHemoglobina;
	}

	public JTextField getTextPH() {
		return textPH;
	}

	public JTextField getTextMicelios() {
		return textMicelios;
	}

	public JTextField getTextMoco() {
		return textMoco;
	}

	public JTextField getTextGlobulosR() {
		return textGlobulosR;
	}

	public JTextField getTextPolimorfos() {
		return textPolimorfos;
	}

	public JTextField getTextEsporas() {
		return textEsporas;
	}

	public JTextField getTextQuiste() {
		return textQuiste;
	}

	public JTextField getTextTrofo() {
		return textTrofo;
	}

	public JTextField getTextHelmintos() {
		return textHelmintos;
	}

	public JTextField getTextColor() {
		return textColor;
	}

	public JTextField getTextProtozoarios() {
		return textProtozoarios;
	}

	public JTextField getTextHuevo() {
		return textHuevo;
	}

	public JTextField getTextGrasa() {
		return textGrasa;
	}

	public JTextField getTextAlmidon() {
		return textAlmidon;
	}

	public JTextField getTextFibras() {
		return textFibras;
	}

	public JTextField getTextLarva() {
		return textLarva;
	}

	public JLabel getLblCerrarSesion() {
		return lblCerrarSesion;
	}

	public JLabel getLblConsitencia() {
		return lblConsitencia;
	}

	public JLabel getLblHemoglobina() {
		return lblHemoglobina;
	}

	public JLabel getLblPH() {
		return lblPH;
	}

	public JLabel getLblGlobulosR() {
		return lblGlobulosR;
	}

	public JLabel getLblPolimorfos() {
		return lblPolimorfos;
	}

	public JLabel getLblMicelios() {
		return lblMicelios;
	}

	public JLabel getLblEsporas() {
		return lblEsporas;
	}

	public JLabel getLblMoco() {
		return lblMoco;
	}

	public JLabel getLblMonoc() {
		return lblMonoc;
	}

	public JLabel getLblAlmidon() {
		return lblAlmidon;
	}

	public JLabel getLblGrasa() {
		return lblGrasa;
	}

	public JLabel getLblProtozoarios() {
		return lblProtozoarios;
	}

	public JLabel getLblQuiste() {
		return lblQuiste;
	}

	public JLabel getLblTrofo() {
		return lblTrofo;
	}

	public JLabel getLblHelmintos() {
		return lblHelmintos;
	}

	public JLabel getLblHuevo() {
		return lblHuevo;
	}

	public JLabel getLblCoombsIndirecto() {
		return lblCoombsIndirecto;
	}

	public JLabel getLblTtp() {
		return lblTtp;
	}

	public JLabel getLblColor() {
		return lblColor;
	}

	public JLabel getLblFibras() {
		return lblFibras;
	}

	public JLabel getLblCometarios() {
		return lblCometarios;
	}

	public JLabel getLblLarva() {
		return lblLarva;
	}

	public JLabel getLblComentarios() {
		return lblComentarios;
	}

	public JTextArea getTextComentarios() {
		return textComentarios;
	}
	//public JLabel getActualizarDatos() {
			//return actualizarDatos;
		//}

	/**
	 * Create the panel.
	 */
	public AnalisisCoprologico() {
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
		lblCerrarSesion = new JLabel("Cerrar Sesion");
		
		lblConsitencia = new JLabel("Consitencia:");
		
		lblHemoglobina = new JLabel("Hemoglobina:");
		
		textConsistencia = new JTextField();
		textConsistencia.setColumns(10);
		
		lblPH = new JLabel("PH:");
		
		lblGlobulosR = new JLabel("Globulos R:");
		
		textHemoglobina = new JTextField();
		textHemoglobina.setColumns(10);
		
		textPH = new JTextField();
		textPH.setColumns(10);
		
		textMicelios = new JTextField();
		textMicelios.setColumns(10);
		
		lblPolimorfos = new JLabel("Polimorfos:");
		
		lblMicelios = new JLabel("Micelios:");
		
		lblEsporas = new JLabel("Esporas:");
		
		textMoco = new JTextField();
		textMoco.setColumns(10);
		
		textGlobulosR = new JTextField();
		textGlobulosR.setColumns(10);
		
		lblMoco = new JLabel("Moco");
		
		textPolimorfos = new JTextField();
		textPolimorfos.setColumns(10);
		
		textEsporas = new JTextField();
		textEsporas.setColumns(10);
		
		lblMonoc = new JLabel("Monoc:");
		
		lblAlmidon = new JLabel("Almidon:\n");
		
		textQuiste = new JTextField();
		textQuiste.setColumns(10);
		
		lblGrasa = new JLabel("Grasa:");
		
		textTrofo = new JTextField();
		textTrofo.setColumns(10);
		
		lblProtozoarios = new JLabel("Protozoarios:");
		
		textHelmintos = new JTextField();
		textHelmintos.setColumns(10);
		
		lblQuiste = new JLabel("Quiste:");
		
		lblTrofo = new JLabel("Trofo:");
		
		lblHelmintos = new JLabel("Helmintos:");
		
		lblHuevo = new JLabel("Huevo:");
		
		lblCoombsIndirecto = new JLabel("Coombs indirecto:");
		
		lblTtp = new JLabel("TTP");
		
		lblColor = new JLabel("Color:");
		
		textColor = new JTextField();
		textColor.setColumns(10);
		
		lblFibras = new JLabel("Fibras:");
		
		textProtozoarios = new JTextField();
		textProtozoarios.setColumns(10);
		
		lblCometarios = new JLabel("Cometarios:");
		
		JButton btnAceptar = new JButton("ACEPTAR");
		
		textHuevo = new JTextField();
		textHuevo.setColumns(10);
		
		textGrasa = new JTextField();
		textGrasa.setColumns(10);
		
		textAlmidon = new JTextField();
		textAlmidon.setColumns(10);
		
		textFibras = new JTextField();
		textFibras.setColumns(10);
		
	
		lblLarva = new JLabel("Larva:");
		
		lblComentarios = new JLabel("Comentarios:");
		
		textLarva = new JTextField();
		textLarva.setColumns(10);
		
		textComentarios = new JTextArea();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblConsitencia)
						.addComponent(lblHemoglobina)
						.addComponent(lblMicelios)
						.addComponent(lblMonoc)
						.addComponent(lblCometarios)
						.addComponent(lblMoco)
						.addComponent(lblGlobulosR)
						.addComponent(lblColor)
						.addComponent(lblPH)
						.addComponent(lblEsporas)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblComentarios)
								.addComponent(lblPolimorfos))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textHemoglobina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textConsistencia, 119, 119, 119)
								.addComponent(textPH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textGlobulosR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPolimorfos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textEsporas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textMicelios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textMoco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblHelmintos)
												.addComponent(lblCoombsIndirecto)
												.addComponent(lblTrofo)
												.addComponent(lblQuiste)
												.addComponent(lblProtozoarios)
												.addComponent(lblGrasa)
												.addComponent(lblFibras)
												.addComponent(lblAlmidon)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(92)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblLarva)
												.addComponent(lblHuevo)))))
								.addComponent(textColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
									.addComponent(lblTtp)
									.addGap(103)
									.addComponent(btnAceptar))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textGrasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textProtozoarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textQuiste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textTrofo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textHelmintos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textAlmidon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFibras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(13)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textHuevo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textLarva, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(283)))
							.addGap(807)
							.addComponent(lblCerrarSesion, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(52)
							.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(textColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblFibras)
											.addComponent(textFibras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblColor))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblConsitencia)
										.addComponent(textConsistencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAlmidon)
										.addComponent(textAlmidon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblHemoglobina)
										.addComponent(textHemoglobina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGrasa)
										.addComponent(textGrasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(14)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(textPH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblProtozoarios)
												.addComponent(textProtozoarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblPH)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblGlobulosR)
												.addComponent(textGlobulosR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblQuiste))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(textPolimorfos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTrofo)
												.addComponent(lblPolimorfos)
												.addComponent(textTrofo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(textEsporas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblHelmintos)
												.addComponent(lblEsporas)
												.addComponent(textHelmintos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblMicelios)
												.addComponent(textMicelios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblHuevo)
												.addComponent(textHuevo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(textMoco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMoco)
												.addComponent(lblLarva)
												.addComponent(textLarva, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textQuiste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(57)
											.addComponent(lblComentarios))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(30)
											.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
									.addGap(464)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(lblMonoc))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblTtp))))
								.addComponent(lblCerrarSesion))
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCoombsIndirecto)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCometarios)
						.addComponent(btnAceptar))
					.addGap(109))
		);
		setLayout(groupLayout);

	}
}
