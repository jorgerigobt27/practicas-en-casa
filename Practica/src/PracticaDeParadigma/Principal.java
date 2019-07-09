package PracticaDeParadigma;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List <Cliente> clientes = new ArrayList();
        Cliente c1 = new Cliente(23645, false, "maria", "magdalena", "95571259", 30);
        Cliente c2 = new Cliente(24564, true, "juan", "perez", "974521259", 23);
        Cliente c3 = new Cliente(21635, false, "pedro", "david", "943712369", 36);
        clientes.add(c1); 
        clientes.add(c2);
        clientes.add(c3);
        for (Cliente lista: clientes){
        imprimir(lista.getNroCliente(), lista.getCredito(), lista.getNombre(), lista.getApellido(), lista.getDocumento(), lista.getEdad());
        }
        
        //imprimir(c1.getNroCliente(), c1.getCredito(), c1.getNombre(), c1.getApellido(), c1.getDocumento(), c1.getEdad());
    }

    public static void imprimir(int nroCliente, boolean credito, String nombre, String apellido, String documento, int edad) {
        
        System.out.println("cliente nro: " + nroCliente);
        //mejoras if
        if(credito == true){
        System.out.println("credito: Si posee");
        }else{
        System.out.println("credito: No posee");
        }
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("documento: " + documento);
        System.out.println("edad: " + edad);
        System.out.println("---------------------------------");
    }

}
