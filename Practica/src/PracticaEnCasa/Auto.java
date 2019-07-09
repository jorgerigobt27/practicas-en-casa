package PracticaEnCasa;

public class Auto extends Transporte {

    private boolean modelo;
    private String color;

    public Auto(boolean modelo, String color, String nombre, int año, String marca) {
        super(nombre, año, marca);
        this.modelo = modelo;
        this.color = color;
    }

    public boolean getModelo() {
        return modelo;
    }

    public void setModelo(boolean modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
