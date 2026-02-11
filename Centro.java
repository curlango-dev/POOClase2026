
/**
 * Write a description of class Centro here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
 */
public class Centro
{
    private int fichas;
    
    public void ganarFichas(int cuantas) {
        fichas += cuantas;
    }
    public int entregarTodasLasFichas() {
        int cuantas = fichas;
        fichas = 0;
        return cuantas;
    }
    public int getFichas() {
        return fichas;
    }
}