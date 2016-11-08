package com.nafaa.gui.laboratorista;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.nafaa.database.Database;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTipoAnalisis extends JPanel implements ActionListener{

		private JLabel actualizarDatos;
		private JComboBox comboBox;
		private JPanel panel;
		private JButton btnNewButton;
		private AnalisisQuimica quimica;
		private AnalisisCoprologico coprologico;
		private AnalisisHematologico hematologico;
		private AnalisisUroanalisis uroanalisis;
		private AnalisisOtros otros;
		private String name;
		
		
	public JLabel getActualizarDatos() {
			return actualizarDatos;
		}

	/**
	 * Create the panel.
	 */
	public PanelTipoAnalisis(String name) {
		this.name = name;
		setBackground(Color.WHITE);
		quimica = new AnalisisQuimica();
		coprologico = new AnalisisCoprologico();
		hematologico = new AnalisisHematologico();
		uroanalisis = new AnalisisUroanalisis();
		otros = new AnalisisOtros();
		
		actualizarDatos = new JLabel("Seleccione un Tipo de Análisis");
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecciona Análisis","Hematológico", "Coprológico", "Quimica", "Uroanálisis", "Otro"}));
		comboBox.addActionListener(this);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(this);
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
						.addComponent(actualizarDatos)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(actualizarDatos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox){
			if(comboBox.getSelectedItem().equals("Coprológico")){
				panel.removeAll();
				panel.add(coprologico);
				panel.revalidate();
				panel.repaint();
			} else if(comboBox.getSelectedItem().equals("Hematológico")){
				panel.removeAll();
				panel.add(hematologico);
				panel.revalidate();
				panel.repaint();
			} else if(comboBox.getSelectedItem().equals("Quimica")){
				panel.removeAll();
				panel.add(quimica);
				panel.revalidate();
				panel.repaint();
			} else if(comboBox.getSelectedItem().equals("Uroanálisis")){
				panel.removeAll();
				panel.add(uroanalisis);
				panel.revalidate();
				panel.repaint();
			} else if(comboBox.getSelectedItem().equals("Otro")){
				panel.removeAll();
				panel.add(otros);
				panel.revalidate();
				panel.repaint();
			}
		} else if(e.getSource() == btnNewButton){
			String curp = Database.getDatabase().queryDMLExtract("idCurp","SELECT idCurp FROM Naafa_corp.Paciente WHERE NombreCompleto='"+name+"'");
            Component[] comp = panel.getComponents();
            for(Component component: comp){
                if(component instanceof AnalisisQuimica){
                    String informacion = quimica.getLblGlucosa().getText()+"-"+quimica.getTextGlucosaAyunas().getText()+"-"+
                    		quimica.getLblGlucosa2().getText()+"-"+quimica.getTextGlucosa2().getText()+"-"+
                    		quimica.getLblUrea().getText()+"-"+quimica.getTextUrea().getText()+"-"+
                    		quimica.getLblCreatinina().getText()+"-"+quimica.getTextCreatinina().getText()+"-"+
                    		quimica.getLblAcidoUrico().getText()+"-"+quimica.getTextAcidoUrico().getText()+"-"+
                    		quimica.getLblBilirrubinaTotal().getText()+"-"+quimica.getTextBilirrubinaTotal().getText()+"-"+
                    		quimica.getLblBilirrubinaDirecta().getText()+"-"+quimica.getTextBiliburrinaDirecta().getText()+"-"+
                            quimica.getLblProteinaTotal().getText()+"-"+quimica.getTextProteinaTotal().getText()+"-"+
                            quimica.getLblAlbumina().getText()+"-"+quimica.getTextAlbumina().getText()+"-"+
                            quimica.getLblGlobulina().getText()+"-"+quimica.getTextGlobulina().getText()+"-"+
                            quimica.getLblTransPirubica().getText()+"-"+quimica.getTextTransPirubica().getText()+"-"+
                            quimica.getLblTransOxalacetica().getText()+"-"+quimica.getTextTransOxalacetica().getText()+"-"+
                            quimica.getLblFosfataAlcalina().getText()+"-"+quimica.getTextFosfataAlcalina().getText()+"-"+
                            quimica.getLblColesterolTotal().getText()+"-"+quimica.getTextColesterolTotal().getText()+"-"+
                            quimica.getLblColesterolLDL().getText()+"-"+quimica.getTextColesterolLDL().getText()+"-"+
                            quimica.getLblColesterolHDL().getText()+"-"+quimica.getTextColesterolHDL().getText()+"-"+
                            quimica.getLblTrigliceridos().getText()+"-"+quimica.getTextTrigliceridos().getText()+"-"+
                            quimica.getLblComentarios().getText()+"-"+quimica.getTextComentarios().getText()+"-";
                    		
                 
                    	
                   

                    Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Analisis " +
                            "(idCurp,tipoAnalisis,informacion)" +
                            " VALUES('"+curp+"','Quimica','"+informacion+"')");
                } else if(component instanceof AnalisisOtros){
                    String informacion = otros.getLblResultados()+"-"+otros.getTextResultados().getText()+"-"+
                            otros.getLblComentarios().getText()+"-"+otros.getTextComentarios().getText()+"-";

                    Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Analisis " +
                            " (Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            " VALUES('"+curp+"','Quimica','"+informacion+"')");
                    //Me quede aqUí lol AL RATO LE SIGO ANALISIS CROPOLOGICO LOL
                } else if(component instanceof AnalisisCoprologico){
                    String informacion = coprologico.getLblConsitencia().getText()+"-"+coprologico.getTextConsistencia().getText()+"-"+
                    		coprologico.getLblHemoglobina().getText()+"-"+coprologico.getTextHemoglobina().getText()+"-"+
                    		coprologico.getLblPH().getText()+"-"+coprologico.getTextPH().getText()+"-"+
                    		coprologico.getLblMicelios().getText()+"-"+coprologico.getTextMicelios().getText()+"-"+
                    		coprologico.getLblMoco().getText()+"-"+coprologico.getTextMoco().getText()+"-"+
                    		coprologico.getLblGlobulosR().getText()+"-"+coprologico.getTextGlobulosR().getText()+"-"+
                    		coprologico.getLblPolimorfos().getText()+"-"+coprologico.getTextPolimorfos().getText()+"-"+
                    		coprologico.getLblEsporas().getText()+"-"+coprologico.getTextEsporas().getText()+"-"+
                    		coprologico.getLblQuiste().getText()+"-"+coprologico.getTextQuiste().getText()+"-"+
                    		coprologico.getLblTrofo().getText()+"-"+coprologico.getTextTrofo().getText()+"-"+
                    		coprologico.getLblHelmintos().getText()+"-"+coprologico.getTextHelmintos().getText()+"-"+
                    		coprologico.getLblColor().getText()+"-"+coprologico.getTextColor().getText()+"-"+
                    		coprologico.getLblProtozoarios().getText()+"-"+coprologico.getTextProtozoarios().getText()+"-"+
                    		coprologico.getLblHuevo().getText()+"-"+coprologico.getTextHuevo().getText()+"-"+
                    		coprologico.getLblAlmidon().getText()+"-"+coprologico.getTextAlmidon().getText()+"-"+
                    		coprologico.getLblFibras().getText()+"-"+coprologico.getTextFibras().getText()+"-"+
                    		coprologico.getLblLarva().getText()+"-"+coprologico.getTextLarva().getText()+"-"+
                    		coprologico.getLblComentarios().getText()+"-"+coprologico.getTextComentarios().getText();
                    		

                    Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Analisis " +
                            " (Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            "VALUES('"+curp+"','Quimica','"+informacion+"')");
                } else if(component instanceof AnalisisUroanalisis){
                    String informacion = uroanalisis.getLblDensidad().getText()+"-"+uroanalisis.getTextDensidad().getText()+"-"+
                    		uroanalisis.getLblPH().getText()+"-"+uroanalisis.getTextPH().getText()+"-"+
                    		uroanalisis.getLblProteina().getText()+"-"+uroanalisis.getTextProteina().getText()+"-"+
                    		uroanalisis.getLblGlucosa().getText()+"-"+uroanalisis.getTextGlucosa().getText()+"-"+
                    		uroanalisis.getLblCetiona().getText()+"-"+uroanalisis.getTextCetiona().getText()+"-"+
                    		uroanalisis.getLblBilirrubinaTotal().getText()+"-"+uroanalisis.getTextBilirrubinaTotal().getText()+"-"+
                    		uroanalisis.getLblHemoglobina().getText()+"-"+uroanalisis.getTextHemoglobina().getText()+"-"+
                    		uroanalisis.getLblUrobilinogeno().getText()+"-"+uroanalisis.getTextUrobilinogeno().getText()+"-"+
                    		uroanalisis.getLblLeucocitosPc().getText()+"-"+uroanalisis.getTextLeucocitosPc().getText()+"-"+
                    		uroanalisis.getLblPiocitosPc().getText()+"-"+uroanalisis.getTextPiocitosPc().getText()+"-"+
                    		uroanalisis.getLblEritrocitosPc().getText()+"-"+uroanalisis.getTextEritrocitosPc().getText()+"-"+
                    		uroanalisis.getLblCelulasAltas().getText()+"-"+uroanalisis.getTextCelulasAltas().getText()+"-"+
                    		uroanalisis.getLblHongos().getText()+"-"+uroanalisis.getTextHongos().getText()+"-"+
                    		uroanalisis.getLblBacterias().getText()+"-"+uroanalisis.getTextBacterias().getText()+"-"+
                    		uroanalisis.getLblMoco().getText()+"-"+uroanalisis.getTextMoco().getText()+"-"+
                    		uroanalisis.getLblNitrito().getText()+"-"+uroanalisis.getTextNitrito().getText()+"-"+
                    		uroanalisis.getLblCristales().getText()+"-"+uroanalisis.getTextCristales().getText()+"-"+
                    		uroanalisis.getLblCilindros().getText()+"-"+uroanalisis.getTextCilindros().getText()+"-"+
                    		uroanalisis.getLblComentarios_1().getText()+"-"+uroanalisis.getTextComentarios().getText();
    
                    Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Analisis " +
                            " (Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            "VALUES('"+curp+"','Quimica','"+informacion+"')");
                } else if(component instanceof AnalisisHematologico){
                    String informacion = hematologico.getLblVelocidadDeSegmentacion().getText()+"-"+hematologico.getTextVelocidadDeSegmentacion().getText()+"-"+
                    		hematologico.getLblPlaquetas().getText()+"-"+hematologico.getTextPlaquetas().getText()+"-"+
                    		hematologico.getLblMetam().getText()+"-"+hematologico.getTextMetam().getText()+"-"+
                    		hematologico.getLblSegme().getText()+"-"+hematologico.getTextSegme().getText()+"-"+
                    		hematologico.getLblCayad().getText()+"-"+hematologico.getTextCayad().getText()+"-"+
                    		hematologico.getLblEosin().getText()+"-"+hematologico.getTextEosin().getText()+"-"+
                    		hematologico.getLblVcm().getText()+"-"+hematologico.getTextVCM().getText()+"-"+
                    		hematologico.getLblLinfo().getText()+"-"+hematologico.getTextLinfo().getText()+"-"+
                    		hematologico.getLblBansof().getText()+"-"+hematologico.getTextBansof().getText()+"-"+
                    		hematologico.getLblMonoc().getText()+"-"+hematologico.getTextMonoc().getText()+"-"+
                    		hematologico.getLblHipocromia().getText()+"-"+hematologico.getTextHipocromia().getText()+"-"+
                    		hematologico.getLblAnsocosotosis().getText()+"-"+hematologico.getTextAnsocosotosis().getText()+"-"+
                    		hematologico.getLblPoiquilocit().getText()+"-"+hematologico.getTextPoiquilocit().getText()+"-"+
                    		hematologico.getLblMicrocitosis().getText()+"-"+hematologico.getTextMicrocitosis().getText()+"-"+
                    		hematologico.getLblPolicromat().getText()+"-"+hematologico.getTextPolicromat().getText()+"-"+
                    		hematologico.getLblReticulocitos().getText()+"-"+hematologico.getTextReticulocitos().getText()+"-"+
                    		hematologico.getLblDrepanocitos().getText()+"-"+hematologico.getTextDrepanositos().getText()+"-"+
                    		hematologico.getLblGrupo().getText()+"-"+hematologico.getTextGrupo().getText()+"-"+
                    		hematologico.getLblCoombsDirecto().getText()+"-"+hematologico.getTextCoombsDirecto().getText()+"-"+
                    		hematologico.getLblCoombsIndirecto().getText()+"-"+hematologico.getTextCoombsIndirecto().getText()+"-"+
                    		hematologico.getLblProtombina().getText()+"-"+hematologico.getTextProtombina().getText()+"-"+
                    		hematologico.getLblTTP().getText()+"-"+hematologico.getTextTTP().getText()+"-"+
                    		hematologico.getLblHGB().getText()+"-"+hematologico.getTextHGB().getText()+"-"+
                    		hematologico.getLblAtipi().getText()+"-"+hematologico.getTextAtipi().getText()+"-"+
                    		hematologico.getLblComentarios().getText()+"-"+hematologico.getTextComentarios().getText()+"-";
                    		      
 

                    Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Analisis " +
                            "(Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            "VALUES('"+curp+"','Quimica','"+informacion+"')");
                }
            }
		}
		
	}	
	}
