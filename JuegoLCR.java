
/**
 * Write a description of class JuegoLCR here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
 */
public class JuegoLCR
{
    private DadoLCR[] dados;// = new DadoLCR[3];
    private Jugador[] jugadores;
    private int jugadoresActuales = 0;
    private Centro centro;
    private int jugadorEnTurno = 0;

    public JuegoLCR(int numeroDeJugadores) {
        dados = new DadoLCR[3];

        for (int i=0; i<dados.length; i++) {
            dados[i] = new DadoLCR();
        }

        jugadores = new Jugador[numeroDeJugadores];
        centro = new Centro();
    }

    public void agregarJugador(String nombre) {
        if (jugadoresActuales < jugadores.length) {
            jugadores[jugadoresActuales] = new Jugador(nombre);
            jugadoresActuales++;
        }

    }

    public void establecerPrimerJugador() {
        if (jugadoresActuales == jugadores.length) {
            jugadorEnTurno = 0;
        }
    }

    public Jugador getJugadorIzquierda() {
        // if ()  operador ternario
        // then ?
        // else :
        int numero = (jugadorEnTurno == 0) ? jugadores.length-1 : jugadorEnTurno-1;
        return jugadores[numero];
    }
    public Jugador getJugadorDerecha() {
        // if ()  operador ternario
        // then ?
        // else :
        int numero = (jugadorEnTurno == jugadores.length-1) ? 0 : jugadorEnTurno+1;
        return jugadores[numero];
    }
    public void procesarDados() {
        int cuantosDadosLanza = jugadores[jugadorEnTurno].getFichas();
        if (cuantosDadosLanza > 3) {
            cuantosDadosLanza = 3;
        }
        Jugador izquierda = getJugadorIzquierda();
        Jugador derecha = getJugadorDerecha();
        
        for (int i=0;i<cuantosDadosLanza; i++) {
            switch (dados[i].getValor()) {
                case "L":
                    //  entregar una ficha al de la izquierda
                    jugadores[jugadorEnTurno].perderFichas(1);
                    izquierda.ganarFichas(1);
                    break;
                case "C":
                    // entregar ficha al centro
                    jugadores[jugadorEnTurno].perderFichas(1);
                    centro.ganarFichas(1);
                    break;
                case "R":
                    // entregar ficha al de la derecha
                    jugadores[jugadorEnTurno].perderFichas(1);
                    derecha.ganarFichas(1);
                    break;
            }
        }
    }

    public void lanzarDados() {

        int cuantosDadosLanza = jugadores[jugadorEnTurno].getFichas();
        if (cuantosDadosLanza > 3) {
            cuantosDadosLanza = 3;
        }

        for (int i=0;i<cuantosDadosLanza; i++) {
            dados[i].lanzar();
        }

    }

    
    
}