package uabc.curlango.demoxxx;

/**
 * Modela una ficha de dominó. Contiene un String
 * que es un emoji de la ficha.
 * @author Cecilia M. Curlango Rosas
 * @version marzo 2026
 */
public class FichaEmoji  {
    private FichaBasica fichaBasica;
    private static final int EMOJI_HORIZONTAL = 0x1F031;
    private static final int EMOJI_VERTICAL = 0x1F071;
    protected String emoji;

    public FichaEmoji(int ladoA, int ladoB) {
        fichaBasica = new FichaBasica(ladoA, ladoB);
        int dominoValue = EMOJI_HORIZONTAL + (ladoA * 7) + ladoB;
        emoji = new String(Character.toChars(dominoValue));
    }

    /**
     * Regesa el emoji que corresponde a la ficha y su estado.
     * @return String con emoji de la ficha.
     */
    public String getEmoji() {
        return emoji;
    }

    /**
     * Intercambia los lados de la ficha y actualiza
     * el emoji para que refleje este nuevo estado.
     */

    public void intercambiarLados() {
        fichaBasica.intercambiarLados();
        // Cambia el emoji de la ficha
        int dominoValue = EMOJI_HORIZONTAL
                + (fichaBasica.getLadoA() * 7)
                + fichaBasica.getLadoB();
        emoji = new String(Character.toChars(dominoValue));
    }
}
