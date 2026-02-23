package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private String db = "lp2_2026";
    
    private String url = "jdbc:mysql://localhost:3306/"+db;
    private String user = "root";
    private String pass ="mysql";
    
    private String driver ="com.mysql.cj.jdbc.Driver";
    
    public Connection conectar(){
        
        try {
            Connection  link;
            Class.forName(driver);
            link = DriverManager.getConnection(url, user, pass);
            
            return link;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return null;
    }
    
}