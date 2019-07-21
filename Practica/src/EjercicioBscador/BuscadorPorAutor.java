
package EjercicioBscador;


public class BuscadorPorAutor extends Buscador{

    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }

    public int getTipoBuscador() {
        return tipoBuscador;
    }

    public void setTipoBuscador(int tipoBuscador) {
        this.tipoBuscador = tipoBuscador;
    }

    public BuscadorPorAutor(String Cadena, int tipoBuscador) {
        super(Cadena, tipoBuscador);
    }
    
}
