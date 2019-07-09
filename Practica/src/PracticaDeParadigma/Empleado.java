package PracticaDeParadigma;

public class Empleado extends Persona{
    private int nroLegajo;

    public Empleado(int nroLegajo, String nombre, String apellido, String documento, int edad) {
        super(nombre, apellido, documento, edad);
        this.nroLegajo = nroLegajo;
        
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    
    
}
