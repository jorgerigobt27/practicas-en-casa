package Calculos;

import Exception.MyException;

public class Metodo {

    public int restar(int a, int b) throws MyException, Exception {

        int resta = a - b;
        if (resta < 0) {
            throw new MyException (a , "la resta no se pudo efectuar ", b);
        }
        return resta;
    }
    //ojo falta el get para sobre escribir
}
