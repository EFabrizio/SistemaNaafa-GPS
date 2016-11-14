package InterfazExpediente;


import com.panel.Fecha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Expediente extends javax.swing.JPanel {
    Conectar DB;
    java.sql.Connection cn;
    public Expediente() {
        initComponents();
        
       DB = new Conectar();
       cn = DB.conexion(this);
        if(cn.equals(null)){
                JOptionPane.showMessageDialog(this, "No se pudo Conectar a la Base de Datos","Error",JOptionPane.ERROR_MESSAGE);
                try{
                    cn.close();
                    
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(this, "Error al Desconectar\n"+ex,"Error",JOptionPane.ERROR_MESSAGE);
                }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        txtmotivo = new javax.swing.JTextArea();
        lbrevision = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtrevision = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        lbdiagnostico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdiagnostico = new javax.swing.JTextArea();
        lbmotivo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fecha1 = new Fecha();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtenfer = new javax.swing.JTextArea();
        lbenfer = new javax.swing.JLabel();

        txtmotivo.setColumns(20);
        txtmotivo.setRows(5);
        jScrollPane4.setViewportView(txtmotivo);

        lbrevision.setText("Revision");

        txtrevision.setColumns(20);
        txtrevision.setRows(5);
        jScrollPane2.setViewportView(txtrevision);

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        lbdiagnostico.setText("Diagnostico");

        txtdiagnostico.setColumns(20);
        txtdiagnostico.setRows(5);
        jScrollPane3.setViewportView(txtdiagnostico);

        lbmotivo.setText("Motivo de Consulta");

        jLabel1.setText("EXPEDIENTE MEDICO ");

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        txtenfer.setColumns(20);
        txtenfer.setRows(5);
        jScrollPane1.setViewportView(txtenfer);

        lbenfer.setText("Enfermedad o Problema de salud");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(490, 490, 490)
                            .addComponent(btnGuardar)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbrevision)
                                    .addComponent(lbenfer)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbdiagnostico)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(lbmotivo)
                            .addComponent(jScrollPane4))
                        .addGap(60, 60, 60)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbmotivo)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbenfer)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbdiagnostico)
                    .addComponent(lbrevision, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
       if (txtmotivo.getText().equals("")){
           JOptionPane.showMessageDialog(this, "No hay un motivo de consulta","ERROR",JOptionPane.ERROR_MESSAGE);
           return;
       }
       if (txtrevision.getText().equals("")){
           JOptionPane.showMessageDialog(this, "No hay revision del paciente","ERROR",JOptionPane.ERROR_MESSAGE);
           return;
       }
       if (txtdiagnostico.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Inserte el diagnostico del paciente","ERROR",JOptionPane.ERROR_MESSAGE);
           return;
       }
       if (txtenfer.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Inserte enfermedad o problema","ERROR",JOptionPane.ERROR_MESSAGE);
           return;
       }
        if (llenarDatos()>0){
            JOptionPane.showMessageDialog(null, "Registro insertado");
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        try{
            cn.close();
            System.exit(0);
        }catch(SQLException ex){
            System.out.println("Error al desconectar "+ex);
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    public int GuardarExpediente (String idExpediente,String Enfermedad_Problema, String fecha, String idCurp, String Motivo_consulta, String Revision, String Diagnostico) {
        int resultado = 0;
        Connection con = null;
        String SSQL = "INSERT INTO expediente (Enfermedad_Problema, Fecha, idCurp, Motivo_consulta, Revision, Diagnostico)"
                + "values (?,?,?,?,?,?)" ;
                try {
            PreparedStatement psql = DB.conectar.prepareStatement(SSQL);
            
            psql.setString(1,Enfermedad_Problema);
            psql.setString(2,fecha);
            psql.setString(3, idCurp);
            psql.setString(4, Motivo_consulta);
            psql.setString(5, Revision);
            psql.setString(6,Diagnostico);
            
            
            resultado = psql.executeUpdate();
            
            //psql.close();//cerrar conexión            
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
        }
        return resultado;
    }
    public int llenarDatos(){
        return 
        this.GuardarExpediente("idExpediente",txtenfer.getText(), fecha1.getfecha()[1], "ABGA651005MNTBRZ07", 
                txtmotivo.getText(), txtrevision.getText(), txtdiagnostico.getText());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private Fecha fecha1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbdiagnostico;
    private javax.swing.JLabel lbenfer;
    private javax.swing.JLabel lbmotivo;
    private javax.swing.JLabel lbrevision;
    private javax.swing.JTextArea txtdiagnostico;
    private javax.swing.JTextArea txtenfer;
    private javax.swing.JTextArea txtmotivo;
    private javax.swing.JTextArea txtrevision;
    // End of variables declaration//GEN-END:variables
}
