/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafaa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.nafaa.database.Database;
import com.nafaa.util.Calculos;

import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Sergio Rafael
 * idCurp(18)
nombre completo(100)
sexo(2)
idUsuario FK
Tipo_Sangre(4)
FEchaNacimiento
Domicilio(100)

idUsuario
Nombre_usuario(20)
contraseña(20)
Tipo_usuario(20)
Estado(10)
 */
public class Registro_Empleado extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Paciente
     */
	
	private JLabel lblContrasea;
	private JLabel lblConfirmarContrasea;
	
   public JLabel getLblConfirmarContrasea() {
		return lblConfirmarContrasea;
	}



	public void setLblConfirmarContrasea(JLabel lblConfirmarContrasea) {
		this.lblConfirmarContrasea = lblConfirmarContrasea;
	}





	public JLabel getLblCantidadDisponible() {
		return lblCantidadDisponible;
	}





	public void setLblCantidadDisponible(JLabel lblCantidadDisponible) {
		this.lblCantidadDisponible = lblCantidadDisponible;
	}


public JPanel todo;
    java.sql.Connection cn;
  String [] claves = {"AS","BC","BS","CC","CS","CH","CL","CM","DF","DG","GT","GR","HG","JC","MC","MN","MS","NT","NL",
"OC","PL","QT","QR","SP","SL","SR","TC","TS","TL","VZ","YN","ZS"};
  
    public Registro_Empleado() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        
       
        
        jTextField5.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                if (jTextField5.getText().length()== 100)
                    e.consume();
                    
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                
            }
        });
        
        jTextField3.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                char charecter = e.getKeyChar();
		if (Character.isLowerCase(charecter)) {
			e.setKeyChar(Character.toUpperCase(charecter));
		}
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        jTextField4.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                char charecter = e.getKeyChar();
		if (Character.isLowerCase(charecter)) {
			e.setKeyChar(Character.toUpperCase(charecter));
		}
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        jTextField7.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                char charecter = e.getKeyChar();
		if (Character.isLowerCase(charecter)) {
			e.setKeyChar(Character.toUpperCase(charecter));
		}
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        
        
        
        
        /**
         * 
         * 
         *     return;
                }
                char charecter = e.getKeyChar();
		if (Character.isLowerCase(charecter)) {
			e.setKeyChar(Character.toUpperCase(charecter));
		}
         */
        
        
     
                
    }
                
        

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	todo = new JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Empleado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales:"));

        jLabel6.setText("Nombre Completo:");

        jLabel7.setText("Nombre Usuario:");

        jLabel8.setText("Tipo Usuario:");
        
        lblCantidadDisponible = new JLabel();
        lblCantidadDisponible.setText("Numero Celular:");
        jButton1 = new javax.swing.JButton();
        
                jButton1.setText("Registrar");
        
        textField = new JPasswordField();
        
        lblContrasea = new JLabel();
        lblContrasea.setText("Contraseña:");
        
        textField_1 = new JPasswordField();
        
        lblConfirmarContrasea = new JLabel();
        lblConfirmarContrasea.setText("Confirmar contraseña:");
        
        textField_2 = new JTextField();
        
        textField_3 = new JTextField();
        
        JLabel lblDomicilio = new JLabel();
        lblDomicilio.setText("Domicilio:");
        
        JLabel lblHorarioInicia = new JLabel();
        lblHorarioInicia.setText("Horario Inicia:");
        
        textField_4 = new JTextField();
        
        JLabel lblHorarioFin = new JLabel();
        lblHorarioFin.setText("Horario Fin:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel7)
        									.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblCantidadDisponible)
        									.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
        								.addGap(115)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(jTextField4)
        										.addComponent(jTextField5, Alignment.TRAILING)
        										.addComponent(jTextField7, Alignment.TRAILING, 402, 402, Short.MAX_VALUE))
        									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)))
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(lblConfirmarContrasea, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel6)
        							.addGap(111)
        							.addComponent(jTextField3, 402, 402, Short.MAX_VALUE))
        						.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        							.addComponent(lblHorarioInicia, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE))
        						.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        							.addComponent(lblDomicilio, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(27)
        					.addComponent(jButton1))
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblHorarioFin, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(22)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel8))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblCantidadDisponible))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblContrasea)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblConfirmarContrasea))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblDomicilio))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblHorarioInicia))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblHorarioFin))
        			.addGap(43)
        			.addComponent(jButton1)
        			.addGap(23))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(todo);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 575, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(34)
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        todo.setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents






    public JLabel getLblContrasea() {
		return lblContrasea;
	}



	public javax.swing.JButton getjButton1() {
		return jButton1;
	}





	private void jButton1MouseClicked(ActionEvent e) {//GEN-FIRST:event_jButton1MouseClicked
        
        if(jTextField3.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jTextField4.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jTextField7.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jTextField5.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        /////////////////////
        //GENERADOR DE CRUP
        //int s = this.Usuario(jTextField1.getText(), new String(jPasswordField1.getPassword()), "Pasiente", "Activo");
        //int ss = this.GuardarPaciente(jTextField2.getText(), jTextField3.getText()+" "+jTextField4.getText()+" "+jTextField7.getText(), (jRadioButton1.isSelected())?"H":"M", jComboBox1.getSelectedItem().toString(), this.jFormattedTextField1.getText(), jTextField5.getText());
       // if(s==1 && ss==1){
        //    JOptionPane.showMessageDialog(this, "Nuevo Usuario Creado","CORRECTO",JOptionPane.INFORMATION_MESSAGE);
        //}
      //  Database.getDatabase().queryDDL("INSERT INTO Naafa_corp.Usuario (Nombre_Usuario,Contraseña,Tipo,Estado) "
        //		+ "VALUES('"+jTextField1.getText()+"','"+jPasswordField1.getText()+"','Paciente','Activo') ");
        //CURP PENDIENTE...
       String number = Database.getDatabase().queryDMLExtract("idUsuario","SELECT idUsuario FROM Naafa_corp.Usuario ORDER BY idUsuario DESC LIMIT 1;");
       Database.getDatabase().queryDDL("INSERT INTO Naafa_corp.Paciente (idCurp,NombreCompleto,Sexo,idUsuario,Tipo_Sangre,FechaNacimiento,Domicilio) "
       		+ "VALUES('"+"','"+jTextField4.getText()+" "+jTextField5.getText()+" "+jTextField7.getText()+"','"+"M"+"','"+number+"','O+','1965-01-02','OTRANTO')");
        
        
       
    }//GEN-LAST:event_jButton1MouseClicked

    public int GuardarUsuario(String nombres, String contraseña, String Tipo, String Estado){

        int resultado = 0;
        Connection con = null;
        String SSQL = "INSERT INTO Usuario (Nombre_Usuario, Contraseña, tipo, Estado) "
                + "VALUES (?, ?, ?, ?)";

        /*try {
            PreparedStatement psql = DB.link.prepareStatement(SSQL);
            psql.setString(1, nombres);
            psql.setString(2, contraseña);
            psql.setString(3, Tipo);
            psql.setString(4, Estado);
        
            resultado = psql.executeUpdate();
        
            psql.close();//cerrar conexión            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                         + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                if(con!=null){
                    con.close();   
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                         + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);   
            }
        }*/
        return resultado;
    }
    
    public int GuardarPaciente(String idCurp, String Nombre, String Sexo, String Tipo_Sangre, String fechaNacimiento, String Domicilio){

        int resultado = 0;
        Connection con = null;
        String SSQL = "INSERT INTO Paciente (idCurp, NombreCompleto, Sexo, idUsuario, Tipo_Sangre, FechaNacimiento, Domicilio) "
                + "VALUES (?, ?, ?, (SELECT MAX(idUsuario) FROM Usuario), ?, ?, ?)";

        /*try {
            PreparedStatement psql = DB.link.prepareStatement(SSQL);
            psql.setString(1, idCurp);
            psql.setString(2, Nombre);
            psql.setString(3, Sexo);
            //psql.setInt(4, idUsuario);
            psql.setString(4, Tipo_Sangre);
            psql.setDate(5, new java.sql.Date(
            Integer.parseInt(fechaNacimiento.split("/")[2]),
                    Integer.parseInt(fechaNacimiento.split("/")[1]),
                        Integer.parseInt(fechaNacimiento.split("/")[0])
            ));
            psql.setString(6, Domicilio);
            resultado = psql.executeUpdate();
            psql.close();//cerrar conexión            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                         + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                if(con!=null){
                    con.close();   
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                         + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);   
            }
        }*/
        return resultado;
    }
    
    /*public int idUsuario(String nombre){
        int num = 0;
        String SSQL;
        SSQL= "SELECT Count(Nombre_Usuario) FROM Usuario WHERE Nombre_Usuario LIKE ?";
        try {
            PreparedStatement st = //DB.link.prepareStatement(SSQL);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                num = rs.getInt("Count(Nombre_Usuario)");  
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }
        return num;
    }
    
    public int CURP(String curp){
        int num = 0;
        String SSQL;
        SSQL= "SELECT Count(idCurp) FROM paciente WHERE idCurp LIKE ?";
        try {
            PreparedStatement st = DB.link.prepareStatement(SSQL);
            st.setString(1, curp);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                num = rs.getInt("Count(idCurp)");  
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }
        return num;
    }/*

    /**
     * @param args the command line arguments
     */
    
    
        public boolean isDate(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formatoFecha.parse(fechax);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public void Validar(){
		if(jTextField4.getText().equals("")||
    		jTextField7.getText().equals("")||
    		jTextField3.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Por favor llene todos los campos","Campo(s) vacios",JOptionPane.ERROR_MESSAGE);
    	
                else if(!jTextField4.getText().matches("[A-Z]+[A-ÑO-Z]+"))
                	JOptionPane.showMessageDialog(null, "Por favor utilize letras MAYUSCULAS y sin acentos ortográficos","Primer apellido invalido",JOptionPane.ERROR_MESSAGE);
                else if(!jTextField7.getText().matches("[A-Z]+[A-ÑO-Z]+"))
                	JOptionPane.showMessageDialog(null, "Por favor utilize letras MAYUSCULAS y sin acentos ortográfico","Segundo apellido invalido",JOptionPane.ERROR_MESSAGE);
                else if(!jTextField3.getText().matches("([A-Z]+[A-ÑO-Z]+|[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+|[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+|[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+)"))
        		JOptionPane.showMessageDialog(null, "Por favor utilize letras MAYUSCULAS y sin acentos ortográfico","Nombre invalido",JOptionPane.ERROR_MESSAGE);
                else Obtenerdatos();
	}
	
	public void Obtenerdatos(){
		String paterno,materno,name, year;
			paterno=jTextField4.getText();
			materno=jTextField7.getText();
			name=jTextField3.getText();
			
		String firstname = "";
    	String secondname = "";
    	String thirdname = "";
    	String fourthname = "";
    	String nombrepil = "";
    	StringTokenizer tokens = new StringTokenizer(name);
    	
    	//Dividir el nombre en subnombres
    	while(tokens.hasMoreTokens()){
    	if(firstname=="")
    		firstname=tokens.nextToken();
    		else if(secondname=="")
    			secondname=tokens.nextToken();
    			else if(thirdname=="")
    				thirdname=tokens.nextToken();
    				else if(fourthname=="")
    					fourthname=tokens.nextToken();
    	}
    	//Si el unico nombre es JOSE
    	if(firstname.equals("JOSE")&&secondname.equals("")&&thirdname.equals("")&&fourthname.equals(""))
    	nombrepil = firstname;
    	
		//Si el primer nombres es Jose y hay mas nombres, que tome el segundo
    	else if(firstname.equals("JOSE")&&secondname!=(""))
    	nombrepil = secondname;
    	
    	//Analizar si MARIA es el único nombre
    	else if(firstname.equals("MARIA")&&secondname.equals("")&&thirdname.equals("")&&fourthname.equals(""))
    	nombrepil = firstname;
    	
    	//Analizar si en el nombre se encuentra el nombre de MARIA DE LOS, si es asi, toma el cuarto nombre
    	else if(firstname.equals("MARIA")&&secondname.equals("DE")&&thirdname.equals("LOS"))
    	nombrepil = fourthname;
    	
    	//Analizar si en el nombre se encuentra el nombre de MARIA DE LA, si es asi, toma el cuarto nombre
    	else if(firstname.equals("MARIA")&&secondname.equals("DE")&&thirdname.equals("LA"))
    	nombrepil = fourthname;
    	
    	//Analizar si en el nombre aparce el nombre de MARIA DEL entonces toma el tercer nombre
    	else if(firstname.equals("MARIA")&&secondname.equals("DEL"))
    	nombrepil = thirdname;
    	
    	//Analizar si en el nombre aparece MARIA DE, entonces toma el tercer nombre, siempre y cuando en este no aparezcan los nombres LA, LOS
    	else if(firstname.equals("MARIA")&&secondname.equals("DE")&&thirdname!=("LA")&&thirdname!=("LOS"))
    	nombrepil = thirdname;
    	
    	//Analizar si tiene mas de 2 nombres y el primero es MARIA, entonces toma el segundo
    	else if(firstname.equals("MARIA")&&secondname!=("DE")&&secondname!=("DEL"))
    	nombrepil = secondname;
    	
    	else
    	nombrepil = firstname;
			
	}


    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JTextField getjTextField3() {
		return jTextField3;
	}





	public void setjTextField3(javax.swing.JTextField jTextField3) {
		this.jTextField3 = jTextField3;
	}





	public javax.swing.JTextField getjTextField4() {
		return jTextField4;
	}





	public void setjTextField4(javax.swing.JTextField jTextField4) {
		this.jTextField4 = jTextField4;
	}





	public javax.swing.JTextField getjTextField5() {
		return jTextField5;
	}





	public void setjTextField5(javax.swing.JTextField jTextField5) {
		this.jTextField5 = jTextField5;
	}





	public javax.swing.JTextField getjTextField7() {
		return jTextField7;
	}





	public void setjTextField7(javax.swing.JTextField jTextField7) {
		this.jTextField7 = jTextField7;
	}





	public JPasswordField getTextField() {
		return textField;
	}





	public void setTextField(JPasswordField textField) {
		this.textField = textField;
	}





	public JPasswordField getTextField_1() {
		return textField_1;
	}





	public void setTextField_1(JPasswordField textField_1) {
		this.textField_1 = textField_1;
	}


	private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private JLabel lblCantidadDisponible;
    private JPasswordField textField;
    private JPasswordField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

	public JPanel getTodo() {
		return todo;
	}



	public java.sql.Connection getCn() {
		return cn;
	}



	public String[] getClaves() {
		return claves;
	}



	public javax.swing.ButtonGroup getButtonGroup1() {
		return buttonGroup1;
	}



	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}



	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}



	public javax.swing.JLabel getjLabel7() {
		return jLabel7;
	}



	public javax.swing.JLabel getjLabel8() {
		return jLabel8;
	}



	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}



	public JTextField getTextField_2() {
		return textField_2;
	}



	public JTextField getTextField_3() {
		return textField_3;
	}



	public JTextField getTextField_4() {
		return textField_4;
	}
}