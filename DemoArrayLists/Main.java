import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.mezclar();
        Mano mano = new Mano();

        for (int i = 0; i < 5; i++) {
            Carta carta = baraja.getCartaAleatoria();
            mano.agregarCarta(carta);
        }
        mano.agregarCarta(new Carta(3,"x"));
        mano.agregarCarta(new Carta(3,"x"));
        mano.agregarCarta(new Carta(3,"x"));
        System.out.println(mano);
        if (mano.tieneTercia()) {
            System.out.println("si hay");
        } else {
            System.out.println("No hay");
        }

        ArrayList<Carta> lasRojas = mano.getCartasRojasLambda2();
        System.out.println(lasRojas);

//        boolean siTiene = mano.tieneCartasDePaloLambda("corazón");
//        if (siTiene) {
//            System.out.println("Si tiene cartas con corazón.");
//        } else {
//            System.out.println("No tiene cartas con corazón.");
//        }
    }
}