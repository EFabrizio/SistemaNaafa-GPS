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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import com.nafaa.database.Database;
import com.nafaa.database.Query;
import com.nafaa.gui.Registro_Empleado;
import com.nafaa.gui.Ventana;
import com.nafaa.gui.medico.AgregaExpediente;
import com.nafaa.util.CalendarAgent;

import java.awt.Font;

public class AgendarCitaLaboratorista extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table_1;
	private Map<Integer, List<String>> data;
	private DefaultTableModel dtm;
	private CalendarAgent calendarAgent;
	private Calendar calendar;
	private JTable table;
	private static List<String> horas = new ArrayList<String>();
	private JButton btnNewButton;
	private RegistroCita registroCita;
	private JDialog dialog;
	private JScrollPane scrollPane_1;
	private JLabel lblAbril;
	
	/**
	 * Create the panel.
	 */
	public AgendarCitaLaboratorista() {
		horas.add("08:00:00");
		horas.add("08:20:00");
		horas.add("08:40:00");
		horas.add("09:00:00");
		horas.add("09:20:00");
		horas.add("09:40:00");
		horas.add("10:00:00");
		horas.add("10:20:00");
		horas.add("10:40:00");
		horas.add("11:00:00");
		horas.add("11:20:00");
		horas.add("11:40:00");
		horas.add("12:00:00");
		horas.add("12:20:00");
		horas.add("12:40:00");
		horas.add("13:20:00");
		horas.add("13:40:00");
		horas.add("14:00:00");
		horas.add("14:20:00");
		horas.add("14:40:00");
		horas.add("15:00:00");
		horas.add("15:20:00");
		horas.add("15:40:00");
		horas.add("16:00:00");
		horas.add("16:20:00");
		horas.add("16:40:00");
		horas.add("17:00:00");
		horas.add("17:20:00");
		horas.add("17:40:00");
		horas.add("18:00:00");
		horas.add("18:20:00");
		horas.add("18:40:00");
		horas.add("19:00:00");
		horas.add("19:20:00");
		horas.add("19:40:00");
		horas.add("20:00:00");
		
		calendar = GregorianCalendar.getInstance();
		calendarAgent = new CalendarAgent();
		calendarAgent.getjTable().setDragEnabled(false);
        calendarAgent.getjTable().setShowGrid(false);
       // calendarAgent.getjTable().addMouseListener(this);
        calendarAgent.getjTable().setEnabled(false);
        calendarAgent.setTable(calendar);
        calendarAgent.getjTable().setRowHeight(34);
        calendarAgent.getjTable().addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				String dia = ""+calendarAgent.getjTable().getValueAt(calendarAgent.getjTable().getSelectedRow(), calendarAgent.getjTable().getSelectedColumn());
				int rowCount = dtm.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
				    dtm.removeRow(i);
				}
				
				
			    data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT Paciente.* FROM Naafa_corp.Citas,Naafa_corp.Paciente,Naafa_corp.Empleados,Naafa_corp.Usuario WHERE Citas.idCurp = Paciente.idCurp AND Citas.idEmpleado = Empleados.idEmpleado AND Empleados.idUsuario = Usuario.idUsuario AND Usuario.idUsuario ='"+Ventana.idUsuario+"' AND Citas.Fecha = '2016/"+calendarAgent.getCurrentMoth()+"/"+dia+"'"),
			    		"idCurp","NombreCompleto","Sexo","idUsuario","Tipo_Sangre","FechaNacimiento","Domicilio");
			    for(int i = 0; i < data.size();i++){
				   dtm.addRow(new Object[]{false,data.get(i).get(1)});
			   }

	

			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
        	
        });
		loadDialogs();
		setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane_1 = new JScrollPane();
		
		btnNewButton = new JButton("Ver citas");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 51, 51));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.addActionListener(this);
		
		lblAbril = new JLabel("Mayo");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(88)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAbril)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
							.addGap(148)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblAbril)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		
		table_1 = new JTable(){
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
		
	scrollPane_1.setViewportView(table_1);
		
		scrollPane.setViewportView(calendarAgent.getjTable());
		setLayout(groupLayout);

    dtm = new DefaultTableModel(0, 0);
    String header[] = new String[] {"#","Nombre Paciente"};
    dtm.setColumnIdentifiers(header);
    table_1.setModel(dtm);
    table_1.getTableHeader().setReorderingAllowed(false);
    table_1.getTableHeader().setResizingAllowed(false);
	String dia = ""+calendarAgent.getjTable().getValueAt(calendarAgent.getjTable().getSelectedRow(), calendarAgent.getjTable().getSelectedColumn());
    data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT Paciente.* FROM Naafa_corp.Citas,Naafa_corp.Paciente,Naafa_corp.Empleados,Naafa_corp.Usuario WHERE Citas.idCurp = Paciente.idCurp AND Citas.idEmpleado = Empleados.idEmpleado AND Empleados.idUsuario = Usuario.idUsuario AND Usuario.idUsuario ='"+Ventana.idUsuario+"' AND Citas.Fecha = '2016/"+calendarAgent.getCurrentMoth()+"/"+dia+"'"),
    		"idCurp","NombreCompleto","Sexo","idUsuario","Tipo_Sangre","FechaNacimiento","Domicilio");
    for(int i = 0; i < data.size();i++){
	   dtm.addRow(new Object[]{false,data.get(i).get(1)});
   }

	

	}

	private void loadDialogs() {
		registroCita = new RegistroCita();
		registroCita.getBtnAgendar().addActionListener(this);
		registroCita.getBtnNewButton().addActionListener(this);
		dialog = new JDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton){
			final JDialog empleado = new JDialog();
			JButton boton = new JButton("Checar expediente");
			boton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					boolean value;
					for(int i = 0; i < dtm.getRowCount();i++){
						value =  (boolean) dtm.getValueAt(i, 0);
						if(value){
						//javax.swing.JOptionPane.showMessageDialog(null, "Expediente:\n"+"Nombre Completo: "+data.get(i).get(1) + "\n Sexo: "+data.get(i).get(2)+"\n Tipo Sangre: "+data.get(i).get(4)+"\n Fecha Nacimiento:  "+data.get(i).get(5)+"\n Domicilio: "+data.get(i).get(6));
						empleado.getContentPane().removeAll();
						empleado.getContentPane().add(new PanelTipoAnalisis((String)dtm.getValueAt(i, 1)),BorderLayout.CENTER);
						empleado.revalidate();
						empleado.repaint();
						empleado.setTitle("Analísis");
						}
						}
					//String curp = Database.getDatabase().queryDMLExtract("idCurp","SELECT idCurp FROM Naafa_corp.Paciente,Naafa_corp.Usuario WHERE Paciente.idUsuario = Usuario.idUsuario AND Usuario.idUsuario = '"+Ventana.idUsuario+"'");
					//String medico = Database.getDatabase().queryDMLExtract("idEmpleado","SELECT idEmpleado FROM Naafa_corp.Empleados WHERE '"+hora+"' BETWEEN HorarioInicia AND HorarioTermina AND TipoEmpleado='Medico' ORDER BY RAND() LIMIT 1");
					
				//Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Citas (TipoCita,Fecha,Hora,Consultorio,idCurp,idEmpleado) VALUES('Programada','2016/04/"+dia+"','"+hora+"','2D','"+curp+"','"+medico+"')");
					
				}
				
			});
			empleado.setTitle("Pacientes");
			empleado.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			empleado.setBounds(100, 100, 640, 690);
			empleado.getContentPane().setLayout(new BorderLayout(0, 0));
			empleado.getContentPane().add(scrollPane_1 ,BorderLayout.CENTER);
			empleado.getContentPane().add(boton ,BorderLayout.SOUTH);
			empleado.setVisible(true);
		} 
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
