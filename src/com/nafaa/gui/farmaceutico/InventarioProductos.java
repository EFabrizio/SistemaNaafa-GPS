package com.nafaa.gui.farmaceutico;

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
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import com.nafaa.database.Database;
import com.nafaa.database.Query;
import com.nafaa.gui.admin.ModificarUsuarioJDialog;

public class InventarioProductos extends JPanel implements ActionListener {
	/**
	 * nmnmnmnmn
	 */
	private static final long serialVersionUID = 1L;
	private JButton lblNewLabel;
	private JButton lblNewLabel_1;
	private JButton lblNewLabel_2;
	private ModificarUsuarioJDialog dialog;
	private JDialog modificarAdmin;
	private JTable table_1;
	private Map<Integer, List<String>> data;
	private DefaultTableModel dtm;
	
	/**
	 * Create the panel.
	 */
	public InventarioProductos() {
		loadDialogs();
		setBackground(Color.WHITE);
		
		JLabel lblModificarUsuarios = new JLabel("Modificar Usuarios");
		
		lblNewLabel = new JButton("Agregar Usuario");
		lblNewLabel.addActionListener(this);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(128, 128, 0));
		
		lblNewLabel_1 = new JButton("Editar");
		lblNewLabel_1.addActionListener(this);
		lblNewLabel_1.setBackground(new Color(144, 238, 144));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_2 = new JButton("Eliminar");
		lblNewLabel_2.addActionListener(this);
		lblNewLabel_2.setBackground(new Color(128, 0, 128));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblModificarUsuarios)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(12)
								.addComponent(lblNewLabel)
								.addGap(18)
								.addComponent(lblNewLabel_1)
								.addGap(18)
								.addComponent(lblNewLabel_2)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
								.addGap(31)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(lblModificarUsuarios)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(63))
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
		scrollPane.setViewportView(table_1);
		setLayout(groupLayout);
		

    //table.setFillsViewportHeight(true);
    //table.setSurrendersFocusOnKeystroke(true);
    dtm = new DefaultTableModel(0, 0);
    String header[] = new String[] { "#", "Nombre Completo","Usuario","Tipo Usuario","Numero Celular"};
    dtm.setColumnIdentifiers(header);
    table_1.setModel(dtm);
    //table.getColumnModel().getColumn(3).setResizable(false);
    table_1.getTableHeader().setReorderingAllowed(false);
    table_1.getTableHeader().setResizingAllowed(false);
    //table.setCellSelectionEnabled(false);
    data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT nombre,apellidos,usuario,tipoUsuario FROM mydb.Usuario"),"nombre","apellidos","usuario","tipoUsuario");
	for(int i = 0; i < data.size();i++){
			dtm.addRow(new Object[]{false,data.get(i).get(0),data.get(i).get(1),data.get(i).get(2),data.get(i).get(3),"SOON..."});
	}

	}

	private void loadDialogs() {
		//dialog = new ModificarUsuarioJDialog(this);	
		modificarAdmin = new JDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lblNewLabel_1){
			//Database.getDatabase().easyQuery("UPDATE FROM mydb.Usuario WHERE nombre='"+dtm.getValueAt(i, 1)+"'");
			modificarAdmin.setModalityType(Dialog.ModalityType.MODELESS);
			modificarAdmin.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			modificarAdmin.setBounds(100, 100, 500, 500);
			modificarAdmin.setVisible(true);
			modificarAdmin.getContentPane().setLayout(new BorderLayout(0, 0));
			//modificarAdmin.getContentPane().add(new ModificarAdmin(this),BorderLayout.CENTER);
		} else if(e.getSource() == lblNewLabel_2){
			boolean value;
			for(int i = 0; i < data.size();i++){
			value = (boolean) dtm.getValueAt(i, 0);
			if(value){
				Database.getDatabase().easyQuery("DELETE FROM mydb.Usuario WHERE nombre='"+dtm.getValueAt(i, 1)+"'");
				dtm.removeRow(i);
				
				}
			}

		} else if(e.getSource() == lblNewLabel){
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
