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

import javax.swing.UIManager;

public class ProductoInventario extends JPanel implements ActionListener {
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
	
	/**
	 * Create the panel.
	 */
	public ProductoInventario() {
		loadDialogs();
		setBackground(Color.WHITE);
		
		JLabel lblModificarUsuarios = new JLabel("Modificar Productos");
		
		lblNewLabel = new JButton("Dar Alta Producto");
		lblNewLabel.addActionListener(this);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(100, 149, 237));
		
		lblNewLabel_1 = new JButton("Editar Producto");
		lblNewLabel_1.addActionListener(this);
		lblNewLabel_1.setBackground(new Color(0, 128, 128));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_2 = new JButton("Dar Baja Producto");
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
    String header[] = new String[] { "#", "id", "Nombre","Tipo Servicio","Precio","Cantidad Disponible","Caducidad", "Cantidad Maxima", "Cantidad Minima","Activo"};
    dtm.setColumnIdentifiers(header);
    table_1.setModel(dtm);
    //table.getColumnModel().getColumn(3).setResizable(false);
    table_1.getTableHeader().setReorderingAllowed(false);
    table_1.getTableHeader().setResizingAllowed(false);
    //table.setCellSelectionEnabled(false);
    data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT ProductoServicio.idProductoServicio,ProductoServicio.Nombre,ProductoServicio.TipoServicio,ProductoServicio.Precio,ProductoServicio.Cantidad_Disponible,ProductoServicio.Caducidad,ProductoServicio.Cantidad_maxima,ProductoServicio.Cantidad_minima,ProductoServicio.Activo  FROM Naafa_corp.ProductoServicio"),"idProductoServicio","Nombre","TipoServicio","Precio","Cantidad_Disponible", "Caducidad", "Cantidad_maxima", "Cantidad_minima","Activo");
	for(int i = 0; i < data.size();i++){
		//estaba hasta data get (3) lol 
		 // if(data.get(i).get(8).equalsIgnoreCase("SI"))
		  //{
			dtm.addRow(new Object[]{false,data.get(i).get(0),data.get(i).get(1),data.get(i).get(2),data.get(i).get(3),data.get(i).get(4),data.get(i).get(5),data.get(i).get(6),data.get(i).get(7),data.get(i).get(8)});
	      //}
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
			final JDialog nuevo = new JDialog();
			final Registro_Producto lol = new Registro_Producto();
			nuevo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			nuevo.setBounds(100, 100, 620, 430);
			nuevo.getContentPane().setLayout(new BorderLayout(0, 0));
			nuevo.getContentPane().add(lol.todo);
			nuevo.setVisible(true);
			lol.getjButton1().setText("Editar");
			int where = 0;
			final int whereTwo;
			for(int i = 0; i < data.size();i++){
			boolean value = (boolean) dtm.getValueAt(i, 0);
			if(value){
				where = i;
				lol.getjTextField3().setText(""+dtm.getValueAt(i, 1));
				lol.getjTextField4().setText(""+dtm.getValueAt(i, 2));
				lol.getjTextField5().setText(""+dtm.getValueAt(i, 3));
				lol.getjTextField7().setText(""+dtm.getValueAt(i, 4));
				//
				//Database.getDatabase().easyQuery("UPDATE FROM Naafa_corp.ProductoServicio WHERE Nombre='"+dtm.getValueAt(i, 1)+"'");
				//dtm
				}
			}
			whereTwo = where;
			lol.getjButton1().addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					dtm.setValueAt(lol.getjTextField3().getText(), whereTwo, 1);
					dtm.setValueAt(lol.getjTextField4().getText(), whereTwo, 2);
					dtm.setValueAt(lol.getjTextField5().getText(), whereTwo, 3);
					dtm.setValueAt(lol.getjTextField7().getText(), whereTwo, 4);
					nuevo.setVisible(false);
				}
				
			});
			//modificarAdmin.getContentPane().add(new ModificarAdmin(this),BorderLayout.CENTER);
		} else if(e.getSource() == lblNewLabel_2){
			boolean value;
			for(int i = 0; i < data.size();i++){
			value = (boolean) dtm.getValueAt(i, 0);
			if(value){
				//pero no puedo hacer que se borren por las llaves foraneas hay un error, aaai! aaai! AIUDAAAAAAAA
				//se agregó un campo a la tabla PRODUCTOSERVICIO donde el PoS puede estas activo o inactivo, es la solucion que encontre para no eliminarlo lol
				Database.getDatabase().easyQuery("UPDATE ProductoServicio SET ProductoServicio.Activo='no' WHERE Naafa_corp.ProductoServicio.Nombre = '"+dtm.getValueAt(i, 2)+"'");
				//Database.getDatabase().easyQuery("DELETE FROM Naafa_corp.ProductoServicio WHERE Naafa_corp.ProductoServicio.idProductoServicio="+dtm.getValueAt(i, 0)+"");
				dtm.setValueAt("no", i, 9);
				//data.remove(i);
				
				}
			}

		} else if(e.getSource() == lblNewLabel){
			final JDialog nuevo = new JDialog();
			final Registro_Producto lol = new Registro_Producto();
			nuevo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			nuevo.setBounds(100, 100, 620, 430);
			nuevo.getContentPane().setLayout(new BorderLayout(0, 0));
			nuevo.getContentPane().add(lol.todo);
			nuevo.setVisible(true);
			lol.getjButton1().addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					Database.getDatabase().queryDDL("INSERT INTO Naafa_corp.ProductoServicio (TipoServicio,Nombre,Precio,Cantidad_Disponible,Cantidad_maxima,Cantidad_Minima,) "
			        		+ "VALUES('"+lol.getjTextField4().getText()+"','"+lol.getjTextField3().getText()+"','"+lol.getjTextField7().getText()+"','"+lol.getjTextField5().getText()+"') ");
					dtm.addRow(new Object[]{false,lol.getjTextField3().getText(),lol.getjTextField4().getText(),lol.getjTextField7().getText(),lol.getjTextField5().getText()});
					nuevo.setVisible(false);
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
