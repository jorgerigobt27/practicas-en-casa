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
public class ExplicacionEdward {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       if (mayorDeEdad(15)){
       System.out.println("Es mayor de Edad");
       }
       else{
       System.out.println("Es menor de Edad"); 
       }
    }
    
    public static boolean mayorDeEdad (int edad){
        
        boolean mayor;
        
        if (edad >= 18){
        
            mayor = true;
            //System.out.println("Es mayor de Edad");
            
        } else {
            
            mayor = false;
            //System.out.println("Es menor de Edad");
        }
        
        return mayor;
    }
    
}
