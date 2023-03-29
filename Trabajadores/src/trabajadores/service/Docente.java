package trabajadores.service;

/**
 *
 * @author Claudia Jazmin
 */
public class Docente extends Persona {
    public String materia;

    public Docente(String materia, String nombre, String apellido, String sexo, int dni) {          
        super(nombre, apellido, sexo, dni);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String MostrarInfo(){
        return "";
    }



}
