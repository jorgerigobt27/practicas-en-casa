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
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A");
        int x = 5;
        int y = 10;
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("B");
        
        x += y;
        y += x;
        
        System.out.println(x);
        System.out.println(y);      
        
        System.out.println("C");
        
        x -= y;
        y -= x;
        
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("D");
        
        x *= y; 
        y *= x;
        
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("E");
        
        x /= y;
        y /= y;
        
        System.out.println(x);
        System.out.println(y);
    }
    
}
