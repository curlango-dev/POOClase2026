package uabc.curlango.demoxxx;
/**
 * Modela una ficha de dominó
 *
 * @author (Cecilia Margarita Curlango Rosas)
 * @version (Junio 2025)
 */
public class FichaBasica {
    protected int ladoA;
    protected int ladoB;
    protected boolean isFaceup = true;

    public FichaBasica(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    /**
     * Indica si una ficha tiene el mismo valor en
     * ambos lados.
     *
     * @return true si tiene el mismo valor
     */
    public boolean esMula() {
        return getLadoA() == getLadoB();
    }

    /**
     * Intercambia los valores de los lados de la ficha.
     * Gira la ficha 180 grados, internamente.
     */
    public void intercambiarLados() {
        int temp = getLadoA();
        setLadoA(getLadoB());
        setLadoB(temp);
    }

    /**
     * Getters y Setters
     */
    /**
     * Regresa el valor del lado A.
     * @return valor del lado A
     */
    public int getLadoA() {
        return ladoA;
    }

    /**
     * Regresa el valor del lado B.
     * @return valor del lado B
     */
    public int getLadoB() {
        return ladoB;
    }

    /**
     * Cambia el valor del lado A al valor recibido.
     * @param ladoA nuevo valor del lado A.
     */
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * Cambia el valor del lado B al valor recibido.
     * @param ladoB nuevo valor del lado B.
     */
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * Establece la visibilidad de los puntos. True si son
     * visibles, false si no.
     * @param faceup True si son
     *      visibles los puntos, false si no.
     */
    public void setFaceup(boolean faceup) {
        isFaceup = faceup;
    }

    /**
     * Regresa true si la ficha tiene los puntos hacia arriba.
     * @return true si los puntos son visible, false si no.
     */
    public boolean isFaceup() {
        return isFaceup;
    }
    /**
     * Regresa la suma de los puntos de la ficha.
     * @return suma de los puntos en la ficha.
     */
    public int getPuntos() {
        return ladoA + ladoB;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append(ladoA);
        sb.append("|");
        sb.append(ladoB);
        sb.append(']');
        return sb.toString();
    }

    /**
     * Regresa true si la ficha tiene el valor en alguno
     * de sus dos lados.
     * @param valor que se busca
     * @return true si el valor está en alguno de los lados
     * de la ficha, false si no.
     */
    public boolean tiene(int valor) {
        return getLadoA() == valor || getLadoB() == valor;
    }

}
