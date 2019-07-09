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
public class EjercicioPrimeraClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int totalPositivos = 0;
        int totalNegativos = 0;
        
        int [] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
        
        for (int i = 0; i<vecNumeros.length; i++){
            
            if (vecNumeros[i] >=0){
            
                totalPositivos += vecNumeros[i];
                
            }else{
            
                totalNegativos += vecNumeros[i];
            }
            
        }
        System.out.println("TOTAL POSITIVOS: " + totalPositivos);
        System.out.println("TOTAL NEGATIVOS: " + totalNegativos);
    }
    
}
