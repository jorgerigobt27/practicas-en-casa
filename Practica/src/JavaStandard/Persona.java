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
public class Persona {
    
    String nombre;
    String apellido;
    Domicilio domicilio;
    int edad;

    public Persona(String nombre, String apellido, Domicilio domicilio, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
    }
  
    
    
}
