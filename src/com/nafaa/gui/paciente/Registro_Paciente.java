/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafaa.gui.paciente;

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
import javax.swing.LayoutStyle.ComponentPlacement;

import com.nafaa.database.Database;
import com.nafaa.util.Calculos;


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
public class Registro_Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Paciente
     */
   public JPanel todo;
    java.sql.Connection cn;
  String [] claves = {"AS","BC","BS","CC","CS","CH","CL","CM","DF","DG","GT","GR","HG","JC","MC","MN","MS","NT","NL",
"OC","PL","QT","QR","SP","SL","SR","TC","TS","TL","VZ","YN","ZS"};
  
    public Registro_Paciente() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);

        jTextField1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                if (jTextField1.getText().length()== 20)
                    e.consume();
                 
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                
            }
        });
        
        jPasswordField1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                if (jPasswordField1.getText().length()== 20)
                    e.consume();
                    
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                
            }
        });
        
        jPasswordField2.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                
                if (jPasswordField2.getText().length()== 20)
                    e.consume();
                    
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                
            }
        });
        
       
        
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Pacientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales:"));

        jLabel6.setText("Nombre(s):");

        jLabel7.setText("Apellido Paterno:");

        jLabel8.setText("Apellido Materno:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Masculino");

        jLabel9.setText("Sexo:");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Femenino");

        jLabel10.setText("Fecha de Nacimiento:");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField1.setText("18/04/1995");
        jFormattedTextField1.setToolTipText("DD/MM/AAAA");

        jLabel11.setText("Domicilio:");

        jLabel12.setText("Tipo de Sangre:");


        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel13.setText("Entidad Federativa de Nacimiento:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUASCALIENTES", "BAJA CALIFORNIA", "BAJA CALIFORNIA SUR", "CAMPECHE", "COAHUILA DE ZARAGOZA", "COLIMA", "CHIAPAS", "CHIHUAHUA", "DISTRITO FEDERAL", "DURANGO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MEXICO", "MICHOACAN DE OCAMPO", "MORELOS", "NAYARIT", "NUEVO LEON", "OAXACA", "PUEBLA", "QUERETARO", "QUINTANA ROO", "SAN LUIS POTOSI", "SINALOA", "SONORA", "TABASCO", "TAMAULIPAS", "TLAXCALA", "VERACRUZ DE IGNACIO DE LA LLAVE", "YUCATAN", "ZACATECAS" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel10)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jFormattedTextField1, 371, 371, 371))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel11)
        						.addComponent(jLabel12))
        					.addGap(45)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField5, 384, 384, 384)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel7)
        						.addComponent(jLabel6)
        						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField3, 402, 402, 402)
        						.addComponent(jTextField7, Alignment.TRAILING, 402, 402, 402)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(133)
        					.addComponent(jTextField4, 408, 408, 408))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel9)
        							.addGap(101)
        							.addComponent(jRadioButton1)
        							.addGap(18)
        							.addComponent(jRadioButton2))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel13)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(0, 6, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(43)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(10)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jRadioButton1)
        				.addComponent(jLabel9)
        				.addComponent(jRadioButton2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel10)
        				.addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel12)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel13))
        				.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				 jButton1MouseClicked(e);
				
			}
        	
        });

        jButton2.setText("Regresar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Usuario:"));

        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setText("Contraseña:");

        jLabel4.setText("Confirmar Contraseña:");



        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(todo);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        						.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        						.addComponent(jLabel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(32)
        					.addComponent(jButton2)
        					.addPreferredGap(ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
        					.addComponent(jButton1)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addContainerGap())
        );
        todo.setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public javax.swing.JButton getjButton2() {
		return jButton2;
	}





	public void setjButton2(javax.swing.JButton jButton2) {
		this.jButton2 = jButton2;
	}





    private void jButton1MouseClicked(ActionEvent e) {//GEN-FIRST:event_jButton1MouseClicked
        if(!new String(jPasswordField1.getText()).equals(new String(jPasswordField2.getText()))){
            JOptionPane.showMessageDialog(this, "Contraseñas diferentes","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //NOMBRE DE USUARIO
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //CONTRASEÑA
        if(new String(jPasswordField1.getPassword()).equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //CONTRASEÑA CONFIRMACIÓN
        if(new String(jPasswordField2.getPassword()).equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
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
        if(this.jFormattedTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jTextField5.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese Datos en todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!jRadioButton1.isSelected() && !jRadioButton2.isSelected()){
            JOptionPane.showMessageDialog(this, "Seleccione un Sexo","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        /////////////////////
        //GENERADOR DE CRUP
        if(isDate(jFormattedTextField1.getText()))
            Validar();
        else
            JOptionPane.showMessageDialog(this, "Revisar Fecha de Nacimiento","ERROR",JOptionPane.ERROR_MESSAGE);
        //int s = this.Usuario(jTextField1.getText(), new String(jPasswordField1.getPassword()), "Pasiente", "Activo");
        //int ss = this.GuardarPaciente(jTextField2.getText(), jTextField3.getText()+" "+jTextField4.getText()+" "+jTextField7.getText(), (jRadioButton1.isSelected())?"H":"M", jComboBox1.getSelectedItem().toString(), this.jFormattedTextField1.getText(), jTextField5.getText());
       // if(s==1 && ss==1){
        //    JOptionPane.showMessageDialog(this, "Nuevo Usuario Creado","CORRECTO",JOptionPane.INFORMATION_MESSAGE);
        //}
        Database.getDatabase().queryDDL("INSERT INTO Naafa_corp.Usuario (Nombre_Usuario,Contraseña,Tipo,Estado) "
        		+ "VALUES('"+jTextField1.getText()+"','"+jPasswordField1.getText()+"','Paciente','Activo') ");
        //CURP PENDIENTE...
       String number = Database.getDatabase().queryDMLExtract("idUsuario","SELECT idUsuario FROM Naafa_corp.Usuario ORDER BY idUsuario DESC LIMIT 1;");
       Database.getDatabase().queryDDL("INSERT INTO Naafa_corp.Paciente (idCurp,NombreCompleto,Sexo,idUsuario,Tipo_Sangre,FechaNacimiento,Domicilio) "
       		+ "VALUES('"+"','"+jTextField4.getText()+" "+jTextField5.getText()+" "+jTextField7.getText()+"','"+"M"+"','"+number+"','O+','1965-01-02','OTRANTO')");
        
        javax.swing.JOptionPane.showMessageDialog(this, "Registro realizado con exito.\n Usuario+"+jTextField1.getText()+"\n"+"Tipo: Paciente");
       
    }//GEN-LAST:event_jButton1MouseClicked


    

    
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
    		jTextField3.getText().equals("")||
    		jFormattedTextField1.getText().split("/")[2].equals(""))
                JOptionPane.showMessageDialog(null,"Por favor llene todos los campos","Campo(s) vacios",JOptionPane.ERROR_MESSAGE);
    	
                else if(!jTextField4.getText().matches("[A-Z]+[A-ÑO-Z]+"))
                	JOptionPane.showMessageDialog(null, "Por favor utilize letras MAYUSCULAS y sin acentos ortográficos","Primer apellido invalido",JOptionPane.ERROR_MESSAGE);
                else if(!jTextField7.getText().matches("[A-Z]+[A-ÑO-Z]+"))
                	JOptionPane.showMessageDialog(null, "Por favor utilize letras MAYUSCULAS y sin acentos ortográfico","Segundo apellido invalido",JOptionPane.ERROR_MESSAGE);
                else if(!jTextField3.getText().matches("([A-Z]+[A-ÑO-Z]+|[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+|[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+|[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+\\s[A-Z]+[A-ÑO-Z]+)"))
        		JOptionPane.showMessageDialog(null, "Por favor utilize letras MAYUSCULAS y sin acentos ortográfico","Nombre invalido",JOptionPane.ERROR_MESSAGE);
                else if(!jFormattedTextField1.getText().split("/")[2].matches("\\d{4}"))
                    JOptionPane.showMessageDialog(null, "El año debe ser de cuatro dígitos, ejemplo de año 1982","Año invalido",JOptionPane.ERROR_MESSAGE);
                else Obtenerdatos();
	}
	
	public void Obtenerdatos(){
		String paterno,materno,name, year;
			paterno=jTextField4.getText();
			materno=jTextField7.getText();
			name=jTextField3.getText();
			year= jFormattedTextField1.getText().split("/")[2];
			
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
			
            Calculos.Calcular(paterno,materno,nombrepil,year, jFormattedTextField1.getText().split("/")[1], jFormattedTextField1.getText().split("/")[0], (jRadioButton1.isSelected())?'H':'M',jComboBox2.getSelectedItem().toString(), name);
	}


    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
}
