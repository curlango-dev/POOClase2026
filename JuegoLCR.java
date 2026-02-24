
/**
 * Contiene todas las reglas del juego Left-Center-Right.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (febrero 2026)
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
        int cuantosDadosLanza = getCuantosDadosSeLanzan();
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

    private int getCuantosDadosSeLanzan() {
        int cuantosDadosLanza = jugadores[jugadorEnTurno].getFichas();
        if (cuantosDadosLanza > 3) {
            cuantosDadosLanza = 3;
        }
        return cuantosDadosLanza;

    }

    public void lanzarDados() {
        int cuantosDadosLanza = getCuantosDadosSeLanzan();

        for (int i=0;i<cuantosDadosLanza; i++) {
            dados[i].lanzar();
        }

    }

    public Jugador getGanador() {
        Jugador ganador = null;

        if (hayGanador()) {
            for (Jugador unJugador : jugadores) { // foreach
                if (unJugador.getFichas() > 0) {
                    ganador = unJugador;
                }
            }
        }

        return ganador;
    }

    public boolean hayGanador() {
        boolean respuesta = false;
        int jugadoresConFichas = 0;

        for (int i=0; i<jugadores.length; i++) { // se puede cambiar por foreach
            if (jugadores[i].getFichas() > 0) {
                jugadoresConFichas++;
            }
        }

        if (jugadoresConFichas==1) {
            respuesta = true;
        }
        return respuesta;
    }

    public void cambiarTurno() {
        jugadorEnTurno++;
        if (jugadorEnTurno == jugadores.length) {
            jugadorEnTurno = 0;
        }
    }

    public String getDados() {
        String caras = "";
        int cuantosDados = getCuantosDadosSeLanzan();
        for (int i=0; i<cuantosDados; i++) {
            caras = caras + dados[i].getValor() + " ";
        }

        return caras;
    }

    public Jugador getJugadorActual() {
        return jugadores[jugadorEnTurno];
    }
    
    public String getEstado() {
        String estado = "Estado Actual\n";
        for (int i=0; i<jugadores.length; i++) {
            Jugador temp = jugadores[i];
            estado = estado + temp.getNombre() + " fichas: " + temp.getFichas();
            estado = estado + "\n";
        }
        estado = estado + "Centro fichas: " + centro.getFichas() + "\n";
        return estado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}