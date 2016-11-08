package com.nafaa.gui.laboratorista;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import com.nafaa.database.Database;

public class PanelAnalisis extends JPanel {

		private JLabel actualizarDatos;
		private JLabel lblVenta;
	
	public JLabel getActualizarDatos() {
			return actualizarDatos;
		}

	/**
	 * Create the panel.
	 */
	public PanelAnalisis() {
		
		actualizarDatos = new JLabel("Nuevo analisis");
		
		JButton btnNewButton = new JButton();
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setEnabled(false);
		btnNewButton.setBorderPainted(false);
		try {
			Image img = ImageIO.read(new File("image/rsz_hospital.png"));
			ImageIcon icon = new ImageIcon(img);
			btnNewButton.setIcon(icon);
			btnNewButton.setDisabledIcon(icon);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
		JLabel lblCerrarSesion = new JLabel("Cerrar Sesion");
		
		lblVenta = new JLabel("Baja");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)		
					.addComponent(actualizarDatos)
					.addGap(101)
					.addComponent(lblVenta)
					.addGap(433)
					.addComponent(lblCerrarSesion, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(73, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(actualizarDatos)
						.addComponent(lblCerrarSesion)
						.addComponent(lblVenta))
					.addGap(24))
		);
		setLayout(groupLayout);

	}

	public JLabel getLblVenta() {
		return lblVenta;
	}
	
	//Database.getDatabase().easyQuery("INSERT INTO Naafa_corp.Hematologico (HCT,HGB,Velocidad_segmentación,Plaquetas,Leucocitos,Metam,Cayad,Segme,Eosin,Basof,Monoc,Linfo,Atipi,Hipocrombia,Ansocosotosis,Poiquilocit,Microcitosis,Policromat,Reticulocitos,Drepanocitos,Grupo,Co_Directo,Co_Indirecto,Prototrombina,TTP) VALUES ('"+textField_1().getText()+"','"+textField_24().getText()+"','"+textField().getText()+"','"+textField_2().getText()+"','"+textField_3().getText()+"','"+textField_4().getText()+"',,'"+textField_6().getText()+"','"+textField_5().getText()+"','"+textField_7().getText()+"','"+textField_10().getText()+"','"+textField_11().getText()+"','"+textField_9().getText()+"',,'"+textField_12().getText()+"','"+textField_13().getText()+"','"+textField_14().getText()+"','"+textField_15().getText()+"','"+textField_16().getText()+"',,'"+textField_17().getText()+"','"+textField_18().getText()+"','"+textField_19().getText()+"','"+textField_20().getText()+"','"+textField_21().getText()+"','"+textField_22().getText()+"','"+textField_23().getText()+"','"+textField_4().getText()+"','"+textArea().getText()+"'"));
}
