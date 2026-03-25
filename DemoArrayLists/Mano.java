import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Clase Mano
 *
 * @author Cecilia M. Curlango Rosas
 * @version 03 2026
 */
public class Mano {
    private ArrayList<Carta> cartas;

    public Mano() {
        cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    /**
     * Escribe un método en Mano que indique si contiene una tercia.
     */
    public boolean tieneTercia() {
        boolean hayTercia = false;
        for (Carta carta : cartas) {
            int cuantas = 0;
            for (int i = 0; i < cartas.size(); i++) {
                if (carta.getValor() == cartas.get(i).getValor()) {
                    cuantas++;
                }
            }
            if (cuantas >= 3) {
                hayTercia = true;
            }
        }
        return hayTercia;
    }

    // Esta es otra versión para encontrar tercias
    // Sin usar "clases misteriosas
    public boolean tieneTerciaLambdaTest() {
        Map<Integer, Long> frequencyMap = cartas.stream()
                .map(carta -> carta.getValor())
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                Collectors.counting())
                );
//        frequencyMap.forEach((element, count) ->
//                System.out.println(element + ": " + count));

        return frequencyMap.values()
                .stream()
                .filter(v -> v >= 3)
                .count() >= 1;

    }

    public boolean tieneTerciaLambda() {
        // boolean hayTercia = false;
        ArrayList<Carta> cartasRepetidas = new ArrayList<>();
        cartasRepetidas = (ArrayList) cartas.stream()
                .map(carta -> carta.getValor())
                .filter(FilterUtils.noDistinct())
                .collect(Collectors.toList());
        return cartasRepetidas.size() > 3;

    }

    /**
     * Escribe un método en Mano que
     * regrese un ArrayList con todas
     * las cartas rojas que tiene.
     */
    public ArrayList<Carta> getCartasRojas() {
        ArrayList<Carta> cartasRoja = new ArrayList<>();
        for (Carta carta : cartas) {
            if (carta.esRoja()) {
                cartasRoja.add(carta);
            }
        }
        return cartasRoja;
    }

    public ArrayList<Carta> getCartasRojasLambda() {
        ArrayList<Carta> cartasRoja = new ArrayList<>();
        cartas.stream()
                .filter(carta -> carta.esRoja())
                .forEach(cartasRoja::add);
        return cartasRoja;
    }

    public ArrayList<Carta> getCartasRojasLambda2() {
        return (ArrayList<Carta>) cartas.stream()
                .filter(carta -> carta.esRoja())
                .collect(Collectors.toList());

    }

    /**
     * Escribe un método en Mano que
     * regrese un valor indicando cuántas
     * cartas tienen valor mayor que 5.
     */
    public int cuantasMayorA5() {
        int mayorA5 = 0;
        for (Carta carta : cartas) {
            if (carta.getValor() > 5) {
                mayorA5++;
            }
        }
        return mayorA5;
    }

    public int cuantasMenorA5Lambda() {
        return (int) cartas.stream()
                .filter(c -> c.getValor() > 5)
                .count();
    }


    /**
     * Escribe un método en Mano que indique si
     * ésta contiene cartas de un palo particular,
     * el cual recibe como parámetro.
     *
     * @return
     */
    public boolean tieneCartasDePalo(String palo) {
        boolean siTiene = false;

        for (Carta carta : cartas) {
            String paloDeCarta = carta.getPalo();
            if (palo.equals(paloDeCarta)) {
                siTiene = true;
            }
        }
        return siTiene;
    }

    public boolean tieneCartasDePaloLambda(String palo) {

        return (int) cartas.stream()
                .filter(carta -> carta.getPalo().equals(palo))
                .count() > 0;


    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Carta carta : cartas) {
            builder.append(carta + " ");
            //builder.append(" ");
        }
        return builder.toString();
    }
}
