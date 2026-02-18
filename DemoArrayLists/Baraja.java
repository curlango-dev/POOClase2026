import java.util.*;

/**
 * Write a description of class Baraja here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
 */
public class Baraja
{
    private ArrayList<Carta> mazo;

    public Baraja() {
        mazo = new ArrayList();
        llenar();
        // mezclar();
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void mezclar() {
        Random rnd = new Random();
        Carta carta;
        for (int i=0; i<mazo.size(); i++) {
            int j = rnd.nextInt(mazo.size());
            // intercambiar(i,j);
            carta = mazo.get(i);
           // Carta temp = carta;
            mazo.set(i, mazo.get(j));
            mazo.set(j,carta);
        }

    }

    private void intercambiar(int pos1, int pos2) {
        Carta carta = mazo.get(pos1);
        Carta temp = carta;
        mazo.set(pos1, mazo.get(pos2));
        mazo.set(pos2,temp);
    }

    public Carta getCartaAleatoria() {
        Random rnd = new Random();
        return mazo.get(rnd.nextInt(mazo.size()));
    }
    /** Tarea */
    // public Carta sacarCarta() 
    // public int getCantidadDeCartas()
    // public void reset()
    // public Baraja(int numeroDeMazos)
    // public String toString()
    // public void remover(int valorDeCartas)
    // public void remover(String paloDeCartas)
    public void llenar() {
        for (int i=1; i<=13; i++) {
            Carta cartaNueva = new Carta(i,"trébol");
            mazo.add(cartaNueva);

            mazo.add(new Carta(i,"corazón"));
            mazo.add(new Carta(i,"diamante"));
            mazo.add(new Carta(i,"pica"));
        }
    }

    public void esteMetodoSeBorra() {
    for (int i=0; i<mazo.size(); i++) {
    Carta carta = mazo.get(i);
    System.out.println(carta);
    }
    }

    
    
    
    
    
}