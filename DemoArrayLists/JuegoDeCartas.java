import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class JuegoDeCartas here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
 */
public class JuegoDeCartas
{
    private Baraja baraja;
    
    public JuegoDeCartas() {
        baraja = new Baraja();
    }
    
    public void elMain() {
        Scanner scn = new Scanner(System.in);
        String palo;
        int valor;
        Carta carta = baraja.getCartaAleatoria();
        System.out.println(carta);
        System.out.println("¿Cuál es el palo de mi carta?");
        palo = scn.nextLine();
        System.out.println("¿Cuál es el valor de la carta?");
        valor = scn.nextInt();
        
        if (valor == carta.getValor() 
        && palo.equalsIgnoreCase(carta.getPalo())) {
            System.out.print("Felicidades, adivinaste");
            System.out.println(carta);
        } else {
            System.out.println("Loser, la carta es: " + carta);
        }
    }
    
    public void mostrarBaraja() {
        // System.out.println(baraja);
        ArrayList<Carta> elMazo = baraja.getMazo();
        // for (int i=0; i<elMazo.size(); i++) {
            // Carta carta = elMazo.get(i);
            // System.out.println(carta);
        // }
        for (Carta carta : elMazo) {
            System.out.println(carta);
        }
    }
    
    
}