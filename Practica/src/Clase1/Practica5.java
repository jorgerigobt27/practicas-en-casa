/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1;

/**
 *
 * @author EDWGIOR
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x= 5;
        int y= 10;
        int suma= 0;
        int resta= 0;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(suma);
        System.out.println(resta);
        
        System.out.println("B");
        
        suma= x + y;
        resta= x - y; 
        
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        
        System.out.println("C");
        
        suma = x + x;
        resta = y - y;
        
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        
        System.out.println("D");
        
        suma = x + y + x;
        resta = x - x - 20;
        
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
    }
    
    
}
