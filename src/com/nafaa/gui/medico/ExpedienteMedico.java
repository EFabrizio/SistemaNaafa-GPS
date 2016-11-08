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
import com.nafaa.util.CalendarAgent;

public class ExpedienteMedico extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JDialog modificarAdmin;
	private JTable table_1;
	private Map<Integer, List<String>> data;
	private DefaultTableModel dtm;
	private CalendarAgent calendarAgent;
	private Calendar calendar;
	
	/**
	 * Create the panel.
	 */
	public ExpedienteMedico() {
		calendar = GregorianCalendar.getInstance();
		calendarAgent = new CalendarAgent();
		calendarAgent.getjTable().setDragEnabled(false);
        calendarAgent.getjTable().setShowGrid(false);
       // calendarAgent.getjTable().addMouseListener(this);
        calendarAgent.getjTable().setEnabled(false);
        calendarAgent.setTable(calendar);
        calendarAgent.getjTable().setRowHeight(46);
		loadDialogs();
		setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
					.addGap(31))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(68)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addGap(100))
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
		scrollPane.setViewportView(calendarAgent.getjTable());
		setLayout(groupLayout);
		

    dtm = new DefaultTableModel(0, 0);
    String header[] = new String[] { "#", "Nombre", "Apellidos",
            "Usuario","Grupo","Ultima Conexión"};
    dtm.setColumnIdentifiers(header);
    table_1.setModel(dtm);
    table_1.getTableHeader().setReorderingAllowed(false);
    table_1.getTableHeader().setResizingAllowed(false);
    data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT nombre,apellidos,usuario,tipoUsuario FROM mydb.Usuario"),"nombre","apellidos","usuario","tipoUsuario");
	for(int i = 0; i < data.size();i++){
			dtm.addRow(new Object[]{false,data.get(i).get(0),data.get(i).get(1),data.get(i).get(2),data.get(i).get(3),"SOON..."});
	}

	}

	private void loadDialogs() {
		modificarAdmin = new JDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
