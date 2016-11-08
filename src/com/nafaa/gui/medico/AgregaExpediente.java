package com.nafaa.gui.medico;

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

import javax.swing.JTextArea;

import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

public class AgregaExpediente extends JPanel implements ActionListener {
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
	private JTable table_1;
	private JButton btnCitaLab;
	private JButton btnHistorial;
	private JButton btnAgregarExp;
	private JTextArea consulta;
	private JTextArea problema;
	private JTextArea revision;
	private JTextArea diagnostico;
	private JTextArea receta;
	private String pacienteNombre;
	
	/**
	 * Create the panel.
	 */
	public AgregaExpediente(String pacienteNombre) {
		this.pacienteNombre = pacienteNombre;
		System.out.println(pacienteNombre);
		calendar = GregorianCalendar.getInstance();
		calendarAgent = new CalendarAgent();
		calendarAgent.getjTable().setDragEnabled(false);
        calendarAgent.getjTable().setShowGrid(false);
       // calendarAgent.getjTable().addMouseListener(this);
        calendarAgent.getjTable().setEnabled(false);
        calendarAgent.setTable(calendar);
        calendarAgent.getjTable().setRowHeight(26);
       
		loadDialogs();
		setBackground(SystemColor.window);
		
		JLabel lblEnfermedadOProblema = new JLabel("Enfermedad o Problema.");
		
		JLabel lblMotivo = new JLabel("Motivo De La Consulta:");
		
		consulta = new JTextArea();
		
		problema = new JTextArea();
		
		JLabel lblRevisin = new JLabel("Revisión:");
		
		revision = new JTextArea();
		
		JLabel lblDiagnstico = new JLabel("Diagnóstico");
		
		diagnostico = new JTextArea();
		
		JLabel lblReceta = new JLabel("Receta:");
		
		receta = new JTextArea();
		
		btnHistorial = new JButton("Ver Historial");
		btnHistorial.addActionListener(this);
		btnCitaLab = new JButton("Agendar Cita Laboratorio");
		btnCitaLab.addActionListener(this);
		btnAgregarExp = new JButton("Agregar Expediente");
		btnAgregarExp.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("Historial Expedientes:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(diagnostico, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblMotivo)
							.addContainerGap(320, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(consulta, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
							.addGap(94))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblEnfermedadOProblema)
							.addContainerGap(309, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(problema, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
							.addGap(94))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblRevisin, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
							.addGap(94))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(revision, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
							.addGap(94))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDiagnstico, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(192, Short.MAX_VALUE))
						.addComponent(lblReceta)
						.addComponent(btnAgregarExp)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(receta, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(scrollPane, 0, 0, Short.MAX_VALUE)
						.addComponent(btnCitaLab, GroupLayout.PREFERRED_SIZE, 204, Short.MAX_VALUE))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(85)
							.addComponent(btnHistorial, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMotivo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(consulta, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnfermedadOProblema)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(problema, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblRevisin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(revision, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDiagnstico)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(diagnostico, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblReceta)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(receta, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAgregarExp)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCitaLab)
						.addComponent(btnHistorial))
					.addGap(27))
		);
		
		scrollPane.setViewportView(calendarAgent.getjTable());
		setLayout(groupLayout);
		

		table = new JTable(){
			public boolean isCellEditable(int row, int column) {      
	        	if(column == 0)
	        		return true;
	        		else 
	            return false;     
	        }
	        
	        @Override
	        public Class<?> getColumnClass(int columnIndex) {
	            if(columnIndex == 0){
	                return Boolean.class;
	            }
	            return super.getColumnClass(columnIndex);
	        }
		};
		
		dtm = new DefaultTableModel(0, 0);
	    String header[] = new String[] { "#", "Problema"};
	    dtm.setColumnIdentifiers(header);
	    table.setModel(dtm);
	    table.getTableHeader().setReorderingAllowed(false);
	    table.getTableHeader().setResizingAllowed(false);
		scrollPane_1.setViewportView(table);
	String curp = Database.getDatabase().queryDMLExtract("idCurp","SELECT idCurp FROM Naafa_corp.Paciente WHERE NombreCompleto='"+pacienteNombre+"'");
	data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM Naafa_corp.Expediente WHERE idCurp = '"+curp+"'"),"Enfermedad_Problema");
	for(int i = 0; i < data.size();i++){
		dtm.addRow(new Object[]{false,data.get(i).get(0)});
	}
	
	 //data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM mydb.Cita,mydb.Medico,mydb.Usuario WHERE Medico_idMedico = '"+paciente.get(0).get(0)+"' AND Medico_idMedico = Medico.idMedico AND Paciente_Usuario_idUsuario = Usuario.idUsuario AND Cita.fecha ='2016/04/"+dia+"'"),"hora");

	}

	private void loadDialogs() {
		modificarAdmin = new JDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCitaLab){
			// PENDIENTE ASIGNARLE LA CITA AL PACIENTE.
			String curp = Database.getDatabase().queryDMLExtract("idCurp","SELECT idCurp FROM Naafa_corp.Paciente WHERE NombreCompleto='"+pacienteNombre+"'");
			String laboratorista = Database.getDatabase().queryDMLExtract("idEmpleado","SELECT idEmpleado FROM Naafa_corp.Empleados WHERE '14:00:00' BETWEEN HorarioInicia AND HorarioTermina AND TipoEmpleado='Laboratorista' ORDER BY RAND() LIMIT 1");
			String dia = ""+calendarAgent.getjTable().getValueAt(calendarAgent.getjTable().getSelectedRow(), calendarAgent.getjTable().getSelectedColumn());
			//HORA PENDIENTE.
    			Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Citas (TipoCita,Fecha,Hora,Consultorio,idCurp,idEmpleado) VALUES('Programada','2016/"+calendarAgent.getCurrentMoth()+"/"+dia+"','14:00:00','2D','"+curp+"','"+laboratorista+"')");
    			javax.swing.JOptionPane.showInputDialog(this,"Hora");
    			javax.swing.JOptionPane.showMessageDialog(this, "Se ha agendado una cita en el laboratorio");
		} else if(e.getSource() == btnHistorial){
			/*
			 * Pendiente nuevo JPanel cargando historial de expedientes del paciente.
			 * Para eso agarramos el usuario paciente con un query y despues con ese dato
			 * obtenemos sus expedientes para mostrarlos en una tabla.
			 */
		} else if(e.getSource() == btnAgregarExp){
			//PEDIENTE EL USUARIO CURP
			String curp = Database.getDatabase().queryDMLExtract("idCurp","SELECT idCurp FROM Naafa_corp.Paciente WHERE NombreCompleto='"+pacienteNombre+"'");
			Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Expediente (Enfermedad_Problema,idCurp,Motivo_Consulta,Revision,Diagnostico) VALUES('"+problema.getText()+"','"+curp+"','"+consulta.getText()+"','"+revision.getText()+"','"+diagnostico.getText()+"')");
		}
		
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
