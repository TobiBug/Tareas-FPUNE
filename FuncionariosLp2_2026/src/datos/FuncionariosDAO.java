
package datos;

import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.funcionarios;

public class FuncionariosDAO implements IDAO {
    
    Connection con = null;

    public FuncionariosDAO() throws SQLException{
        con = new Conexion().conectar();
    }
    
    
    @Override
    public ArrayList listar(String condicion) {
        try {
            ArrayList<funcionarios> lista = new ArrayList<>();
            String sql = "SELECT id, nombre, apellido, ci, sueldo" + "FROM funcionarios " + condicion;
            
            PreparedStatement ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
