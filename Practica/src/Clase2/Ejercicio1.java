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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nro1 = 100, nro2 = 500, nro3 = 250;

        if (nro1 > nro2 & nro1 > nro3) {
            System.out.println("El nro1 es el mayor : " + nro1);
        }
        if (nro2 > nro1 & nro2 > nro3) {
            System.out.println("El nro2 es el mayor: " + nro2);
        } else if (nro3 > nro1 & nro3 > nro2) {
            System.out.println("El nro3 es el mayor: " + nro3);
        }
    }

}
