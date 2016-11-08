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

public class AnalisisQuimica extends JPanel {
	private JTextField textGlucosaAyunas;
	private JTextField textGlucosa2;
	private JTextField textUrea;
	private JTextField textCreatinina;
	private JTextField textAcidoUrico;
	private JTextField textBilirrubinaTotal;
	private JTextField textBiliburrinaDirecta;
	private JTextField textProteinaTotal;
	private JTextField textAlbumina;
	private JTextField textGlobulina;
	private JTextField textTransPirubica;
	private JTextField textTransOxalacetica;
	private JTextField textFosfataAlcalina;
	private JTextField textColesterolTotal;
	private JTextField textColesterolLDL;
	private JTextField textColesterolHDL;
	private JTextField textTrigliceridos;
	private JLabel lblCerrarSesion;
	private JLabel lblGlucosa2;
	private JLabel lblUrea;
	private JLabel lblCreatinina;
	private JLabel lblAcidoUrico;
	private JLabel lblBilirrubinatotal;
	private JLabel lblBilirrubinaDirecta;
	private JLabel lblGlucosa;
	private JLabel lblProteinaTotal;
	private JLabel lblAlbumina;
	private JLabel lblGlobulina;
	private JLabel lblTransPirubica;
	private JLabel lblTransOxalacetica;
	private JLabel lblFosfataAlcalina;
	private JLabel lblColesterolTotal;
	private JLabel lblColesterolHDL;
	private JLabel lblColesterolLDL;
	private JLabel lblTrigliceridos;
	private JLabel lblComentarios;
	private JTextArea textComentarios;
	
	//public JLabel getActualizarDatos() {
			//return actualizarDatos;
		//}

	/**
	 * Create the panel.
	 */
	public AnalisisQuimica() {
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
		lblCerrarSesion = new JLabel("Cerrar Sesion");
		
		lblGlucosa2 = new JLabel("Glucosa 2 horas:");
		
		lblUrea = new JLabel("Urea:");
		
		lblCreatinina = new JLabel("Creatinina:");
		
		lblAcidoUrico = new JLabel("Ácido Urico:");
		
		lblBilirrubinatotal = new JLabel("Bilirrubina Total:");
		
		lblBilirrubinaDirecta = new JLabel("Bilorrubina Directa:");
		
		lblGlucosa = new JLabel("Glucosa ayunas:");
		
		textGlucosaAyunas = new JTextField();
		textGlucosaAyunas.setColumns(10);
		
		lblProteinaTotal = new JLabel("Proteina total:");
		
		lblAlbumina = new JLabel("Albumina:");
		
		lblGlobulina = new JLabel("Globulina:");
		
		textGlucosa2 = new JTextField();
		textGlucosa2.setColumns(10);
		
		textUrea = new JTextField();
		textUrea.setColumns(10);
		
		textCreatinina = new JTextField();
		textCreatinina.setColumns(10);
		
		textAcidoUrico = new JTextField();
		textAcidoUrico.setColumns(10);
		
		textBilirrubinaTotal = new JTextField();
		textBilirrubinaTotal.setColumns(10);
		
		textBiliburrinaDirecta = new JTextField();
		textBiliburrinaDirecta.setColumns(10);
		
		textProteinaTotal = new JTextField();
		textProteinaTotal.setColumns(10);
		
		textAlbumina = new JTextField();
		textAlbumina.setColumns(10);
		
		textGlobulina = new JTextField();
		textGlobulina.setColumns(10);
		
		lblTransPirubica = new JLabel("Trans. Pirubica:");
		
		textTransPirubica = new JTextField();
		textTransPirubica.setColumns(10);
		
		lblTransOxalacetica = new JLabel("Trans. Oxalacetica:");
		
		textTransOxalacetica = new JTextField();
		textTransOxalacetica.setColumns(10);
		
		lblFosfataAlcalina = new JLabel("Fosfata Alcalina:");
		
		textFosfataAlcalina = new JTextField();
		textFosfataAlcalina.setColumns(10);
		
		lblColesterolTotal = new JLabel("Colesterol total:");
		
		textColesterolTotal = new JTextField();
		textColesterolTotal.setColumns(10);
		
		lblColesterolHDL = new JLabel("Colesterol HDL:");
		
		lblColesterolLDL = new JLabel("Colesterol LDL:");
		
		textColesterolLDL = new JTextField();
		textColesterolLDL.setColumns(10);
		
		textColesterolHDL = new JTextField();
		textColesterolHDL.setColumns(10);
		
		lblTrigliceridos = new JLabel("Trigliceridos");
		
		textTrigliceridos = new JTextField();
		textTrigliceridos.setColumns(10);
		
		lblComentarios = new JLabel("Comentarios");
		
		textComentarios = new JTextArea();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblGlucosa2)
								.addComponent(lblBilirrubinaDirecta)
								.addComponent(lblGlucosa)
								.addComponent(lblUrea)
								.addComponent(lblCreatinina)
								.addComponent(lblAcidoUrico)
								.addComponent(lblBilirrubinatotal)
								.addComponent(lblProteinaTotal)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(78)
							.addComponent(lblAlbumina))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(52)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblComentarios)
								.addComponent(lblGlobulina))))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textGlobulina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textGlucosaAyunas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textUrea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textGlucosa2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCreatinina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textAcidoUrico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textBilirrubinaTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textBiliburrinaDirecta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(24)
									.addComponent(lblTransPirubica))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(23)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblColesterolTotal)
										.addComponent(lblFosfataAlcalina)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(21)
											.addComponent(lblTrigliceridos))
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblColesterolLDL)
											.addComponent(lblColesterolHDL))))
								.addComponent(lblTransOxalacetica))
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textTrigliceridos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textColesterolLDL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textColesterolHDL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFosfataAlcalina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textTransOxalacetica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textTransPirubica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textColesterolTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(739)
							.addComponent(lblCerrarSesion, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textProteinaTotal, Alignment.LEADING)
							.addComponent(textAlbumina, Alignment.LEADING))
						.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textGlucosaAyunas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGlucosa)
										.addComponent(textTransPirubica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblGlucosa2)
												.addComponent(textGlucosa2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblUrea)
												.addComponent(textUrea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textFosfataAlcalina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblCreatinina)
												.addComponent(textCreatinina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textColesterolTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addComponent(textTransOxalacetica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(20)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblAcidoUrico)
												.addComponent(textAcidoUrico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(18)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblBilirrubinatotal)
														.addComponent(textBilirrubinaTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGap(18)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblBilirrubinaDirecta)
														.addComponent(textBiliburrinaDirecta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGroup(groupLayout.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(textColesterolLDL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblColesterolLDL))
													.addGap(18)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(textTrigliceridos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblTrigliceridos)))))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(textColesterolHDL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addComponent(lblCerrarSesion))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblProteinaTotal)
								.addComponent(textProteinaTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAlbumina)
								.addComponent(textAlbumina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGlobulina)
								.addComponent(textGlobulina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblTransPirubica)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(37)
									.addComponent(lblFosfataAlcalina)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblColesterolTotal))
								.addComponent(lblTransOxalacetica))
							.addGap(20)
							.addComponent(lblColesterolHDL)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblComentarios)
						.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(364))
		);
		setLayout(groupLayout);

	}

	public JTextField getTextGlucosaAyunas() {
		return textGlucosaAyunas;
	}

	public JTextField getTextGlucosa2() {
		return textGlucosa2;
	}

	public JTextField getTextUrea() {
		return textUrea;
	}

	public JTextField getTextCreatinina() {
		return textCreatinina;
	}

	public JTextField getTextAcidoUrico() {
		return textAcidoUrico;
	}

	public JTextField getTextBilirrubinaTotal() {
		return textBilirrubinaTotal;
	}

	public JTextField getTextBiliburrinaDirecta() {
		return textBiliburrinaDirecta;
	}

	public JTextField getTextProteinaTotal() {
		return textProteinaTotal;
	}

	public JTextField getTextAlbumina() {
		return textAlbumina;
	}

	public JTextField getTextGlobulina() {
		return textGlobulina;
	}

	public JTextField getTextTransPirubica() {
		return textTransPirubica;
	}

	public JTextField getTextTransOxalacetica() {
		return textTransOxalacetica;
	}

	public JTextField getTextFosfataAlcalina() {
		return textFosfataAlcalina;
	}

	public JTextField getTextColesterolTotal() {
		return textColesterolTotal;
	}

	public JTextField getTextColesterolLDL() {
		return textColesterolLDL;
	}

	public JTextField getTextColesterolHDL() {
		return textColesterolHDL;
	}

	public JTextField getTextTrigliceridos() {
		return textTrigliceridos;
	}

	public JLabel getLblCerrarSesion() {
		return lblCerrarSesion;
	}

	public JLabel getLblGlucosa2() {
		return lblGlucosa2;
	}

	public JLabel getLblUrea() {
		return lblUrea;
	}

	public JLabel getLblCreatinina() {
		return lblCreatinina;
	}

	public JLabel getLblAcidoUrico() {
		return lblAcidoUrico;
	}

	public JLabel getLblBilirrubinaTotal() {
		return lblBilirrubinatotal;
	}

	public JLabel getLblBilirrubinaDirecta() {
		return lblBilirrubinaDirecta;
	}

	public JLabel getLblGlucosa() {
		return lblGlucosa;
	}

	public JLabel getLblProteinaTotal() {
		return lblProteinaTotal;
	}

	public JLabel getLblAlbumina() {
		return lblAlbumina;
	}

	public JLabel getLblGlobulina() {
		return lblGlobulina;
	}

	public JLabel getLblTransPirubica() {
		return lblTransPirubica;
	}

	public JLabel getLblTransOxalacetica() {
		return lblTransOxalacetica;
	}

	public JLabel getLblFosfataAlcalina() {
		return lblFosfataAlcalina;
	}

	public JLabel getLblColesterolTotal() {
		return lblColesterolTotal;
	}

	public JLabel getLblColesterolHDL() {
		return lblColesterolHDL;
	}

	public JLabel getLblColesterolLDL() {
		return lblColesterolLDL;
	}

	public JLabel getLblTrigliceridos() {
		return lblTrigliceridos;
	}

	public JLabel getLblComentarios() {
		return lblComentarios;
	}

	public JTextArea getTextComentarios() {
		return textComentarios;
	}
}
