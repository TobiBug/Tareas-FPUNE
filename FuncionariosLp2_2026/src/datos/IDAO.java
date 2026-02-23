
package datos;

import java.util.ArrayList;


public interface IDAO {
    ArrayList listar(String condicion);
    
    void insertar(Object obj);
    
    void modificar(Object obj);
    
    void eliminar(Object obj);
    
}
