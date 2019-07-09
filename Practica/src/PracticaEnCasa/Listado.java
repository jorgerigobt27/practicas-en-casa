package PracticaEnCasa;

import PracticaDeParadigma.Cliente;
import static PracticaDeParadigma.Principal.imprimir;
import java.util.ArrayList;
import java.util.List;

public class Listado {

    public static void main(String[] args) {

        List<Auto> stockA = new ArrayList();
        Auto A1 = new Auto(true, "rojo", "polo", 2015, "VOLKSWAGEN");
        Auto A2 = new Auto(false, "gris", "fiesta", 2019, "FORD");
        stockA.add(A1);
        stockA.add(A2);

        for (Auto lista : stockA) {
            imprimirAuto(lista.getModelo(), lista.getColor(), lista.getNombre(), lista.getAño(), lista.getMarca());
        }

        List<Moto> stockM = new ArrayList();
        Moto M1 = new Moto("150cc", "medio", "Z2", 2017, "ZANELLA");
        Moto M2 = new Moto("110cc", "pequeño", "M110", 2018, "MOTOMEL");
        stockM.add(M1);
        stockM.add(M2);
        
        for (Moto lista : stockM) {
            imprimirMoto(lista.getCilindradas(), lista.getTamaño(), lista.getNombre(), lista.getAño(), lista.getMarca());
        }
    }

    public static void imprimirAuto(boolean modelo, String color, String nombre, int año, String marca) {

        if (modelo == true) {
            System.out.println("modelo: Full");
        } else {
            System.out.println("modelo: Basico");
        }
        System.out.println("color: " + color);
        System.out.println("nombre: " + nombre);
        System.out.println("año: " + año);
        System.out.println("marca: " + marca);
        System.out.println("---------------------------------");
    }

     public static void imprimirMoto(String cilindradas, String tamaño, String nombre, int año,String marca) {
        
        
        System.out.println("modelo: " + cilindradas);
        System.out.println("tamaño; " + tamaño);
        System.out.println("nombre: " + nombre);
        System.out.println("año: " + año);
        System.out.println("marca: " + marca);
        System.out.println("---------------------------------");
     }
}
