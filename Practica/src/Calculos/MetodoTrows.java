
package Calculos;


public class MetodoTrows {


    public static void main(String[] args) {
    
        int a = 1;
        int b = 3;
        
        Metodo resta = new Metodo ();
       
         
        try{
             resta.restar(a,b);
             System.out.println("resta " + resta);
         }
        catch(Exception i){
            System.out.println("error " + i);
        }
        }
    
}

