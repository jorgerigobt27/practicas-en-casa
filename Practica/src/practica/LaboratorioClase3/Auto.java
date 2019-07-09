package practica.LaboratorioClase3;

public class Auto extends Vehiculo {

    String modelo;
    String marca;
    String color;

    public Auto(String modelo, String marca, String color, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    @Override
    public String toString() {
        return  "marca: " + marca + " modelo: " + modelo + " color: " + color + " largo: " + largo + 
                " ancho: " + ancho + " altura: " + alto;
    }
}
