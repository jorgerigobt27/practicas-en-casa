
package EjercicioBscador;


public class Buscador {
    
    String Cadena;
    int tipoBuscador;

    public Buscador(String Cadena, int tipoBuscador) {
        super();
        this.Cadena = Cadena;
        this.tipoBuscador = tipoBuscador;
        
    }
     public String Buscar(){
        return "la clase buscador como es abstracta no hace nada";
        
     }
     
     public Resultado buscar2(){
         return null;
         
     }

    @Override
    public String toString() {
        return "Buscador{" + "Cadena=" + Cadena + ", tipoBuscador=" + tipoBuscador + '}';
    }
    
}
