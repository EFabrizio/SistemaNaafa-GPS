package com.nafaa.gui.paciente;

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
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.swing.JTextField;

import com.nafaa.database.Database;
import com.nafaa.database.Query;
import com.nafaa.gui.Ventana;

public class MostrarExpedientePaciente extends JPanel implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblconsulta;
	private Map<Integer, List<String>> data;
	private DefaultTableModel dtm;
	private JLabel lblproblema;
	private JScrollPane scrollPane;
	private JLabel lbldiagnostico;

	private final JButton btnMostrar = new JButton("Mostrar");
	private JButton btnNewButton;
	private JLabel lblRevision;
	private JLabel lblReceta;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MostrarExpedientePaciente() {
		btnMostrar.setForeground(new Color(255, 255, 255));
		btnMostrar.setBackground(new Color(100, 149, 237));
		btnMostrar.addActionListener(this);
		setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		lblconsulta = new JLabel("Motivo de la consulta: ");
		
		lblproblema = new JLabel("Enfermedad o problema actual:");
		
		lbldiagnostico = new JLabel("Diagnostico: ");
		
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
	    String header[] = new String[] { "#", "Problema"};
	    dtm.setColumnIdentifiers(header);
	    table.setModel(dtm);
	    table.getTableHeader().setReorderingAllowed(false);
	    table.getTableHeader().setResizingAllowed(false);
		
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Visualizar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.addActionListener(this);
		
		lblRevision = new JLabel("Revision:");
		
		lblReceta = new JLabel("Receta:");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblproblema, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblconsulta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
						.addComponent(btnNewButton)
						.addComponent(lblReceta, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbldiagnostico, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblRevision, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblconsulta)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblproblema)
					.addGap(18)
					.addComponent(lblRevision)
					.addGap(22)
					.addComponent(lbldiagnostico)
					.addGap(27)
					.addComponent(lblReceta)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(37))
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(gl_contentPane);
		
		String curp = Database.getDatabase().queryDMLExtract("idCurp","SELECT idCurp FROM Naafa_corp.Paciente WHERE idUsuario='"+Ventana.idUsuario+"'");
		data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM Naafa_corp.Expediente WHERE idCurp = '"+curp+"'"),"Enfermedad_Problema");
		for(int i = 0; i < data.size();i++){
			dtm.addRow(new Object[]{false,data.get(i).get(0)});
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton){
			boolean value;
			for(int i = 0; i < dtm.getRowCount();i++){
				value =  (boolean) dtm.getValueAt(i, 0);
				if(value){
					 data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM Naafa_corp.Expediente WHERE Enfermedad_Problema='"+dtm.getValueAt(i, 1)+"'"),"Motivo_consulta","Revision","Diagnostico");
						lblconsulta.setText("Motivo de la consulta: "+data.get(0).get(0));
						lblproblema.setText("Enfermedad o problema actual: "+dtm.getValueAt(i, 1));
						lbldiagnostico.setText("Diagnostico: "+data.get(0).get(2));
						lblRevision.setText("Revision: "+data.get(0).get(1));
						lblReceta.setText("Receta: No disponible");
				}
			}
			
		}
	}
}
