/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafaa.gui.farmaceutico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio Rafael
 */
public class Panel_Provedores extends javax.swing.JPanel {

    /**
     * Creates new form Provedores
     */
    
    public Panel_Provedores() {
        initComponents();
    }
    
    public int registrarProvedores(String Empresa, String contacto, String direccion, String estado, int clave_mun, int codigo_postal,String telefono, String web){
        int resultado = 0;
        String SSQL = "INSERT INTO Provedores (Empresa,contacto,direccion,estado,clave_mun,codigo_postal,telefono, web) "
                + "VALUES (?, ?, ?, ?,?, ?, ?, ?)";

/*        try {
            PreparedStatement psql = DB.link.prepareStatement(SSQL);
            psql.setString(1, Empresa);
            psql.setString(2, contacto);
            psql.setString(3, direccion);
            psql.setString(4, estado);
            psql.setInt(5, clave_mun);
            psql.setInt(6,codigo_postal);
            psql.setString(7, telefono);
            psql.setString(8, web);
        
            resultado = psql.executeUpdate();
        
            psql.close();//cerrar conexión            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al intentar almacenar la información:\n"
                                         + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                if(con!=null){
                    con.close();   
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar cerrar la conexión:\n"
                                         + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);   
            }
        }*/
        return resultado;
    }
    
    public int eliminar(String id){
        int resultado = 0;
        Connection con = null;
       // String SSQL = "delete from Provedores where id = ?";

       /* try {
            PreparedStatement psql = DB.link.prepareStatement(SSQL);
            psql.setInt(1, Integer.parseInt(id));
            resultado = psql.executeUpdate();
            psql.close();//cerrar conexión            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al intentar almacenar la información:\n"
                                         + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                if(con!=null){
                    con.close();   
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar cerrar la conexión:\n"
                                         + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);   
            }
        }*/
        return resultado;
    }
    
    public int modificar(String empresa, String nueva_empresa, String contacto,String direccion, String estado,int clave, int codpos, String telefono,String web){
        int resultado = 0;
        Connection con = null;
        String SSQL = "update Provedores set Empresa = ?, contacto = ?, direccion = ?, estado = ?, clave_mun = ?, codigo_postal = ?, telefono = ?, web = ?"
                + "where Empresa like ?";

       /* try {
            PreparedStatement psql = DB.link.prepareStatement(SSQL);
            psql.setString(1,nueva_empresa);
            psql.setString(2,contacto);
            psql.setString(3,direccion);
            psql.setString(4,estado);
            psql.setInt(5,clave);
            psql.setInt(6,codpos);
            psql.setString(7,telefono);
            psql.setString(8,web);
            psql.setString(9,empresa);
            resultado = psql.executeUpdate();
            psql.close();//cerrar conexión            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al intentar almacenar la información:\n"
                                         + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                if(con!=null){
                    con.close();   
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar cerrar la conexión:\n"
                                         + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);   
            }
        }*/
        return resultado;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSpinner2 = new javax.swing.JSpinner();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Generales"));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Empresa:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre del Contacto:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Dirección de la Empresa:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Estado:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Clave del Municipio:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Codigo Postal:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Pagina WEB:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUASCALIENTES", "BAJA CALIFORNIA", "BAJA CALIFORNIA SUR", "CAMPECHE", "COAHUILA", "COLIMA", "CHIAPAS", "CHIHUAHUA", "DISTRITO FEDERAL", "DURANGO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MEXICO", "MICHOACAN", "MORELOS", "NAYARIT", "NUEVO LEON", "OAXACA", "PUEBLA", "QUERETARO", "QUINTANA ROO", "SAN LUIS POTOSI", "SINALOA", "SONORA", "TABASCO", "TAMAULIPAS", "TLAXCALA", "VERACRUZ", "YUCATAN", "ZACATECAS" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jSpinner1.setValue(1);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jCheckBox1.setText("Marcar si se desconoce");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1))
                            .addComponent(jTextField5))
                        .addGap(0, 356, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Registrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Generales"));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Empresa:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Nombre del Contacto:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Dirección de la Empresa:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Estado:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Clave del Municipio:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Codigo Postal:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Telefono:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Pagina WEB:");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUASCALIENTES", "BAJA CALIFORNIA", "BAJA CALIFORNIA SUR", "CAMPECHE", "COAHUILA", "COLIMA", "CHIAPAS", "CHIHUAHUA", "DISTRITO FEDERAL", "DURANGO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MEXICO", "MICHOACAN", "MORELOS", "NAYARIT", "NUEVO LEON", "OAXACA", "PUEBLA", "QUERETARO", "QUINTANA ROO", "SAN LUIS POTOSI", "SINALOA", "SONORA", "TABASCO", "TAMAULIPAS", "TLAXCALA", "VERACRUZ", "YUCATAN", "ZACATECAS" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jSpinner2.setValue(1);
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jCheckBox2.setText("Marcar si se desconoce");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });

        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Nuevo Nombre de Empresa:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12)
                    .addComponent(jTextField7)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField10)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jSpinner2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2))
                            .addComponent(jTextField11))
                        .addGap(0, 340, Short.MAX_VALUE))
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton3.setText("Modificar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Empresa", "Contacto", "Dirección", "Estado", "Clave", "Código Postal", "Pagina WEB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Eliminar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Eliminar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    String msg = "";
    if(jTextField1.getText().equals("")){
        msg = "El campo Empresa esta vacio\n";
    }
    if(jTextField2.getText().equals("")){
        msg = msg+"Nombre del Contacto esta vacio\n";
    }
    if(jTextField3.getText().equals("")){
        msg = msg+"Dirección de la Empresa esta vacio\n";
    }
    if(jTextField4.getText().length() != 5){
        msg = msg+"El código postal debe estar compuesto por 5 digitos\n";
    }
    if(jTextField5.getText().equals("")){
        msg = msg+"Telefono esta Vacio\n";
    }
    if(msg.length() > 0){
        JOptionPane.showMessageDialog(this, msg,"ERROR",JOptionPane.ERROR_MESSAGE);
        return;
    }
    int a = registrarProvedores(jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jComboBox1.getSelectedItem().toString(),
                (jCheckBox1.isSelected())?-1:Integer.parseInt(jSpinner1.getValue().toString()),Integer.parseInt(jTextField4.getText()),jTextField5.getText(),jTextField6.getText());
    if(a==1){
        JOptionPane.showMessageDialog(this, "Provedor Registrado");
        limpiar1();
        return;
    }
    JOptionPane.showMessageDialog(this, "Provedor NO Registrado","ERROR",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if (jTextField2.getText().length()== 100)
            evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if (jTextField3.getText().length()== 150)
            evt.consume();
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char i = evt.getKeyChar();
        if (i!='0' && i!='1' && i!='2' && i!='3' && i!='4' && i!='5' && i!='6' && i!='7' && i!='8' && i!='9'){
            evt.consume();
        }
        
        if (jTextField4.getText().length() == 5)
            evt.consume();
        
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char i = evt.getKeyChar();
        if (i!='0' && i!='1' && i!='2' && i!='3' && i!='4' && i!='5' && i!='6' && i!='7' && i!='8' && i!='9'){
            evt.consume();
        }
        
        if (jTextField5.getText().length() == 12)
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        
    }//GEN-LAST:event_jCheckBox1StateChanged
    public void spinner(){
        if(Integer.parseInt(jSpinner1.getValue().toString())<=1){
            jSpinner1.setValue(1);
        }
        if(jComboBox1.getSelectedIndex()==0 && Integer.parseInt(jSpinner1.getValue().toString())>=11){
            jSpinner1.setValue(11);
        }
        if(jComboBox1.getSelectedIndex()==1 && Integer.parseInt(jSpinner1.getValue().toString())>=5){
            jSpinner1.setValue(5);
        }
        if(jComboBox1.getSelectedIndex()==2 && Integer.parseInt(jSpinner1.getValue().toString())>=5){
            jSpinner1.setValue(5);
        }
        if(jComboBox1.getSelectedIndex()==3 && Integer.parseInt(jSpinner1.getValue().toString())>=11){
            jSpinner1.setValue(11);
        }
        if(jComboBox1.getSelectedIndex()==4 && Integer.parseInt(jSpinner1.getValue().toString())>=122){
            jSpinner1.setValue(122);
        }
        if(jComboBox1.getSelectedIndex()==5 && Integer.parseInt(jSpinner1.getValue().toString())>=67){
            jSpinner1.setValue(67);
        }
        if(jComboBox1.getSelectedIndex()==6 && Integer.parseInt(jSpinner1.getValue().toString())>=38){
            jSpinner1.setValue(38);
        }
        if(jComboBox1.getSelectedIndex()==7 && Integer.parseInt(jSpinner1.getValue().toString())>=10){
            jSpinner1.setValue(10);
        }
        if(jComboBox1.getSelectedIndex()==8 && Integer.parseInt(jSpinner1.getValue().toString())>=16){
            jSpinner1.setValue(16);
        }
        if(jComboBox1.getSelectedIndex()==9 && Integer.parseInt(jSpinner1.getValue().toString())>=39){
            jSpinner1.setValue(39);
        }
        if(jComboBox1.getSelectedIndex()==10 && Integer.parseInt(jSpinner1.getValue().toString())>=46){
            jSpinner1.setValue(46);
        }
        if(jComboBox1.getSelectedIndex()==11 && Integer.parseInt(jSpinner1.getValue().toString())>=81){
            jSpinner1.setValue(81);
        }
        if(jComboBox1.getSelectedIndex()==12 && Integer.parseInt(jSpinner1.getValue().toString())>=84){
            jSpinner1.setValue(84);
        }
        if(jComboBox1.getSelectedIndex()==13 && Integer.parseInt(jSpinner1.getValue().toString())>=125){
            jSpinner1.setValue(125);
        }
        if(jComboBox1.getSelectedIndex()==14 && Integer.parseInt(jSpinner1.getValue().toString())>=125){
            jSpinner1.setValue(125);
        }
        if(jComboBox1.getSelectedIndex()==15 && Integer.parseInt(jSpinner1.getValue().toString())>=113){
            jSpinner1.setValue(113);
        }
        if(jComboBox1.getSelectedIndex()==16 && Integer.parseInt(jSpinner1.getValue().toString())>=33){
            jSpinner1.setValue(33);
        }
        if(jComboBox1.getSelectedIndex()==17 && Integer.parseInt(jSpinner1.getValue().toString())>=20){
            jSpinner1.setValue(20);
        }
        if(jComboBox1.getSelectedIndex()==18 && Integer.parseInt(jSpinner1.getValue().toString())>=51){
            jSpinner1.setValue(51);
        }
        if(jComboBox1.getSelectedIndex()==19 && Integer.parseInt(jSpinner1.getValue().toString())>=570){
            jSpinner1.setValue(570);
        }
        if(jComboBox1.getSelectedIndex()==20 && Integer.parseInt(jSpinner1.getValue().toString())>=18){
            jSpinner1.setValue(18);
        }
        if(jComboBox1.getSelectedIndex()==21 && Integer.parseInt(jSpinner1.getValue().toString())>=11){
            jSpinner1.setValue(11);
        }
        if(jComboBox1.getSelectedIndex()==22 && Integer.parseInt(jSpinner1.getValue().toString())>=58){
            jSpinner1.setValue(58);
        }
        if(jComboBox1.getSelectedIndex()==23 && Integer.parseInt(jSpinner1.getValue().toString())>=18){
            jSpinner1.setValue(18);
        }
        if(jComboBox1.getSelectedIndex()==24 && Integer.parseInt(jSpinner1.getValue().toString())>=72){
            jSpinner1.setValue(72);
        }
        if(jComboBox1.getSelectedIndex()==25 && Integer.parseInt(jSpinner1.getValue().toString())>=17){
            jSpinner1.setValue(17);
        }
        if(jComboBox1.getSelectedIndex()==26 && Integer.parseInt(jSpinner1.getValue().toString())>=43){
            jSpinner1.setValue(43);
        }
        if(jComboBox1.getSelectedIndex()==27 && Integer.parseInt(jSpinner1.getValue().toString())>=60){
            jSpinner1.setValue(60);
        }
        if(jComboBox1.getSelectedIndex()==28 && Integer.parseInt(jSpinner1.getValue().toString())>=212){
            jSpinner1.setValue(212);
        }
        if(jComboBox1.getSelectedIndex()==29 && Integer.parseInt(jSpinner1.getValue().toString())>=106){
            jSpinner1.setValue(106);
        }
        if(jComboBox1.getSelectedIndex()==30 && Integer.parseInt(jSpinner1.getValue().toString())>=58){
            jSpinner1.setValue(58);
        }
    }
    
    public void spinner2(){
        if(Integer.parseInt(jSpinner2.getValue().toString())<=1){
            jSpinner2.setValue(1);
        }
        if(jComboBox2.getSelectedIndex()==0 && Integer.parseInt(jSpinner2.getValue().toString())>=11){
            jSpinner2.setValue(11);
        }
        if(jComboBox2.getSelectedIndex()==1 && Integer.parseInt(jSpinner2.getValue().toString())>=5){
            jSpinner2.setValue(5);
        }
        if(jComboBox2.getSelectedIndex()==2 && Integer.parseInt(jSpinner2.getValue().toString())>=5){
            jSpinner2.setValue(5);
        }
        if(jComboBox2.getSelectedIndex()==3 && Integer.parseInt(jSpinner2.getValue().toString())>=11){
            jSpinner2.setValue(11);
        }
        if(jComboBox2.getSelectedIndex()==4 && Integer.parseInt(jSpinner2.getValue().toString())>=122){
            jSpinner2.setValue(122);
        }
        if(jComboBox2.getSelectedIndex()==5 && Integer.parseInt(jSpinner2.getValue().toString())>=67){
            jSpinner2.setValue(67);
        }
        if(jComboBox2.getSelectedIndex()==6 && Integer.parseInt(jSpinner1.getValue().toString())>=38){
            jSpinner2.setValue(38);
        }
        if(jComboBox2.getSelectedIndex()==7 && Integer.parseInt(jSpinner2.getValue().toString())>=10){
            jSpinner2.setValue(10);
        }
        if(jComboBox2.getSelectedIndex()==8 && Integer.parseInt(jSpinner2.getValue().toString())>=16){
            jSpinner2.setValue(16);
        }
        if(jComboBox2.getSelectedIndex()==9 && Integer.parseInt(jSpinner2.getValue().toString())>=39){
            jSpinner2.setValue(39);
        }
        if(jComboBox2.getSelectedIndex()==10 && Integer.parseInt(jSpinner2.getValue().toString())>=46){
            jSpinner2.setValue(46);
        }
        if(jComboBox2.getSelectedIndex()==11 && Integer.parseInt(jSpinner2.getValue().toString())>=81){
            jSpinner2.setValue(81);
        }
        if(jComboBox2.getSelectedIndex()==12 && Integer.parseInt(jSpinner2.getValue().toString())>=84){
            jSpinner2.setValue(84);
        }
        if(jComboBox2.getSelectedIndex()==13 && Integer.parseInt(jSpinner2.getValue().toString())>=125){
            jSpinner2.setValue(125);
        }
        if(jComboBox2.getSelectedIndex()==14 && Integer.parseInt(jSpinner2.getValue().toString())>=125){
            jSpinner2.setValue(125);
        }
        if(jComboBox2.getSelectedIndex()==15 && Integer.parseInt(jSpinner2.getValue().toString())>=113){
            jSpinner2.setValue(113);
        }
        if(jComboBox2.getSelectedIndex()==16 && Integer.parseInt(jSpinner2.getValue().toString())>=33){
            jSpinner2.setValue(33);
        }
        if(jComboBox2.getSelectedIndex()==17 && Integer.parseInt(jSpinner2.getValue().toString())>=20){
            jSpinner2.setValue(20);
        }
        if(jComboBox2.getSelectedIndex()==18 && Integer.parseInt(jSpinner2.getValue().toString())>=51){
            jSpinner2.setValue(51);
        }
        if(jComboBox2.getSelectedIndex()==19 && Integer.parseInt(jSpinner2.getValue().toString())>=570){
            jSpinner2.setValue(570);
        }
        if(jComboBox2.getSelectedIndex()==20 && Integer.parseInt(jSpinner2.getValue().toString())>=18){
            jSpinner2.setValue(18);
        }
        if(jComboBox2.getSelectedIndex()==21 && Integer.parseInt(jSpinner2.getValue().toString())>=11){
            jSpinner2.setValue(11);
        }
        if(jComboBox2.getSelectedIndex()==22 && Integer.parseInt(jSpinner2.getValue().toString())>=58){
            jSpinner2.setValue(58);
        }
        if(jComboBox2.getSelectedIndex()==23 && Integer.parseInt(jSpinner2.getValue().toString())>=18){
            jSpinner2.setValue(18);
        }
        if(jComboBox2.getSelectedIndex()==24 && Integer.parseInt(jSpinner2.getValue().toString())>=72){
            jSpinner2.setValue(72);
        }
        if(jComboBox2.getSelectedIndex()==25 && Integer.parseInt(jSpinner2.getValue().toString())>=17){
            jSpinner2.setValue(17);
        }
        if(jComboBox2.getSelectedIndex()==26 && Integer.parseInt(jSpinner2.getValue().toString())>=43){
            jSpinner2.setValue(43);
        }
        if(jComboBox2.getSelectedIndex()==27 && Integer.parseInt(jSpinner2.getValue().toString())>=60){
            jSpinner2.setValue(60);
        }
        if(jComboBox2.getSelectedIndex()==28 && Integer.parseInt(jSpinner2.getValue().toString())>=212){
            jSpinner2.setValue(212);
        }
        if(jComboBox2.getSelectedIndex()==29 && Integer.parseInt(jSpinner2.getValue().toString())>=106){
            jSpinner2.setValue(106);
        }
        if(jComboBox2.getSelectedIndex()==30 && Integer.parseInt(jSpinner2.getValue().toString())>=58){
            jSpinner2.setValue(58);
        }
    }
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        spinner();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if(jCheckBox1.isSelected()){
            jSpinner1.setValue(-1);
            jSpinner1.setEnabled(false);
        }else{
            jSpinner1.setEnabled(true);
            jSpinner1.setValue(1);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        spinner();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        if (jTextField6.getText().length() == 50)
            evt.consume();
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        if (jTextField8.getText().length()== 100)
            evt.consume();
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        if (jTextField9.getText().length()== 150)
            evt.consume();
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        spinner2();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        spinner2();
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        char i = evt.getKeyChar();
        if (i!='0' && i!='1' && i!='2' && i!='3' && i!='4' && i!='5' && i!='6' && i!='7' && i!='8' && i!='9'){
            evt.consume();
        }
        
        if (jTextField10.getText().length() == 5)
            evt.consume();
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        char i = evt.getKeyChar();
        if (i!='0' && i!='1' && i!='2' && i!='3' && i!='4' && i!='5' && i!='6' && i!='7' && i!='8' && i!='9'){
            evt.consume();
        }
        
        if (jTextField11.getText().length() == 12)
            evt.consume();
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        if (jTextField12.getText().length() == 50)
            evt.consume();
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2StateChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (jTextField1.getText().length()== 150)
        evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(jTabbedPane1.getSelectedIndex()==0){
            //JOptionPane.showMessageDialog(this, "registrar");
            return;
        }
        if(jTabbedPane1.getSelectedIndex()==1){
        
        }
            //JOptionPane.showMessageDialog(this, "modificar");
            //llenarCombo();
                   // String SSQL= "SELECT * FROM Provedores WHERE Empresa = ?";
       /* try {
            PreparedStatement st = DB.link.prepareStatement(SSQL);
            st.setString(1, jComboBox4.getSelectedItem().toString());
            ResultSet rs = st.executeQuery();
            rs.next();
            jTextField7.setText(rs.getString("Empresa"));
            jTextField8.setText(rs.getString("contacto"));
            jTextField9.setText(rs.getString("direccion"));
            jTextField10.setText(rs.getString("codigo_postal"));
            jTextField11.setText(rs.getString("telefono"));
            jTextField12.setText(rs.getString("web"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }

            return;
        }
        if(jTabbedPane1.getSelectedIndex()==2){
            //JOptionPane.showMessageDialog(this, "eliminar");
            llenarTabla();
            return;
        }*/
    }//GEN-LAST:event_jTabbedPane1StateChanged
    
    public void llenarCombo(){
            jComboBox4.removeAllItems();
            String SSQL= "SELECT Empresa FROM Provedores";
           /* try {
                PreparedStatement st = DB.link.prepareStatement(SSQL);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    jComboBox4.addItem(rs.getString("Empresa"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
                return;
            }*/
            System.out.println("dsfsdfsdf");
    }
    
    public void llenarTabla(){
        jTable1.removeAll();
        String SSQL = "SELECT * FROM Provedores";
        /*try {
            PreparedStatement st = DB.link.prepareStatement(SSQL);
            ResultSet rs = st.executeQuery();
            String vector [] = {"ID","EMPRESA","CONTACTO","DIRECCIÓN","ESTADO","CLAVE","CÓDIGO POSTAL","TELEFONO","PAGINA WEB"};
            DefaultTableModel modelo = new DefaultTableModel(vector,0);
            while(rs.next()){
                String fila[]= {
                rs.getString("id"),
                rs.getString("Empresa"),
                rs.getString("contacto"),
                rs.getString("direccion"),
                rs.getString("estado"),
                rs.getString("clave_mun"),
                rs.getString("codigo_postal"),
                rs.getString("telefono"),
                rs.getString("web")};
                modelo.addRow(fila);
            }
            jTable1.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }*/
        
    }
    
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        int y = eliminar(id);
        if(y < 1){
            JOptionPane.showMessageDialog(this, "No se elimino el registro","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        llenarTabla();
        JOptionPane.showMessageDialog(this, "Provedor Eliminado");
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
//(String empresa, String nueva_empresa, String contacto,String direccion, String estado,int clave, int codpos, String telefono,String web){    
        String msg = "";
        if(jTextField7.getText().equals("")){
            msg = "El campo Nuevo nombre Empresa esta vacio\n";
        }
        if(jTextField8.getText().equals("")){
            msg = msg+"Nombre del Contacto esta vacio\n";
        }
        if(jTextField9.getText().equals("")){
            msg = msg+"Dirección de la Empresa esta vacio\n";
        }
        if(jTextField10.getText().length() != 5){
            msg = msg+"El código postal debe estar compuesto por 5 digitos\n";
        }
        if(jTextField11.getText().equals("")){
            msg = msg+"Telefono esta Vacio\n";
        }
        if(msg.length() > 0){
            JOptionPane.showMessageDialog(this, msg,"ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int dd = this.modificar(jTextField7.getText(), jComboBox4.getSelectedItem().toString(),
                jTextField8.getText(), jTextField9.getText(), jComboBox2.getSelectedItem().toString(), jCheckBox2.isSelected()?-1:Integer.parseInt(jSpinner2.getValue().toString()),
                Integer.parseInt(jTextField10.getText()), jTextField11.getText(), jTextField12.getText());
        if(dd < 1){
            JOptionPane.showMessageDialog(this, "Proverdor NO Modificado","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Proverdor Modificado");
        llenarCombo();
        limpiar2();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        if (jTextField7.getText().length()== 150)
        evt.consume();
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        String SSQL= "SELECT * FROM Provedores WHERE Empresa = ?";
        /*try {
            PreparedStatement st = DB.link.prepareStatement(SSQL);
            st.setString(1, jComboBox4.getSelectedItem().toString());
            ResultSet rs = st.executeQuery();
            rs.next();
            jTextField7.setText(rs.getString("Empresa"));
            jTextField8.setText(rs.getString("contacto"));
            jTextField9.setText(rs.getString("direccion"));
            jTextField10.setText(rs.getString("codigo_postal"));
            jTextField11.setText(rs.getString("telefono"));
            jTextField12.setText(rs.getString("web"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }catch(java.lang.NullPointerException gfg){
        
        }*/


    }//GEN-LAST:event_jComboBox4ItemStateChanged
    
    public void limpiar1(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }
    
    public void limpiar2(){
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
