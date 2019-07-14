
package JavaStandard.Clase3;

public abstract class Transporte {
    private String nombre; 
    private int año;
    private String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Transporte(String nombre, int año, String marca) {
        this.nombre = nombre;
        this.año = año;
        this.marca = marca;
    }

    
}
