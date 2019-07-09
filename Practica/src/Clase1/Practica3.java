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
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A");
        
        int x = 10; 
        int y = 20;
        
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("B");
        
        x = x + y;
        y = y + x;
        
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("C");
        
        x = x - y;
        y = y - x;
        
        System.out.println(x);
        System.out.println(y);

        System.out.println("D");
        
        x = x * y;
        y = x * x;
        
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("E");
        
        x = y / x;
        y = x / y;
        
        System.out.println(x);
        System.out.println(y);
    }
    
}
