import java.util.Scanner;

/**
 * Write a description of class UITexto here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
 */
public class UITexto
{
    public void main() {
        
        int numJugadores = getJugadores();
        JuegoLCR juego = new JuegoLCR(numJugadores);

        for (int i=0; i<numJugadores; i++) {
            String nombre = getNombre();
            juego.agregarJugador(nombre);
        }
        juego.establecerPrimerJugador();
        while ( !juego.hayGanador()) {
            // mostrar el jugador actual
            Jugador actual = juego.getJugadorActual();
            System.out.println("Jugador: " + actual.getNombre() +
            " fichas: " + actual.getFichas());
            // lanzar dados
            juego.lanzarDados();
            // mostrar dados
            System.out.println("Dados: " + juego.getDados());
            // procesar dados
            juego.procesarDados();
        
            System.out.println(juego.getEstado());
            // cambiar turno
            juego.cambiarTurno();
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter para continuar");
            scn.nextLine();
        }
        Jugador ganador = juego.getGanador();
        System.out.println("Ganó el jugador " + ganador.getNombre());
    }
    
    private String getNombre() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe el nombre del jugador:");
        return scn.nextLine();
    }
    private int getJugadores() {
        int num = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("¿Cuántos jugadores?");
        num = scn.nextInt();
        if (num < 3) {
            num = 3;
        }
        return num;
    }
}