
package modelo;


public abstract class Personas {
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected Integer ci;

    public Personas() {
    }

    public Personas(Integer id, String nombre, String apellido, Integer ci) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + '}';
    }
    
    
}
