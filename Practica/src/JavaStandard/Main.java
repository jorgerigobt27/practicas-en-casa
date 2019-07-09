/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStandard;

/**
 *
 * @author EDWGIOR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Persona p1 = new Persona("juan", "tucupey", new Domicilio("sabattini", 
                4745, "caseros"), 31);
        System.out.println("Persona Nombre: " + p1.nombre);
        System.out.println("Persona Apellido: " + p1.apellido);
        System.out.println("Domicilio Calle: " + p1.domicilio.calle);
        System.out.println("Domicilio numero: " + p1.domicilio.numero);
        System.out.println("Domicilio localidad: " + p1.domicilio.localidad);
        System.out.println("Persona edad: " + p1.edad);
        
        
    }
    
}
