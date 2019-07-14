
package JavaStandardLab3;


public class Vendedor extends Persona{
  
    int cantAutosVendidos;

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public Vendedor(int cantAutosVendidos, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.cantAutosVendidos = cantAutosVendidos;
    }
   @Override
    public String toString() {
        return  "nombre : " + nombre +  " apellido: " + apellido + " numeroDocumento: " + numeroDocumento + 
                " cantidad de autos vendidos: " + cantAutosVendidos;
    } 
}
