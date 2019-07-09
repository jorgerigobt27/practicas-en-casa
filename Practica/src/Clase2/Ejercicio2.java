/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

/**
 *
 * @author EDWGIOR
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10, b = -2, c = 5;

        if (a > 0 & b > 0) {
            System.out.println("a*b= " + a * b);
        }
        if (a > 0 & c > 0) {
            System.out.println("a*c= " + a * c);
        } else if (a > 0 & b > 0 & c > 0) {
            System.out.println("a*b= " + a * b);
        }
    }

}
