
package trabajadores.service;

import java.text.DecimalFormat;

/**
 *
 * @author Claudia Jazmin
 */
public class Sueldo extends Persona {
    protected int Categoria, Grado, hora;

    public Sueldo(int Categoria, int Grado, int hora, String nombre, String apellido, String sexo, int dni) {
        super(nombre, apellido, sexo, dni);
        this.Categoria = Categoria;
        this.Grado = Grado;
        this.hora = hora;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    

    
    
    public  double PagoHoraJP(){
        double pago=0;
        switch(getCategoria()){
            case 0:
                if(getGrado()==0)
                    pago=18;
                else if(getGrado()==1)
                    pago= 20;
                break;
                case 1:
                 if(getGrado()==0)
                    pago= 16;
                else if(getGrado()==1)
                    pago=18;
                break;
                  case 2:
                 if(getGrado()==0)
                    pago=12;
                else if(getGrado()==1)
                    pago=13;
                break;
               
        }
        return pago;
    }
    
    public double SueldoJP(){
        return PagoHoraJP()*getHora();
    }
    
    public  double PagoHoraDocente(){
        if(getCategoria()==0)
            return 25;
        else if(getCategoria()==1)
            return 18;
        else if(getCategoria()==2)
            return 15;
        return 0;
    }
    public double SueldoDocente(){
        return PagoHoraDocente()*getHora();
    }
    public String MostrarInfo(){
        return " ";
    }
    
    public String MostrarInfoJP(){
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nPago por Hora \t\t: "+df.format(PagoHoraJP());
    }
    
    public String MostrarInfoDocente(){
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nPago por Hora \t\t: "+df.format(PagoHoraDocente());
    }

    
}
