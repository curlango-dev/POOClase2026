
/**
 * Modela el centro del juego Left-Center-Right.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (febrero 2026)
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