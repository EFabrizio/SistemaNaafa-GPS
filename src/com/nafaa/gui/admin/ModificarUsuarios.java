package com.nafaa.gui.admin;

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
import com.nafaa.gui.Registro_Empleado;

import javax.swing.UIManager;

public class ModificarUsuarios extends JPanel implements ActionListener {
	/**
	 * 
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
	private JScrollPane scrollPane;
	
	/**
	 * Create the panel.
	 */
	public ModificarUsuarios() {
		loadDialogs();
		setBackground(Color.WHITE);
		
		JLabel lblModificarUsuarios = new JLabel("Modificar Usuarios");
		
		lblNewLabel = new JButton("Dar Alta Empleado");
		lblNewLabel.addActionListener(this);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(100, 149, 237));
		
		lblNewLabel_1 = new JButton("Editar Empleado");
		lblNewLabel_1.addActionListener(this);
		lblNewLabel_1.setBackground(new Color(0, 128, 128));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_2 = new JButton("Dar Baja Empleado");
		lblNewLabel_2.addActionListener(this);
		lblNewLabel_2.setBackground(new Color(128, 0, 128));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addComponent(lblModificarUsuarios)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(lblModificarUsuarios)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
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
		scrollPane.setViewportView(table_1);
		setLayout(groupLayout);
		

    //table.setFillsViewportHeight(true);
    //table.setSurrendersFocusOnKeystroke(true);
    dtm = new DefaultTableModel(0, 0);
    String header[] = new String[] { "#", "Nombre Completo","Usuario","Tipo Usuario","Numero Celular","Domicilio","HorarioInicio","HorarioTermina"};
    dtm.setColumnIdentifiers(header);
    table_1.setModel(dtm);
    //table.getColumnModel().getColumn(3).setResizable(false);
    table_1.getTableHeader().setReorderingAllowed(false);
    table_1.getTableHeader().setResizingAllowed(false);
    //table.setCellSelectionEnabled(false);
    data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT Empleados.NombreCompleto,Usuario.Nombre_Usuario,Empleados.TipoEmpleado,Empleados.NoCelular,Domicilio,HorarioInicia,HorarioTermina FROM Naafa_corp.Empleados,Naafa_corp.Usuario WHERE Usuario.idUsuario = Empleados.idUsuario"),"NombreCompleto","Nombre_Usuario","TipoEmpleado","NoCelular","Domicilio","HorarioInicia","HorarioTermina");
	for(int i = 0; i < data.size();i++){
			dtm.addRow(new Object[]{false,data.get(i).get(0),data.get(i).get(1),data.get(i).get(2),data.get(i).get(3),data.get(i).get(4),data.get(i).get(5),data.get(i).get(6)});
	}

	}

	private void loadDialogs() {
		dialog = new ModificarUsuarioJDialog(this);	
		modificarAdmin = new JDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lblNewLabel_1){
			//Database.getDatabase().easyQuery("UPDATE FROM mydb.Usuario WHERE nombre='"+dtm.getValueAt(i, 1)+"'");
			final JDialog empleado = new JDialog();
			final Registro_Empleado lol = new Registro_Empleado();
			empleado.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			empleado.setBounds(100, 100, 650, 550);
			empleado.getContentPane().setLayout(new BorderLayout(0, 0));
			empleado.getContentPane().add(scrollPane ,BorderLayout.CENTER);
			empleado.getContentPane().add(new JButton() ,BorderLayout.SOUTH);
			empleado.setVisible(true);
			int where = 0;
			final int whereTwo;
			String number = null;
			for(int i = 0; i < data.size();i++){
			boolean value = (boolean) dtm.getValueAt(i, 0);
			if(value){
				number = Database.getDatabase().queryDMLExtract("idUsuario","SELECT idUsuario FROM Naafa_corp.Empleados WHERE NombreCompleto='"+dtm.getValueAt(i, 1)+"'");
				where = i;
				lol.getjTextField3().setText(""+dtm.getValueAt(i, 1));
				lol.getjTextField4().setText(""+dtm.getValueAt(i, 2));
				lol.getjTextField5().setText(""+dtm.getValueAt(i, 4));
				lol.getjTextField7().setText(""+dtm.getValueAt(i, 3));
				lol.getTextField_1().setVisible(false);
				lol.getTextField().setVisible(false);
				lol.getLblConfirmarContrasea().setVisible(false);
				lol.getLblContrasea().setVisible(false);
				//
				//Database.getDatabase().easyQuery("UPDATE FROM Naafa_corp.ProductoServicio WHERE Nombre='"+dtm.getValueAt(i, 1)+"'");
				//dtm
				}
			}
			whereTwo = where;
			final String numberTwo = number;
			lol.getjButton1().addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					dtm.setValueAt(lol.getjTextField3().getText(), whereTwo, 1);
					dtm.setValueAt(lol.getjTextField4().getText(), whereTwo, 2);
					dtm.setValueAt(lol.getjTextField5().getText(), whereTwo, 4);
					dtm.setValueAt(lol.getjTextField7().getText(), whereTwo, 3);
					empleado.setVisible(false);
					
					Database.getDatabase().queryDDL("UPDATE FROM Naafa_corp.Empleados SET NombreCompleto='"+lol.getjTextField3().getText()+"' WHERE idUsuario='"+numberTwo+"'");
				}
				
			});
			
		} else if(e.getSource() == lblNewLabel_2){
			boolean value;
			for(int i = 0; i < data.size();i++){
			value = (boolean) dtm.getValueAt(i, 0);
			if(value){
				String number = Database.getDatabase().queryDMLExtract("idUsuario","SELECT idUsuario FROM Naafa_corp.Empleados WHERE NombreCompleto='"+dtm.getValueAt(i, 1)+"'");
				
				Database.getDatabase().queryDDL("DELETE FROM Naafa_corp.Empleados WHERE NombreCompleto='"+dtm.getValueAt(i, 1)+"'");
				
				Database.getDatabase().queryDDL("DELETE FROM Naafa_corp.Usuario  WHERE idUsuario='"+number+"'");
				dtm.removeRow(i);
				data.remove(i);
				}
			}

		} else if(e.getSource() == lblNewLabel){
			final JDialog empleado = new JDialog();
			final Registro_Empleado lol = new Registro_Empleado();
			empleado.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			empleado.setBounds(100, 100, 650, 550);
			empleado.getContentPane().setLayout(new BorderLayout(0, 0));
			empleado.getContentPane().add(lol.todo ,BorderLayout.CENTER);
			empleado.setVisible(true);
			lol.getjButton1().addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					Database.getDatabase().queryDDL("INSERT INTO Naafa_corp.Usuario (Nombre_Usuario,Contraseña,Tipo,Estado) "
			        		+ "VALUES('"+lol.getjTextField4().getText()+"','"+lol.getTextField_1().getText()+"','"+lol.getjTextField7().getText()+"','Activo') ");
					String number = Database.getDatabase().queryDMLExtract("idUsuario","SELECT idUsuario FROM Naafa_corp.Usuario ORDER BY idUsuario DESC LIMIT 1;");
					
					Database.getDatabase().queryDDL("INSERT INTO Naafa_corp.Empleados (NombreCompleto,TipoEmpleado,NoCelular,idUsuario,Domicilio,HorarioInicia,HorarioTermina) "
			        		+ "VALUES('"+lol.getjTextField3().getText()+"','"+lol.getjTextField7().getText()+"','"+lol.getjTextField5().getText()+"','"+number+"','"+lol.getTextField_2().getText()+"','"+lol.getTextField_3().getText()+"','"+lol.getTextField_4().getText()+"') ");
					dtm.addRow(new Object[]{false,lol.getjTextField3().getText(),lol.getjTextField4().getText(),lol.getjTextField7().getText(),lol.getjTextField5().getText(),lol.getTextField_2().getText(),lol.getTextField_3().getText(),lol.getTextField_4().getText()});
					empleado.setVisible(false);					
				}
				
			});
		}
		
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
