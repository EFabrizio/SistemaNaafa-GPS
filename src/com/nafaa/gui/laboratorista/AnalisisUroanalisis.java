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

public class AnalisisUroanalisis extends JPanel {
	private JTextField textDensidad;
	private JTextField textPH;
	private JTextField textProteina;
	private JTextField textGlucosa;
	private JTextField textCetiona;
	private JTextField textBilirrubinaTotal;
	private JTextField textHemoglobina;
	private JTextField textUrobilinogeno;
	private JTextField textLeucocitosPc;
	private JTextField textPiocitosPc;
	private JTextField textEritrocitosPc;
	private JTextField textCelulasAltas;
	private JTextField textHongos;
	private JTextField textBacterias;
	private JTextField textMoco;
	private JTextField textNitrito;
	private JTextField textCristales;
	private JTextField textCilindros;
	private JLabel lblCerrarSesion;
	private JLabel lblPH;
	private JLabel lblProteina;
	private JLabel lblGlucosa;
	private JLabel lblCetiona;
	private JLabel lblBilirrubinaTotal;
	private JLabel lblHemoglobina;
	private JLabel lblDensidad;
	private JLabel lblUrobilinogeno;
	private JLabel lblNitrito;
	private JLabel lblLeucocitosPc;
	private JLabel lblPiocitosPc;
	private JLabel lblEritrocitosPc;
	private JLabel lblCelulasAltas;
	private JLabel lblBacterias;
	private JLabel lblHongos;
	private JLabel lblMoco;
	private JLabel lblCristales;
	private JLabel lblCilindros;
	private JLabel lblComentarios_1;
	private JTextArea textComentarios;
	
	public JTextField getTextDensidad() {
		return textDensidad;
	}

	public JTextField getTextPH() {
		return textPH;
	}

	public JTextField getTextProteina() {
		return textProteina;
	}

	public JTextField getTextGlucosa() {
		return textGlucosa;
	}

	public JTextField getTextCetiona() {
		return textCetiona;
	}

	public JTextField getTextBilirrubinaTotal() {
		return textBilirrubinaTotal;
	}

	public JTextField getTextHemoglobina() {
		return textHemoglobina;
	}

	public JTextField getTextUrobilinogeno() {
		return textUrobilinogeno;
	}

	public JTextField getTextLeucocitosPc() {
		return textLeucocitosPc;
	}

	public JTextField getTextPiocitosPc() {
		return textPiocitosPc;
	}

	public JTextField getTextEritrocitosPc() {
		return textEritrocitosPc;
	}

	public JTextField getTextCelulasAltas() {
		return textCelulasAltas;
	}

	public JTextField getTextHongos() {
		return textHongos;
	}

	public JTextField getTextBacterias() {
		return textBacterias;
	}

	public JTextField getTextMoco() {
		return textMoco;
	}

	public JTextField getTextNitrito() {
		return textNitrito;
	}

	public JTextField getTextCristales() {
		return textCristales;
	}

	public JTextField getTextCilindros() {
		return textCilindros;
	}

	public JLabel getLblCerrarSesion() {
		return lblCerrarSesion;
	}

	public JLabel getLblPH() {
		return lblPH;
	}

	public JLabel getLblProteina() {
		return lblProteina;
	}

	public JLabel getLblGlucosa() {
		return lblGlucosa;
	}

	public JLabel getLblCetiona() {
		return lblCetiona;
	}

	public JLabel getLblBilirrubinaTotal() {
		return lblBilirrubinaTotal;
	}

	public JLabel getLblHemoglobina() {
		return lblHemoglobina;
	}

	public JLabel getLblDensidad() {
		return lblDensidad;
	}

	public JLabel getLblUrobilinogeno() {
		return lblUrobilinogeno;
	}

	public JLabel getLblNitrito() {
		return lblNitrito;
	}

	public JLabel getLblLeucocitosPc() {
		return lblLeucocitosPc;
	}

	public JLabel getLblPiocitosPc() {
		return lblPiocitosPc;
	}

	public JLabel getLblEritrocitosPc() {
		return lblEritrocitosPc;
	}

	public JLabel getLblCelulasAltas() {
		return lblCelulasAltas;
	}

	public JLabel getLblBacterias() {
		return lblBacterias;
	}

	public JLabel getLblHongos() {
		return lblHongos;
	}

	public JLabel getLblMoco() {
		return lblMoco;
	}

	public JLabel getLblCristales() {
		return lblCristales;
	}

	public JLabel getLblCilindros() {
		return lblCilindros;
	}

	public JLabel getLblComentarios_1() {
		return lblComentarios_1;
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
	public AnalisisUroanalisis() {
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
		lblCerrarSesion = new JLabel("Cerrar Sesion");
		
		lblPH = new JLabel("Ph:");
		
		lblProteina = new JLabel("Proteína:");
		
		lblGlucosa = new JLabel("Glucosa:");
		
		lblCetiona = new JLabel("Cetiona:");
		
		lblBilirrubinaTotal = new JLabel("Bilirrubina Total:");
		
		lblHemoglobina = new JLabel("Hemoglobina:");
		
		lblDensidad = new JLabel("Densidad:");
		
		textDensidad = new JTextField();
		textDensidad.setColumns(10);
		
		lblUrobilinogeno = new JLabel("Urobilinogeno:");
		
		lblNitrito = new JLabel("Nitrito:");
		
		textPH = new JTextField();
		textPH.setColumns(10);
		
		textProteina = new JTextField();
		textProteina.setColumns(10);
		
		textGlucosa = new JTextField();
		textGlucosa.setColumns(10);
		
		textCetiona = new JTextField();
		textCetiona.setColumns(10);
		
		textBilirrubinaTotal = new JTextField();
		textBilirrubinaTotal.setColumns(10);
		
		textHemoglobina = new JTextField();
		textHemoglobina.setColumns(10);
		
		textUrobilinogeno = new JTextField();
		textUrobilinogeno.setColumns(10);
		
		lblLeucocitosPc = new JLabel("Leucocitos Pc:");
		
		textLeucocitosPc = new JTextField();
		textLeucocitosPc.setColumns(10);
		
		lblPiocitosPc = new JLabel("Piocitos Pc:");
		
		textPiocitosPc = new JTextField();
		textPiocitosPc.setColumns(10);
		
		lblEritrocitosPc = new JLabel("Eritrocitos Pc:");
		
		textEritrocitosPc = new JTextField();
		textEritrocitosPc.setColumns(10);
		
		lblCelulasAltas = new JLabel("Celulas Altas:");
		
		textCelulasAltas = new JTextField();
		textCelulasAltas.setColumns(10);
		
		lblBacterias = new JLabel("Bacterias:");
		
		lblHongos = new JLabel("Hongos:");
		
		textHongos = new JTextField();
		textHongos.setColumns(10);
		
		textBacterias = new JTextField();
		textBacterias.setColumns(10);
		
		lblMoco = new JLabel("Moco:");
		
		textMoco = new JTextField();
		textMoco.setColumns(10);
		
		textNitrito = new JTextField();
		textNitrito.setColumns(10);
		
		lblCristales = new JLabel("Cristales:");
		
		textCristales = new JTextField();
		textCristales.setColumns(10);
		
		lblCilindros = new JLabel("Cilindros:");
		
		textCilindros = new JTextField();
		textCilindros.setColumns(10);
		
		lblComentarios_1 = new JLabel("Comentarios:");
		
		textComentarios = new JTextArea();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblPH)
										.addComponent(lblHemoglobina)
										.addComponent(lblDensidad)
										.addComponent(lblProteina)
										.addComponent(lblGlucosa)
										.addComponent(lblCetiona)
										.addComponent(lblBilirrubinaTotal)
										.addComponent(lblUrobilinogeno)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(78)
									.addComponent(lblNitrito)))
							.addGap(40))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblComentarios_1)
							.addGap(34)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textDensidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textProteina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textPH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textGlucosa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textCetiona, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textBilirrubinaTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textHemoglobina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(23)
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblPiocitosPc)
														.addComponent(lblEritrocitosPc)))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(24)
													.addComponent(lblLeucocitosPc)))
											.addGap(37))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblCelulasAltas)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(lblBacterias)
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblMoco)
														.addComponent(lblHongos)
														.addComponent(lblCristales))))
											.addGap(27))))
								.addComponent(textUrobilinogeno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textMoco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textHongos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textBacterias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textEritrocitosPc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPiocitosPc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textLeucocitosPc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCelulasAltas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCristales, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCilindros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(739)
							.addComponent(lblCerrarSesion, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textNitrito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(46)
							.addComponent(lblCilindros))
						.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
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
										.addComponent(textDensidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDensidad)
										.addComponent(textLeucocitosPc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblPH)
												.addComponent(textPH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblProteina)
												.addComponent(textProteina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textEritrocitosPc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblGlucosa)
												.addComponent(textGlucosa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textCelulasAltas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCelulasAltas)))
										.addComponent(textPiocitosPc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(20)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblCetiona)
												.addComponent(textCetiona, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(18)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblBilirrubinaTotal)
														.addComponent(textBilirrubinaTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGap(18)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblHemoglobina)
														.addComponent(textHemoglobina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGroup(groupLayout.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(textHongos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblHongos))
													.addGap(18)
													.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(textMoco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblMoco)))))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(textBacterias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblBacterias)))))
								.addComponent(lblCerrarSesion))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUrobilinogeno)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(textUrobilinogeno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblCristales)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(14)
											.addComponent(lblNitrito))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textNitrito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(lblCilindros))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textCristales, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textCilindros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblLeucocitosPc)
							.addGap(26)
							.addComponent(lblPiocitosPc)
							.addGap(14)
							.addComponent(lblEritrocitosPc)))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(lblComentarios_1))
						.addComponent(textComentarios, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(458))
		);
		setLayout(groupLayout);

	}
}
