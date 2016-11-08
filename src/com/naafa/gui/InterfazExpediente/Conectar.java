package InterfazExpediente;



import java.sql.*;
import javax.swing.*;
import java.awt.*;
public class Conectar {
    Connection conectar = null;
    
    public Connection conexion(Component ss){
        
        try {
            //cargar el driver
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/Naafa_corp","root","gala123");
            JOptionPane.showMessageDialog(null, "Conexion establecida");
        }catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Error de conexion "+e);
        }
        return conectar;
    }
    
}

