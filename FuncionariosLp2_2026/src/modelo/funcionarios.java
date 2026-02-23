
package modelo;


public class funcionarios extends Personas{
    private Integer sueldo;

    public funcionarios() {
    }

    public funcionarios(Integer sueldo, Integer id, String nombre, String apellido, Integer ci) {
        super(id, nombre, apellido, ci);
        this.sueldo = sueldo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "funcionarios{" + "sueldo=" + sueldo + '}';
    }
    
    
}
