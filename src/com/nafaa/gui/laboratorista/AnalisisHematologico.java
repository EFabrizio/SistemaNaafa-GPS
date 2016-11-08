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
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class AnalisisHematologico extends JPanel {
	private JTextField textHTC;
	

	private JTextField textVelocidadDeSegmentacion;
	private JTextField textPlaquetas;
	private JTextField textLeucocitos;
	private JTextField textMetam;
	private JTextField textSegme;
	private JTextField textCayad;
	private JTextField textEosin;
	private JTextField textVCM;
	private JTextField textLinfo;
	private JTextField textBansof;
	private JTextField textMonoc;
	private JTextField textHipocromia;
	private JTextField textAnsocosotosis;
	private JTextField textPoiquilocit;
	private JTextField textMicrocitosis;
	private JTextField textPolicromat;
	private JTextField textReticulocitos;
	private JTextField textDrepanositos;
	private JTextField textGrupo;
	private JTextField textCoombsDirecto;
	private JTextField textCoombsIndirecto;
	private JTextField textProtombina;
	private JTextField textTTP;
	private JTextField textHGB;
	private JTextField textAtipi;
	private JLabel lblHTC;
	private JLabel lblVelocidadDeSegmentacion;
	private JLabel lblPlaquetas;
	private JLabel lblLeucocitos;
	private JLabel lblMetam;
	private JLabel lblCayad;
	private JLabel lblSegme;
	private JLabel lblEosin;
	private JLabel lblVcm;
	private JLabel lblLinfo;
	private JLabel lblBansof;
	private JLabel lblMonoc;
	private JLabel lblHipocromia;
	private JLabel lblAnsocosotosis;
	private JLabel lblPoiquilocit;
	private JLabel lblMicrocitosis;
	private JLabel lblPolicromat;
	private JLabel lblReticulocitos;
	private JLabel lblDrepanocitos;
	private JLabel lblGrupo;
	private JLabel lblCoombsDirecto;
	private JLabel lblCoombsIndirecto;
	private JLabel lblProtombina;
	private JLabel lblTTP;
	private JLabel lblHGB;
	private JLabel lblAtipi;
	private JLabel lblComentarios;
	private JTextArea textComentarios;
	
	public JTextField getTextHTC() {
		return textHTC;
	}

	public JTextField getTextVelocidadDeSegmentacion() {
		return textVelocidadDeSegmentacion;
	}

	public JTextField getTextPlaquetas() {
		return textPlaquetas;
	}

	public JTextField getTextLeucocitos() {
		return textLeucocitos;
	}

	public JTextField getTextMetam() {
		return textMetam;
	}

	public JTextField getTextSegme() {
		return textSegme;
	}

	public JTextField getTextCayad() {
		return textCayad;
	}

	public JTextField getTextEosin() {
		return textEosin;
	}

	public JTextField getTextVCM() {
		return textVCM;
	}

	public JTextField getTextLinfo() {
		return textLinfo;
	}

	public JTextField getTextBansof() {
		return textBansof;
	}

	public JTextField getTextMonoc() {
		return textMonoc;
	}

	public JTextField getTextHipocromia() {
		return textHipocromia;
	}

	public JTextField getTextAnsocosotosis() {
		return textAnsocosotosis;
	}

	public JTextField getTextPoiquilocit() {
		return textPoiquilocit;
	}

	public JTextField getTextMicrocitosis() {
		return textMicrocitosis;
	}

	public JTextField getTextPolicromat() {
		return textPolicromat;
	}

	public JTextField getTextReticulocitos() {
		return textReticulocitos;
	}

	public JTextField getTextDrepanositos() {
		return textDrepanositos;
	}

	public JTextField getTextGrupo() {
		return textGrupo;
	}

	public JTextField getTextCoombsDirecto() {
		return textCoombsDirecto;
	}

	public JTextField getTextCoombsIndirecto() {
		return textCoombsIndirecto;
	}

	public JTextField getTextProtombina() {
		return textProtombina;
	}

	public JTextField getTextTTP() {
		return textTTP;
	}

	public JTextField getTextHGB() {
		return textHGB;
	}

	public JTextField getTextAtipi() {
		return textAtipi;
	}

	public JLabel getLblHTC() {
		return lblHTC;
	}

	public JLabel getLblVelocidadDeSegmentacion() {
		return lblVelocidadDeSegmentacion;
	}

	public JLabel getLblPlaquetas() {
		return lblPlaquetas;
	}

	public JLabel getLblLeucocitos() {
		return lblLeucocitos;
	}

	public JLabel getLblMetam() {
		return lblMetam;
	}

	public JLabel getLblCayad() {
		return lblCayad;
	}

	public JLabel getLblSegme() {
		return lblSegme;
	}

	public JLabel getLblEosin() {
		return lblEosin;
	}

	public JLabel getLblVcm() {
		return lblVcm;
	}

	public JLabel getLblLinfo() {
		return lblLinfo;
	}

	public JLabel getLblBansof() {
		return lblBansof;
	}

	public JLabel getLblMonoc() {
		return lblMonoc;
	}

	public JLabel getLblHipocromia() {
		return lblHipocromia;
	}

	public JLabel getLblAnsocosotosis() {
		return lblAnsocosotosis;
	}

	public JLabel getLblPoiquilocit() {
		return lblPoiquilocit;
	}

	public JLabel getLblMicrocitosis() {
		return lblMicrocitosis;
	}

	public JLabel getLblPolicromat() {
		return lblPolicromat;
	}

	public JLabel getLblReticulocitos() {
		return lblReticulocitos;
	}

	public JLabel getLblDrepanocitos() {
		return lblDrepanocitos;
	}

	public JLabel getLblGrupo() {
		return lblGrupo;
	}

	public JLabel getLblCoombsDirecto() {
		return lblCoombsDirecto;
	}

	public JLabel getLblCoombsIndirecto() {
		return lblCoombsIndirecto;
	}

	public JLabel getLblProtombina() {
		return lblProtombina;
	}

	public JLabel getLblTTP() {
		return lblTTP;
	}

	public JLabel getLblHGB() {
		return lblHGB;
	}

	public JLabel getLblAtipi() {
		return lblAtipi;
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
	public AnalisisHematologico() {
		setBackground(SystemColor.window);
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
		JLabel lblCerrarSesion = new JLabel("Cerrar Sesion");
		
		lblHTC = new JLabel("HTC:");
		
		lblVelocidadDeSegmentacion = new JLabel("Segmentación (v):");
		
		textHTC = new JTextField();
		textHTC.setColumns(10);
		
		lblPlaquetas = new JLabel("Plaquetas:");
		
		lblLeucocitos = new JLabel("Leucocitos");
		
		textVelocidadDeSegmentacion = new JTextField();
		textVelocidadDeSegmentacion.setColumns(10);
		
		textPlaquetas = new JTextField();
		textPlaquetas.setColumns(10);
		
		textLeucocitos = new JTextField();
		textLeucocitos.setColumns(10);
		
		lblMetam = new JLabel("Metam:");
		
		lblCayad = new JLabel("CAYAD:");
		
		lblSegme = new JLabel("Segme:");
		
		textMetam = new JTextField();
		textMetam.setColumns(10);
		
		textSegme = new JTextField();
		textSegme.setColumns(10);
		
		textCayad = new JTextField();
		textCayad.setColumns(10);
		
		lblEosin = new JLabel("Eosin:");
		
		textEosin = new JTextField();
		textEosin.setColumns(10);
		
		lblVcm = new JLabel("VCM:");
		
		textVCM = new JTextField();
		textVCM.setColumns(10);
		
		lblLinfo = new JLabel("Linfo");
		
		textLinfo = new JTextField();
		textLinfo.setColumns(10);
		
		lblBansof = new JLabel("Bansof:");
		
		lblMonoc = new JLabel("Monoc:");
		
		textBansof = new JTextField();
		textBansof.setColumns(10);
		
		textMonoc = new JTextField();
		textMonoc.setColumns(10);
		
		lblHipocromia = new JLabel("Hipocromia");
		
		textHipocromia = new JTextField();
		textHipocromia.setColumns(10);
		
		lblAnsocosotosis = new JLabel("Ansocosotosis");
		
		textAnsocosotosis = new JTextField();
		textAnsocosotosis.setColumns(10);
		
		lblPoiquilocit = new JLabel("Poiquilocit");
		
		textPoiquilocit = new JTextField();
		textPoiquilocit.setColumns(10);
		
		lblMicrocitosis = new JLabel("Microcitosis");
		
		textMicrocitosis = new JTextField();
		textMicrocitosis.setColumns(10);
		
		lblPolicromat = new JLabel("Policromat");
		
		textPolicromat = new JTextField();
		textPolicromat.setColumns(10);
		
		lblReticulocitos = new JLabel("Reticulocitos:");
		
		textReticulocitos = new JTextField();
		textReticulocitos.setColumns(10);
		
		lblDrepanocitos = new JLabel("Drepanocitos:");
		
		textDrepanositos = new JTextField();
		textDrepanositos.setColumns(10);
		
		lblGrupo = new JLabel("Grupo:");
		
		textGrupo = new JTextField();
		textGrupo.setColumns(10);
		
		lblCoombsDirecto = new JLabel("Coombs directo:");
		
		textCoombsDirecto = new JTextField();
		textCoombsDirecto.setColumns(10);
		
		lblCoombsIndirecto = new JLabel("Coombs indirecto:");
		
		textCoombsIndirecto = new JTextField();
		textCoombsIndirecto.setColumns(10);
		
		lblProtombina = new JLabel("Protombina");
		
		textProtombina = new JTextField();
		textProtombina.setColumns(10);
		
		lblTTP = new JLabel("TTP");
		
		textTTP = new JTextField();
		textTTP.setColumns(10);
		
		lblHGB = new JLabel("HGB");
		
		textHGB = new JTextField();
		textHGB.setColumns(10);
		
		lblAtipi = new JLabel("Atipi:");
		
		textAtipi = new JTextField();
		textAtipi.setColumns(10);
		
		lblComentarios = new JLabel("Cometarios:");
		
		textComentarios = new JTextArea();
		
		JButton btnCancelar = new JButton("CANCELAR");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblHTC)
											.addComponent(lblVelocidadDeSegmentacion)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblPlaquetas)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(10)
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblSegme)
														.addComponent(lblLeucocitos)
														.addComponent(lblMetam)
														.addComponent(lblLinfo)
														.addComponent(lblVcm)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(lblEosin)
															.addComponent(lblCayad))))))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(87)
											.addComponent(lblHGB)))
									.addGap(40))
								.addComponent(lblBansof)
								.addComponent(lblMonoc)
								.addComponent(lblComentarios))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textHGB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
															.addGroup(groupLayout.createSequentialGroup()
																.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																	.addGroup(groupLayout.createSequentialGroup()
																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																			.addComponent(textVelocidadDeSegmentacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addComponent(textHTC)
																			.addComponent(textPlaquetas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addComponent(textLeucocitos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addComponent(textMetam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addGap(166))
																	.addGroup(groupLayout.createSequentialGroup()
																		.addComponent(textVCM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)))
																.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																	.addComponent(lblAnsocosotosis)
																	.addComponent(lblPoiquilocit)
																	.addComponent(lblMicrocitosis)
																	.addComponent(lblPolicromat)
																	.addGroup(groupLayout.createSequentialGroup()
																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																			.addComponent(lblReticulocitos)
																			.addComponent(lblGrupo))
																		.addGap(4))
																	.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblAtipi)
																		.addComponent(lblHipocromia)))
																.addGap(1))
															.addGroup(groupLayout.createSequentialGroup()
																.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																	.addComponent(textCayad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(textBansof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(textLinfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
																.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																	.addGroup(groupLayout.createSequentialGroup()
																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																			.addComponent(lblCoombsDirecto)
																			.addComponent(lblCoombsIndirecto))
																		.addPreferredGap(ComponentPlacement.RELATED))
																	.addGroup(groupLayout.createSequentialGroup()
																		.addComponent(lblDrepanocitos)
																		.addGap(3))
																	.addGroup(groupLayout.createSequentialGroup()
																		.addComponent(lblProtombina)
																		.addGap(3)))))
														.addComponent(textSegme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textEosin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGap(15))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(textMonoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
													.addComponent(lblTTP)
													.addGap(52)))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textDrepanositos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textReticulocitos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textPolicromat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textMicrocitosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textPoiquilocit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textAnsocosotosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textHipocromia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textAtipi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textCoombsDirecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textGrupo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textCoombsIndirecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textProtombina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textTTP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
									.addGap(928)
									.addComponent(lblCerrarSesion, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
								.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(148)
							.addComponent(btnCancelar)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textHGB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHGB)
								.addComponent(lblAtipi)
								.addComponent(textAtipi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblHipocromia)
										.addComponent(textHipocromia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textAnsocosotosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAnsocosotosis))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPoiquilocit)
										.addComponent(textPoiquilocit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblMicrocitosis)
										.addComponent(textMicrocitosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textPolicromat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPolicromat))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblReticulocitos)
										.addComponent(textReticulocitos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textDrepanositos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDrepanocitos)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblHTC)
											.addGap(18)
											.addComponent(lblVelocidadDeSegmentacion))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textHTC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textVelocidadDeSegmentacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(14)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPlaquetas)
										.addComponent(textPlaquetas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblLeucocitos)
										.addComponent(textLeucocitos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(51)
											.addComponent(lblSegme))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(textMetam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMetam))
											.addGap(18)
											.addComponent(textSegme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCayad)
										.addComponent(textCayad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textEosin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEosin))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textVCM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblVcm))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textLinfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLinfo))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCoombsIndirecto)
										.addComponent(textCoombsIndirecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textGrupo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGrupo))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textCoombsDirecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCoombsDirecto))))
							.addGap(2)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textBansof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBansof))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textMonoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMonoc)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(16)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textProtombina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblProtombina))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12)
											.addComponent(textTTP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblTTP))))))
						.addComponent(lblCerrarSesion))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79)
							.addComponent(lblComentarios))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(42)
							.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addComponent(btnCancelar)
					.addGap(329))
		);
		setLayout(groupLayout);

	}
}
