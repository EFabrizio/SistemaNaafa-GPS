package com.nafaa.gui.medico;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.JTextField;

import com.nafaa.database.Database;
import com.nafaa.database.Query;
import com.nafaa.gui.Ventana;

public class MostrarExpedienteTodos extends JPanel implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel dtm;
	private JLabel lblNombreno;
	private JLabel lblDireccion;
	private Map<Integer, List<String>> data;
	private JScrollPane scrollPane;
	private JLabel lblSexo;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MostrarExpedienteTodos() {
		setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		btnNewButton_1 = new JButton("Ver expediente");
		btnNewButton_1.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(btnNewButton_1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addContainerGap(186, Short.MAX_VALUE))
		);
		
		lblNombreno = new JLabel("Motivo consulta:");
		
		lblDireccion = new JLabel("Problema actual:");
		
		lblSexo = new JLabel("Diagnostico:");
		
		scrollPane = new JScrollPane();
		
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
	    String header[] = new String[] { "#", "Fecha","Hora","Nombre Paciente"};
	    dtm.setColumnIdentifiers(header);
	    table.setModel(dtm);
	    table.getTableHeader().setReorderingAllowed(false);
	    table.getTableHeader().setResizingAllowed(false);
	    data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT fecha,hora,nombre,apellidos FROM mydb.Cita,mydb.Usuario,mydb.Paciente WHERE Medico_Usuario_idUsuario = '"+Ventana.idUsuario+"' AND Paciente_Usuario_idUsuario = Paciente.Usuario_idUsuario and Paciente.Usuario_idUsuario = Usuario.idUsuario"),"fecha","hora","nombre","apellidos");
		for(int i = 0; i < data.size();i++){
			dtm.addRow(new Object[]{false,data.get(i).get(0),data.get(i).get(1),data.get(i).get(2)+" "+data.get(i).get(3)});
		}
		scrollPane.setViewportView(table);
		
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(12)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(lblSexo)
								.addContainerGap(406, Short.MAX_VALUE))
							.addComponent(lblNombreno, Alignment.LEADING)
							.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
								.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNombreno)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDireccion)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(lblSexo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton_1 ){
			boolean value;
			String name = "";
			String hora = "";
			for(int i = 0; i < dtm.getRowCount();i++){
				value =  (boolean) dtm.getValueAt(i, 0);
				if(value){
					name = ""+dtm.getValueAt(i, 3);
					hora = ""+dtm.getValueAt(i, 2);
				}
			}
			String[] parseNombre = name.split(" ");
			String usuario = Database.getDatabase().queryDMLExtract("idUsuario","SELECT * FROM mydb.Usuario WHERE nombre='"+parseNombre[0]+"'");
			 data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM mydb.Expediente,mydb.Cita  WHERE Expediente.Cita_Paciente_Usuario_idUsuario = '"+usuario+"' AND Cita_idCita = Cita.idCita AND Cita.hora ='"+hora+"'"),"motivoConsulta","problematica","diagnostico");
			javax.swing.JOptionPane.showMessageDialog(this, "Motivo Consulta: "+data.get(0).get(0)+"\n Problematica: "+data.get(0).get(1)+"\n Diagnostico: "+data.get(0).get(2));
		}
		
	}
}
