package JavaStandard.Clase9;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<Integer>();

        l.add(101);
        l.add(10);
        l.add(200);
        l.add(50);

//        Integer cabeza = l.peek();
        //devuelve pero no elimina

//        System.out.println("cabeza= " + cabeza);
//
//        System.out.println(l);
//        System.out.println("------------------");
//
//        cabeza = l.poll();// eliminala cabeza
//
//        System.out.println(l);
//        System.out.println("------------------");

        for (Iterator i = l.iterator(); i.hasNext();) {
            System.out.println(l.peek());
            l.poll();
            System.out.println("borra cabeza continua"); 
        }
        System.out.println("fin");
    }
}
