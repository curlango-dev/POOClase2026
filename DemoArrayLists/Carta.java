
/**
 * Write a description of class Carta here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
 */
public class Carta
{
    private int valor;
    private String palo;
    
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }
    
    public int getValor() {
        return valor;
    }
    
    public String getPalo() {
        return palo;
    }
    
    public String toString() {

        return "" + valor + " " + palo;
    }
    
}