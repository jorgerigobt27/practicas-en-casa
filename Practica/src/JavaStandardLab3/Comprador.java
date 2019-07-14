
package JavaStandardLab3;

public class Comprador extends Persona {
    
    double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Comprador(double presupuesto, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.presupuesto = presupuesto;
    }
 @Override
    public String toString() {
        return  "nombre : " + nombre +  " apellido: " + apellido + " numeroDocumento: " + numeroDocumento + 
                " presupuesto: " + presupuesto;
    }
}
