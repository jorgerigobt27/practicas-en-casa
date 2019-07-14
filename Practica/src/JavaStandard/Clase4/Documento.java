
package JavaStandard.Clase4;

public class Documento implements Imprimible {

    
    public Documento() {
    }

    @Override
    public void imprimir() {
        System.out.println("imprimir sin parametros");
    }

    @Override
    public void imprimir(String tamaño, String estilo) {
        
        System.out.println("tamaño: " + tamaño);
        System.out.println("estilo: " + estilo);
        
    }
    
}
