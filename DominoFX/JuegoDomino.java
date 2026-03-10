package uabc.curlango.demodominoxxx;

import java.util.ArrayList;

/**
 * Clase JuegoDomino
 *
 * @author Cecilia M. Curlango Rosas
 * @version 03 2026
 */
public class JuegoDomino {
   private Cementerio fichas;

   public JuegoDomino() {
       fichas = new Cementerio();
   }

   public Ficha getFicha() {
       ArrayList <Ficha> f = fichas.entregarFichas(1);
       return f.get(0);
   }
}
