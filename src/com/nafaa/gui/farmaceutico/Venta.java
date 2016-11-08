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
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import com.nafaa.database.Database;
import com.nafaa.database.Query;
import com.nafaa.gui.Ventana;
import com.nafaa.gui.admin.ModificarUsuarioJDialog;

import javax.swing.UIManager;
import java.awt.SystemColor;

public class Venta extends JPanel implements ActionListener {
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
	private int unidades = 0;
	private int total = 0;
	private JLabel lblTotal;
	private JLabel unidadesVenta;
	private String idEmpleado;
	private JLabel lblFolio;
	/**
	 * Create the panel.
	 */
	public Venta() {
		idEmpleado =   Database.getDatabase().queryDMLExtract("idEmpleado","SELECT * FROM Naafa_corp.Empleados WHERE idUsuario = '"+Ventana.idUsuario+"'");
		loadDialogs();
		setBackground(Color.WHITE);
		
		JLabel lblModificarUsuarios = new JLabel("Venta");
		
		lblNewLabel = new JButton("Añadir Producto");
		lblNewLabel.addActionListener(this);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(Color.MAGENTA);
		
		lblNewLabel_1 = new JButton("Eliminar Producto");
		lblNewLabel_1.addActionListener(this);
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_2 = new JButton("PAGAR");
		lblNewLabel_2.addActionListener(this);
		lblNewLabel_2.setBackground(Color.GREEN);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JScrollPane scrollPane = new JScrollPane();
		String idVenta = Database.getDatabase().queryDMLExtract("idVenta","SELECT Max(idVenta) as idVenta FROM Naafa_corp.Venta");
		lblFolio = new JLabel("Folio: "+idVenta);
		
		JLabel lblImporte = new JLabel("Importe:");
		
		lblTotal = new JLabel("Total: ");
		String nombreCompleto = Database.getDatabase().queryDMLExtract("NombreCompleto","SELECT * FROM Naafa_corp.Empleados WHERE idUsuario = '"+Ventana.idUsuario+"'");
		JLabel lblCajero = new JLabel("Cajero: "+nombreCompleto);
		
		unidadesVenta = new JLabel("Cantidad Total de Productos:\n");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblImporte, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblModificarUsuarios)
										.addComponent(lblFolio))
									.addGap(22)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(unidadesVenta)
										.addComponent(lblCajero, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(462, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModificarUsuarios)
						.addComponent(lblCajero))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFolio)
						.addComponent(unidadesVenta))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotal)
						.addComponent(lblImporte))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_2)
					.addGap(20))
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
    String header[] = new String[] { "#", "IDProducto","Nombre","Cantidad","Precio"};
    dtm.setColumnIdentifiers(header);
    table_1.setModel(dtm);
    //table.getColumnModel().getColumn(3).setResizable(false);
    table_1.getTableHeader().setReorderingAllowed(false);
    table_1.getTableHeader().setResizingAllowed(false);
    //table.setCellSelectionEnabled(false);

	}

	private void loadDialogs() {
		//dialog = new ModificarUsuarioJDialog(this);	
		modificarAdmin = new JDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lblNewLabel){
			/*
			 *Agregamos producto. 
			 */
			String idProducto = javax.swing.JOptionPane.showInputDialog(this, "ID producto.");
			String cantidad = javax.swing.JOptionPane.showInputDialog(this, "Cantidad");
			data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM Naafa_corp.ProductoServicio WHERE idProductoServicio='"+idProducto+"'"),"idProductoServicio","Nombre","Precio");
			if(data.size() > 0) {
				dtm.addRow(new Object[]{false, data.get(0).get(0), data.get(0).get(1), cantidad, data.get(0).get(2)});
				unidades+=Integer.parseInt(cantidad);
				String totales = ""+(Double.parseDouble(cantidad)*Double.parseDouble(data.get(0).get(2)));
				total+= Double.parseDouble(totales);
				lblTotal.setText("Total: $"+total);
				unidadesVenta.setText("Cantidad Productos: "+unidades);
			}
			else
				javax.swing.JOptionPane.showMessageDialog(this,"Producto no encontrado.");
		} else if(e.getSource() == lblNewLabel_1){
			/*
			 * Borrar Producto.
			 */

			for(int i = 0; i< dtm.getRowCount();i++){
				boolean value = (boolean) dtm.getValueAt(i,0);
				if(value){
					String price = ""+dtm.getValueAt(i,4);
					String cantidad = ""+dtm.getValueAt(i,3);
					String igual = ""+(Double.parseDouble(price)*Double.parseDouble(cantidad));
					total-= Double.parseDouble(igual);
					lblTotal.setText("Total: $"+total);
					unidadesVenta.setText("Cantidad Productos: "+unidades);
					unidades-=Integer.parseInt((String)dtm.getValueAt(i, 3));
					dtm.removeRow(i);

				}
			}
		} else if(e.getSource() == lblNewLabel_2){
			/*
			 * Cobramos productos en tabla.
			 */

			String dinero = javax.swing.JOptionPane.showInputDialog(this,"Importe $");
			for(int i = 0 ; i  < dtm.getRowCount();i++) {
				data = Database.getDatabase().queryDMLExtraAny(new Query("SELECT * FROM Naafa_corp.ProductoServicio WHERE idProductoServicio='" + dtm.getValueAt(i, 1) + "'"),"idProductoServicio","Cantidad_Disponible","Precio");
				System.out.println(data.get(i).get(1));
				String cantidadM = data.get(i).get(1);
				double resta = Double.parseDouble(cantidadM) - Double.parseDouble((String) dtm.getValueAt(i, 3));
				if (Integer.parseInt((String) dtm.getValueAt(i, 3)) <= Integer.parseInt(cantidadM) ) {
					Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Venta (idEmpleado,Fecha) VALUES('"+idEmpleado+"','"+Calendar.getInstance().get(Calendar.YEAR)+"/"+Calendar.getInstance().get(Calendar.MONTH)+"/"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"')");
					Database.getDatabase().easyQuery("UPDATE Naafa_corp.ProductoServicio SET Cantidad_Disponible='"+resta+"' WHERE idProductoServicio='"+ dtm.getValueAt(i, 1) + "'");
				} else
					javax.swing.JOptionPane.showMessageDialog(this,"No hay suficientes productos.");
			}
			
			int rowCount = dtm.getRowCount();
			for (int i = rowCount - 1; i >= 0; i--) {
			    dtm.removeRow(i);
			}
			unidades = 0;
			total = 0;
			lblTotal.setText("Total: $"+total);
			unidadesVenta.setText("Cantidad Productos: "+unidades);
			lblNewLabel_1.setText("Importe: $"+dinero);
			String idVenta = Database.getDatabase().queryDMLExtract("idVenta","SELECT Max(idVenta) as idVenta FROM Naafa_corp.Venta");
			lblFolio.setText("Folio: "+idVenta);
			
				
		}
		
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
