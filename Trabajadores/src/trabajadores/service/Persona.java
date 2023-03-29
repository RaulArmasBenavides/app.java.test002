package trabajadores.service;


/**
 *
 * @author Claudia Jazmin
 */
public abstract class Persona {
    protected String nombre, apellido, sexo;
    protected int dni;

    public Persona(String nombre, String apellido, String sexo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dni = dni;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public abstract String MostrarInfo();
    
    
}
