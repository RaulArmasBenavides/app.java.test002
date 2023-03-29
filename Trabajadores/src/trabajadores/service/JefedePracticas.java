package trabajadores.service;

/**
 *
 * @author Claudia Jazmin
 */
public class JefedePracticas extends Persona{
    protected String uni;

    public JefedePracticas(String uni, String nombre, String apellido, String sexo, int dni) {
        super(nombre, apellido, sexo, dni);
        this.uni = uni;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }
    public String MostrarInfo(){
        return "";
    }
}
