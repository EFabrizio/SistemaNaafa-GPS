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

public class TodosAnalisis extends JPanel implements ActionListener {
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
	private JButton btnNewButton;
	
	/**
	 * Create the panel.
	 */
	public TodosAnalisis() {
		calendar = GregorianCalendar.getInstance();
		calendarAgent = new CalendarAgent();
		calendarAgent.getjTable().setDragEnabled(false);
        calendarAgent.getjTable().setShowGrid(false);
       // calendarAgent.getjTable().addMouseListener(this);
        calendarAgent.getjTable().setEnabled(false);
        calendarAgent.setTable(calendar);
        calendarAgent.getjTable().setRowHeight(26);
       
		loadDialogs();
		setBackground(Color.WHITE);
		
		btnNewButton = new JButton("Ver Análisis Paciente");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 575, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		

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
		
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
		

    dtm = new DefaultTableModel(0, 0);
    String header[] = new String[] { "#", "Nombre Paciente","Tipo analísis"};
    dtm.setColumnIdentifiers(header);
    table.setModel(dtm);
    table.getTableHeader().setReorderingAllowed(false);
    table.getTableHeader().setResizingAllowed(false);
	 data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM Naafa_corp.Analisis,Naafa_corp.Paciente WHERE Analisis.idCurp = Paciente.idCurp"),"NombreCompleto","tipoAnalisis");
    
	for(int i = 0; i < data.size();i++){
		dtm.addRow(new Object[]{false,data.get(i).get(0),data.get(i).get(1)});
	}

	}

	private void loadDialogs() {
		modificarAdmin = new JDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton){
			String[] text;
			String passText = "";
			boolean value;
			String name = "";
			for(int i = 0; i < dtm.getRowCount();i++){
				value =  (boolean) dtm.getValueAt(i, 0);
				if(value) {
					name = "" + dtm.getValueAt(i, 1);
					String usuario = Database.getDatabase().queryDMLExtract("idCurp", "SELECT * FROM Naafa_corp.Paciente WHERE NombreCompleto='" + name + "'");
					data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT informacion FROM Naafa_corp.Analisis WHERE idCurp = '" + usuario + "' AND tipoAnalisis = '" + dtm.getValueAt(i, 2) + "'  ORDER BY informacion ASC LIMIT 1"), "informacion");

					}
				}

			text = data.get(0).get(0).split("-");
			for(int j = 0; j < text.length;j++){
					if(j%2== 0)
						passText+="\n"+text[j];
				else
					passText+=" "+text[j];

			}



			javax.swing.JOptionPane.showMessageDialog(this,passText);
		}
		
		
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
