///////////////
package JavaStandard.Clase5;


public class Calculadora {

    public static int sumar(int a, int b)throws ParametroException{
        int suma = a + b;
        if(a<0 || b <0){
            throw new ParametroException ( "Los argumentos no pueden ser menores a cero");
        } 
        if(a>1000 || b >1000){
            throw new ParametroException ( "Los argumentos no pueden ser mayores a mil");
        }
        return suma;
       
    }
    public static int restar(int a, int b)throws ParametroException{
        int resta = a - b;
    
    if(a<0 || b <0){
            throw new ParametroException ( "Los argumentos no pueden ser menores a cero");
        } 
        if(resta<0){
            throw new ParametroException ( "El resultado no puede ser negativo");
        }
        return resta;
    }
}
