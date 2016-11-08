package com.nafaa.gui.laboratorista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import com.nafaa.database.Database;
import com.nafaa.database.Query;
import com.nafaa.gui.Ventana;
import com.nafaa.util.CalendarAgent;

import java.awt.Font;

import javax.swing.BoxLayout;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.xml.crypto.Data;

public class Analisis extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JDialog modificarAdmin;
	private Map<Integer, List<String>> data;
	private DefaultTableModel dtm;
	private CalendarAgent calendarAgent;
	private Calendar calendar;
	private JTable table;
	private JButton btnNewButton_1;
	private JLabel lblTipoAnalisis;
	private JComboBox comboBox;
	private JPanel panel;
    private String pacienteNombre;
    private String usuarioID;
	private String pacienteID;
	/**
	 * Paneles del box.
	 */
	private AnalisisCoprologico coprologico;
	private AnalisisHematologico hematologico;
	private AnalisisOtros otros;
	private AnalisisUroanalisis uroAnalisis;
	private AnalisisQuimica quimica;

    public void initPaneles(){
        coprologico = new AnalisisCoprologico();
        hematologico = new AnalisisHematologico();
        otros = new AnalisisOtros();
        uroAnalisis = new AnalisisUroanalisis();
        quimica = new AnalisisQuimica();
    }

	/**
	 * Create the panel.
	 */
	public Analisis(String pacienteNombre) {
		initPaneles();
        this.pacienteNombre = pacienteNombre;
		calendar = GregorianCalendar.getInstance();
		calendarAgent = new CalendarAgent();
		calendarAgent.getjTable().setDragEnabled(false);
        calendarAgent.getjTable().setShowGrid(false);
       // calendarAgent.getjTable().addMouseListener(this);
        calendarAgent.getjTable().setEnabled(false);
        calendarAgent.setTable(calendar);
        calendarAgent.getjTable().setRowHeight(26);
        calendarAgent.getjTable().addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				String dia = ""+calendarAgent.getjTable().getValueAt(calendarAgent.getjTable().getSelectedRow(), calendarAgent.getjTable().getSelectedColumn());
				int rowCount = dtm.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
				    dtm.removeRow(i);
				}
				
			    Map<Integer, List<String>> paciente = Database.getDatabase().queryDMLExtraAny(new Query("SELECT Laboratorista.idLaboratorista,Laboratorista.Usuario_idUsuario FROM mydb.Usuario,mydb.Laboratorista WHERE idUsuario = '"+Ventana.idUsuario+"' AND  idUsuario = Laboratorista.Usuario_idUsuario"),"idLaboratorista","Usuario_idUsuario");
			    
				
				 data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT CONCAT(Usuario.nombre,' ',Usuario.apellidos) as 'Nombre Completo' FROM mydb.Cita,mydb.Laboratorista,mydb.Usuario WHERE Laboratorista_idLaboratorista = '"+paciente.get(0).get(0)+"' AND Laboratorista_idLaboratorista = Laboratorista.idLaboratorista AND Paciente_Usuario_idUsuario = Usuario.idUsuario AND Cita.fecha ='2016/"+calendarAgent.getCurrentMoth()+"/"+dia+"' "),"Nombre Completo");
				for(int i = 0; i < data.size();i++){
						dtm.addRow(new Object[]{false,data.get(i).get(0)});
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
        	
        });
		loadDialogs();
		setBackground(Color.WHITE);
		
		lblTipoAnalisis = new JLabel("Tipo Análisis:");
		
		btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(this);
		panel = new JPanel();
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecciona análisis", "Coprológico","Hematológico","Quimica","Uroanálisis","Otro"}));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTipoAnalisis)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipoAnalisis)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addGap(59)
					.addComponent(btnNewButton_1)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{70, 117, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{45, 0, 25, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		setLayout(groupLayout);
		

    dtm = new DefaultTableModel(0, 0);
    String header[] = new String[] { "#", "Nombre Completo"};
    dtm.setColumnIdentifiers(header);
    


	String parseNombre[] = pacienteNombre.split(" ");
    usuarioID = Database.getDatabase().queryDMLExtract("idUsuario","SELECT * FROM mydb.Usuario WHERE nombre='"+parseNombre[0]+"' AND apellidos='"+parseNombre[1]+"'");
    pacienteID = Database.getDatabase().queryDMLExtract("idPaciente","SELECT * FROM mydb.Paciente WHERE Usuario_idUsuario = '"+usuarioID+"'");
	}

	private void loadDialogs() {
		modificarAdmin = new JDialog();
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
				panel.add(uroAnalisis);
				panel.revalidate();
				panel.repaint();
			} else if(comboBox.getSelectedItem().equals("Otro")){
				panel.removeAll();
				panel.add(otros);
				panel.revalidate();
				panel.repaint();
			}

		} else if(e.getSource() == btnNewButton_1){
            Component[] comp = panel.getComponents();
            for(Component component: comp){
                if(component instanceof AnalisisQuimica){
                   /* String informacion = quimica.getLblNewLabel_1().getText()+"-"+quimica.getTextField().getText()+"-"+
                            quimica.getLblNewLabel_2().getText()+"-"+quimica.getTextField_1().getText()+"-"+
                            quimica.getLblNewLabel_3().getText()+"-"+quimica.getTextField_2().getText()+"-"+
                            quimica.getLblNewLabel_4().getText()+"-"+quimica.getTextField_3().getText()+"-"+
                            quimica.getLblNewLabel_5().getText()+"-"+quimica.getTextField_4().getText()+"-"+
                            quimica.getLblNewLabel_6().getText()+"-"+quimica.getTextField_5().getText()+"-"+
                            quimica.getLblNewLabel_7().getText()+"-"+quimica.getTextField_6().getText()+"-"+
                            quimica.getLblNewLabel_9().getText()+"-"+quimica.getTextField_7().getText()+"-"+
                            quimica.getLblNewLabel_10().getText()+"-"+quimica.getTextField_8().getText()+"-"+
                            quimica.getLblNewLabel_11().getText()+"-"+quimica.getTextField_10().getText()+"-"+
                            quimica.getLblFibras().getText()+"-"+quimica.getTextField_11().getText()+"-"+
                            quimica.getLblNewLabel().getText()+"-"+quimica.getTextField_12().getText()+"-";*/

                    Database.getDatabase().easyQuery("INSERT INTO mydb.Analisis " +
                            "(Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            " VALUES('"+pacienteID+"','"+usuarioID+"','Quimica','')");
                } else if(component instanceof AnalisisOtros){
                    /*String informacion = otros.getLblNewLabel()+"-"+otros.getTextArea().getText()+"-"+
                            otros.getLblNewLabel_1().getText()+"-"+otros.getTextArea_1().getText()+"-";*/

                    Database.getDatabase().easyQuery("INSERT INTO mydb.Analisis " +
                            " (Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            " VALUES('"+pacienteID+"','"+usuarioID+"','Otros','')");
                } else if(component instanceof AnalisisHematologico){
                    /*String informacion = hematologico.getHGB().getText()+"-"+hematologico.getTextField().getText()+"-"+
                            hematologico.getAtir().getText()+"-"+hematologico.getTextField_17().getText()+"-"+
                            hematologico.getLblNewLabel_2().getText()+"-"+hematologico.getTextField_1().getText()+"-"+
                            hematologico.getLblNewLabel_3().getText()+"-"+hematologico.getTextField_2().getText()+"-"+
                            hematologico.getLblNewLabel_4().getText()+"-"+hematologico.getTextField_3().getText()+"-"+
                            hematologico.getLblNewLabel_5().getText()+"-"+hematologico.getTextField_4().getText()+"-"+
                            hematologico.getLblNewLabel_6().getText()+"-"+hematologico.getTextField_5().getText()+"-"+
                            hematologico.getLblNewLabel_7().getText()+"-"+hematologico.getTextField_6().getText()+"-"+
                            hematologico.getLblNewLabel_8().getText()+"-"+hematologico.getTextField_7().getText()+"-"+
                            hematologico.getLblNewLabel_9().getText()+"-"+hematologico.getTextField_8().getText()+"-"+
                            hematologico.getLblNewLabel_10().getText()+"-"+hematologico.getTextField_9().getText()+"-"+
                            hematologico.getLblNewLabel_11().getText()+"-"+hematologico.getTextField_10().getText()+"-"+
                            hematologico.getLblNewLabel_12().getText()+"-"+hematologico.getTextField_11().getText()+"-"+
                            hematologico.getLblNewLabel_13().getText()+"-"+hematologico.getTextField_12().getText()+"-"+
                            hematologico.getLblNewLabel_14().getText()+"-"+hematologico.getTextField_13().getText()+"-"+
                            hematologico.getLblNewLabel_15().getText()+"-"+hematologico.getTextField_14().getText()+"-"+
                            hematologico.getLblNewLabel_16().getText()+"-"+hematologico.getTextField_15().getText()+"-"+
                            hematologico.getHtc().getText()+"-"+hematologico.getTextField_16().getText()+"-";*/

                    Database.getDatabase().easyQuery("INSERT INTO mydb.Analisis " +
                            " (Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            "VALUES('"+pacienteID+"','"+usuarioID+"','Hematologico','')");
                } else if(component instanceof AnalisisUroanalisis){
                   /* String informacion = uroAnalisis.getLblNewLabel().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_1().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_2().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_3().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_4().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_5().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_6().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_7().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_9().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_10().getText()+"-"+uroAnalisis.getTextField().getText()+"-"+
                            uroAnalisis.getLblNewLabel_11().getText()+"-"+uroAnalisis.getTextField().getText()+"-";*/
                    Database.getDatabase().easyQuery("INSERT INTO mydb.Analisis " +
                            " (Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            " VALUES('"+pacienteID+"','"+usuarioID+"','UroAnalisis','')");
                } else if(component instanceof AnalisisCoprologico){
                	/*
                	 *Colocar datos de analisis aqui. 
                	 */
                /*   String informacion = coprologico.getLblNewLabel_1().getText()+"-"+coprologico.getTextField().getText()+"-"+
                            coprologico.getLblNewLabel_2().getText()+"-"+coprologico.getTextField_1().getText()+"-"+
                            coprologico.getLblNewLabel_3().getText()+"-"+coprologico.getTextField_2().getText()+"-"+
                            coprologico.getLblNewLabel_4().getText()+"-"+coprologico.getTextField_3().getText()+"-"+
                            coprologico.getLblNewLabel_5().getText()+"-"+coprologico.getTextField_4().getText()+"-"+
                            coprologico.getLblNewLabel_6().getText()+"-"+coprologico.getTextField_5().getText()+"-"+
                            coprologico.getLblNewLabel_7().getText()+"-"+coprologico.getTextField_6().getText()+"-"+
                            coprologico.getLblNewLabel_9().getText()+"-"+coprologico.getTextField_7().getText()+"-"+
                            coprologico.getLblNewLabel_10().getText()+"-"+coprologico.getTextField_8().getText()+"-"+
                            coprologico.getLblNewLabel_11().getText()+"-"+coprologico.getTextField_9().getText()+"-"+
                            coprologico.getLblNewLabel_12().getText()+"-"+coprologico.getTextField_10().getText()+"-"+
                            coprologico.getLblNewLabel_13().getText()+"-"+coprologico.getTextField_11().getText()+"-"+
                            coprologico.getLblNewLabel_14().getText()+"-"+coprologico.getTextField_12().getText()+"-"+
                            coprologico.getLblNewLabel_15().getText()+"-"+coprologico.getTextField_13().getText()+"-"+
                            coprologico.getLblNewLabel_16().getText()+"-"+coprologico.getTextField_14().getText()+"-";*/
                    Database.getDatabase().easyQuery("INSERT INTO mydb.Analisis " +
                            "(Paciente_idPaciente,Paciente_Usuario_idUsuario,tipoAnalisis,informacion)" +
                            "VALUES('"+pacienteID+"','"+usuarioID+"','Coprologico','')");
                }
            }
        }
		
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
