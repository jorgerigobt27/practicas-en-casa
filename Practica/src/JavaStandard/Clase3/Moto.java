
package JavaStandard.Clase3;

public class Moto extends Transporte {
    
    private String cilindradas;
    private String tamaño;

    public Moto(String cilindradas, String tamaño, String nombre, int año, String marca) {
        super(nombre, año, marca);
        this.cilindradas = cilindradas;
        this.tamaño = tamaño;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }


}
