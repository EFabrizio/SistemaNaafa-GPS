package com.nafaa.gui;



import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.nafaa.database.Database;
import com.nafaa.gui.admin.ModificarUsuarios;
import com.nafaa.gui.auxiliar.AgendarCitaAuxiliar;
import com.nafaa.gui.auxiliar.PanelAuxiliar;
import com.nafaa.gui.farmaceutico.PanelInventario;
import com.nafaa.gui.farmaceutico.ProductoInventario;
import com.nafaa.gui.farmaceutico.Venta;
import com.nafaa.gui.laboratorista.PanelLaboratorista;
import com.nafaa.gui.laboratorista.PanelTipoAnalisis;
import com.nafaa.gui.laboratorista.TodosAnalisis;
import com.nafaa.gui.medico.AgendarCita;
import com.nafaa.gui.medico.PanelMedico;
import com.nafaa.gui.paciente.ActualizarDato;
import com.nafaa.gui.paciente.AgendarCitaPaciente;
import com.nafaa.gui.paciente.MostrarExpedientePaciente;
import com.nafaa.gui.paciente.PanelPaciente;
import com.nafaa.gui.paciente.Registro_Paciente;
import com.nafaa.util.Secure;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.SwingConstants;

public class Ventana extends JFrame implements MouseListener,ActionListener {
    
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField passwordField;
	private JLabel lbleresNuevoRegistrate;
	private JLabel label;
	private JPanel panel;
	private NuevoRegistro nuevoRegistro;
	private Connection connection = null;
	private Database database;
	private JButton button_1;
	private Principal principal;
	private JLabel lblSistemaMdicoNaafa;
	private JLabel lblUsuarioRegistradoCon;
	private Registro_Paciente reg ;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	
	/**
	 * QUE PACIENTE Y QUE MEDICO AL LOGEARSE
         * estoy con LorenaHerr como Paciente estaba haciendo pruebas, ya corregí la consulta para que agregue a citas 
	 */
	public static String idUsuario;
	
	
	/**
	 * Paneles
	 */
	private PanelInventario inventario;
	private PanelPaciente paciente;
	private PanelLaboratorista laboratorista;
	private PanelMedico medico;
	private PanelAuxiliar auxiliar;
	private ActualizarDato actualiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana() {
		setTitle("Sistema Médico NAFAA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
		setSize(500,500);
		setLocationRelativeTo(null);
		setFocusable(true);
		initPanels();
		initComponents();
		initDatabase();
                this.pack(); 
	}
	
	private void initDatabase() {
	/*Alexia*/ 	//Database.getDatabase().conectar("jdbc:mysql://localhost:3306/Naafa_corp","root", JOptionPane.showInputDialog(this, "El password de la base de datos\npara no cambiar el codigo acada rato\n cuando cada quien lo corra escriba su propio password\n solo temporal"));
        //si estamos trabajando con enlina para no tener sobre escritura y no nos marque ese error de conexión
        
        /*Nogay*/     Database.getDatabase().conectar("jdbc:mysql://localhost:3307/Naafa_corp","root", "aapn941015");
        /*Oliver*/    //Database.getDatabase().conectar("jdbc:mysql://localhost:3306/Naafa_corp","root", "66drmcmU");  
        
	}

	private void initPanels() {
		inventario = new PanelInventario();
		inventario.getActualizarDatos().addMouseListener(this);
		inventario.getLblVenta().addMouseListener(this);
		principal = new Principal();
		principal.getModificarUsuariso().addMouseListener(this);
		nuevoRegistro = new NuevoRegistro(this);
		reg = new Registro_Paciente();
		reg.getjButton2().addActionListener(this);
		paciente = new PanelPaciente();
		paciente.getLblAgendaDeCitas().addMouseListener(this);
		paciente.getActualizarDatos().addMouseListener(this);
		paciente.getExpedienteMedico().addMouseListener(this);
		medico = new PanelMedico();
		medico.getCitas().addMouseListener(this);
		medico.getExpedientes().addMouseListener(this);
		auxiliar = new PanelAuxiliar();
		auxiliar.getActualizarDatos().addMouseListener(this);
		auxiliar.getExpedienteMedico().addMouseListener(this);
		laboratorista = new PanelLaboratorista();
		laboratorista.getActualizarDatos().addMouseListener(this);
		laboratorista.getExpedienteMedico().addMouseListener(this);
		actualiza = new ActualizarDato();
	}

	private void initComponents() {
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		setContentPane(contentPane);
		
		setPanel(new JPanel());
		
		label = new JLabel("");
		label.setForeground(new Color(0, 102, 204));
		label.addMouseListener(this);
		
		button_1 = new JButton("Acceder");
		button_1.addActionListener(this);
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setBackground(new Color(240, 230, 140));
		
		usuario = new JTextField();
		usuario.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JButton button_2 = new JButton();
		button_2.setVerticalAlignment(SwingConstants.TOP);
		button_2.setEnabled(false);
		button_2.setBorderPainted(false);
		try {
			Image img = ImageIO.read(new File("image/hospital.png"));
			ImageIcon icon = new ImageIcon(img);
			button_2.setIcon(icon);
			button_2.setDisabledIcon(icon);
			setIconImage(img);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		setLblUsuarioRegistradoCon(new JLabel(""));
		
		lblUsuario = new JLabel("Usuario:");
		
		lblContrasea = new JLabel("Contraseña:");
		
		
		GroupLayout gl_panel = new GroupLayout(getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(191)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(204, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(84)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblContrasea)
								.addComponent(lblUsuario))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(59)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addGroup(gl_panel.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblUsuarioRegistradoCon)))
									.addGap(122))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(usuario, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
										.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))))
						.addComponent(button_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
					.addGap(118))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(48)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(lblUsuarioRegistradoCon)
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(usuario, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsuario))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasea)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(label))
		);
		getPanel().setLayout(gl_panel);
		
		lblSistemaMdicoNaafa = new JLabel("Sistema Médico NAAFA");
		lblSistemaMdicoNaafa.setBackground(new Color(192, 192, 192));
		lblSistemaMdicoNaafa.setBorder(new EmptyBorder(13,13,13,13));
		lblSistemaMdicoNaafa.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaMdicoNaafa.setFont(new Font("Dialog", Font.BOLD, 21));
		
		setLbleresNuevoRegistrate(new JLabel("Registrate."));
		getLbleresNuevoRegistrate().setForeground(new Color(0, 0, 0));
		getLbleresNuevoRegistrate().setBorder(new EmptyBorder(13,0,13,0));
		getLbleresNuevoRegistrate().setHorizontalAlignment(SwingConstants.CENTER);
		getLbleresNuevoRegistrate().addMouseListener(this);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(lblSistemaMdicoNaafa, BorderLayout.NORTH);
		contentPane.add(getLbleresNuevoRegistrate(), BorderLayout.SOUTH);
		contentPane.add(getPanel(), BorderLayout.CENTER);		
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == getLbleresNuevoRegistrate()){
            remove(getPanel());
            getLbleresNuevoRegistrate().setVisible(false);
            getContentPane().add(reg.todo,BorderLayout.CENTER);
            revalidate();
            repaint();
            setTitle("Sistema Médico NAAFA - Registro");
            setSize(600,650);
		} else if(e.getSource() == principal.getModificarUsuariso()){
			
            principal.remove(principal.getPanel_2());
            principal.add(new ModificarUsuarios(),BorderLayout.CENTER);
            revalidate();
            repaint();
		} else if(e.getSource() == inventario.getActualizarDatos()){
			BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
			principal.add(new ProductoInventario(),BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if(e.getSource() == medico.getCitas()){
			setTitle("Sistema Médico NAAFA");
			BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(new AgendarCita(),BorderLayout.CENTER);
            revalidate();
            repaint();
			
		} else if(e.getSource() == paciente.getActualizarDatos()){
			setTitle("Sistema Médico NAAFA - Agenda de Citas");
			 setSize(900,600);
			 BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(actualiza.todo,BorderLayout.CENTER);
            revalidate();
            repaint();
			
		} else if(e.getSource() == paciente.getLblAgendaDeCitas()){
			setTitle("Sistema Médico NAAFA - Agenda de Citas");
			BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(new AgendarCitaPaciente(),BorderLayout.CENTER);
            revalidate();
            repaint();
		} else if(e.getSource() == paciente.getExpedienteMedico()){
			setTitle("Sistema Médico NAAFA - Expedientes");
			BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(new MostrarExpedientePaciente(),BorderLayout.CENTER);
            revalidate();
            repaint();
			
		} else if(e.getSource() == auxiliar.getActualizarDatos()){
			setTitle("Sistema Médico NAAFA - Agenda de Citas");
		    setSize(900,600);
		    BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(new AgendarCitaAuxiliar(),BorderLayout.CENTER);
            revalidate();
            repaint();
		} else if(e.getSource() == auxiliar.getExpedienteMedico()){
				setTitle("Sistema Médico NAAFA - Agenda de Citas");
				 setSize(900,600);
				BorderLayout layout = (BorderLayout) principal.getLayout();
				principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
	            principal.add(reg.todo,BorderLayout.CENTER);
	            revalidate();
	            repaint();
			
		}else if(e.getSource() == inventario.getLblVenta()){
			setTitle("Sistema Médico NAAFA - Venta");
			 setSize(900,600);
			 BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(new Venta(),BorderLayout.CENTER);
            revalidate();
            repaint();
		} else if(e.getSource() == laboratorista.getExpedienteMedico()){
			setTitle("Sistema Médico NAAFA - Análisis");
			 setSize(900,800);
			BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(new TodosAnalisis(),BorderLayout.CENTER);
            revalidate();
            repaint();
		}else if(e.getSource() == laboratorista.getActualizarDatos()){
			setTitle("Sistema Médico NAAFA - Análisis");
			 setSize(900,800);
			BorderLayout layout = (BorderLayout) principal.getLayout();
			principal.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            principal.add(new com.nafaa.gui.laboratorista.AgendarCitaLaboratorista(),BorderLayout.CENTER);
            revalidate();
            repaint();
		}
	}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == paciente.getActualizarDatos()){
			paciente.getActualizarDatos().setCursor(new Cursor(Cursor.HAND_CURSOR));
		} if(e.getSource() == paciente.getLblAgendaDeCitas()){
			paciente.getLblAgendaDeCitas().setCursor(new Cursor(Cursor.HAND_CURSOR));
		} if(e.getSource() == paciente.getExpedienteMedico()){
			paciente.getExpedienteMedico().setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		if(e.getSource() == medico.getExpedientes()){
			 medico.getExpedientes().setCursor(new Cursor(Cursor.HAND_CURSOR));
			}   if(e.getSource() == medico.getCitas()){
				 medico.getCitas().setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		if(e.getSource() == getLbleresNuevoRegistrate()){
			getLbleresNuevoRegistrate().setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		if(e.getSource() == label){
			label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		} 

		if(e.getSource() == principal.getModificarUsuariso()){
			principal.getModificarUsuariso().setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		
		if(e.getSource() == inventario.getActualizarDatos()){
			inventario.getActualizarDatos().setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		
		if(e.getSource() == inventario.getLblVenta()){
			inventario.getActualizarDatos().setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
	}

	public void mouseExited(MouseEvent e) {}

	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == reg.getjButton2()){
            remove(reg.todo);
            getLbleresNuevoRegistrate().setVisible(true);
            getContentPane().add(getPanel(),BorderLayout.CENTER);
            revalidate();
            repaint();
            setSize(500,500);
			} if(e.getSource() == button_1){
				
				String hash = "";
				try {
					hash = Secure.getHashCodeFromString(passwordField.getText());
				} catch (NoSuchAlgorithmException e1) {
					e1.printStackTrace();
				}
				
				int count = Database.getDatabase().queryDMLSize("SELECT Nombre_Usuario,Contraseña FROM Naafa_corp.Usuario WHERE Nombre_Usuario='"+usuario.getText()+"' AND Contraseña='"+passwordField.getText()+"'");
				String nombre = Database.getDatabase().queryDMLExtract("NombreCompleto","SELECT Paciente.NombreCompleto FROM Naafa_corp.Usuario,Naafa_corp.Paciente WHERE Nombre_Usuario='"+usuario.getText()+"' AND Contraseña='"+passwordField.getText()+"' AND Usuario.idUsuario = Paciente.idUsuario");
				idUsuario = Database.getDatabase().queryDMLExtract("idUsuario","SELECT idUsuario FROM Naafa_corp.Usuario WHERE Nombre_Usuario='"+usuario.getText()+"' AND Contraseña='"+passwordField.getText()+"'");
				String tipoUsuario = Database.getDatabase().queryDMLExtract("Tipo","SELECT * FROM Naafa_corp.Usuario WHERE Nombre_Usuario='"+usuario.getText()+"' AND Contraseña='"+passwordField.getText()+"'");
				if(count > 0){
			principal.getLblBienvenido().setText("Bienvenido "+tipoUsuario+", "+nombre);
            remove(getPanel());
            getLbleresNuevoRegistrate().setVisible(false);
            lblSistemaMdicoNaafa.setVisible(false); 
            contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
            setLocationRelativeTo(null);
            setSize(900,600);
            getContentPane().add(principal,BorderLayout.CENTER);
            //Cargar los componentes para cada Usuario.
            switch(tipoUsuario){
            case "Administrador":
            case "ADMINISTRADOR":
            	principal.add(principal.getPanelAdmin(),BorderLayout.NORTH);
            	break;
            case "Paciente":
            case "paciente":
            case "PACIENTE":
            	principal.add(paciente,BorderLayout.NORTH);
            	break;
            case "Auxiliar":
            case "AUXILIAR":
            	principal.add(auxiliar,BorderLayout.NORTH);
            	break;
            case "Laboratorista":
            case "LABORATORISTA":
            	principal.add(laboratorista,BorderLayout.NORTH);
            	break;
            case "Farmaceutico":
            case "FARMACEUTICO":
            	principal.add(inventario,BorderLayout.NORTH);
            	break;
            case "Medico":
            case "MEDICO":
            	principal.add(medico,BorderLayout.NORTH);
            	break;
            }
            revalidate();
            repaint();
			} else{
				JOptionPane.showMessageDialog(this, "Usuario o contraseña invalida.","ERROR",JOptionPane.ERROR_MESSAGE);
				getLblUsuarioRegistradoCon().setForeground(Color.red);
			}
		}
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLbleresNuevoRegistrate() {
		return lbleresNuevoRegistrate;
	}

	public void setLbleresNuevoRegistrate(JLabel lbleresNuevoRegistrate) {
		this.lbleresNuevoRegistrate = lbleresNuevoRegistrate;
	}

	public JLabel getLblUsuarioRegistradoCon() {
		return lblUsuarioRegistradoCon;
	}

	public void setLblUsuarioRegistradoCon(JLabel lblUsuarioRegistradoCon) {
		this.lblUsuarioRegistradoCon = lblUsuarioRegistradoCon;
	}
}