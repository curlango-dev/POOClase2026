
/**
 * Write a description of class Jugador here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
 */
public class Jugador
{
    private int fichas;
    private String nombre;

    public Jugador(String nombre) {
        // mi nombre es el que recibo
        this.nombre = nombre;
        fichas = 3;
    }
    public String getNombre() {
        return nombre;
    }
    public void ganarFichas(int cuantas) {
        fichas += cuantas;
    }

    public void perderFichas(int cuantas) {
        if (fichas>0 && fichas >= cuantas) {
            fichas -= cuantas;
        }
    }
    
    public int getFichas() {
        return fichas;
    }
}