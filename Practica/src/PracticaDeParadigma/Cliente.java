
package PracticaDeParadigma;

public class Cliente extends Persona {
    
    private int nroCliente;
    private boolean credito;

    public Cliente(int nroCliente, boolean credito, String nombre, String apellido, String documento, int edad) {
        super(nombre, apellido, documento, edad);
        this.nroCliente = nroCliente;
        this.credito = credito;
    }

        
    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public boolean getCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    
  
}
