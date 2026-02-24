
/**
 * Modela una dado de Left-Center-Right.
 * Tiene las siguientes caras:
 * * -> 3 caras
 * L -> 1 cara
 * C -> 1 cara
 * R -> 1 cara
 *
 * @author (Cecilia Curlango Rosas)
 * @version (febrero 2026)
 */
public class DadoLCR 
{
    private Dado dado;

    public DadoLCR() {
        dado = new Dado();
    }

    public void lanzar() {
        dado.lanzar();
    }

    public String getValor() {
        String valor = "";
        switch (dado.getValor()) {
            case 1:
            case 2:
            case 3:
                valor = "*";
                break;
            case 4:
                valor = "L";
                break;
            case 5:
                valor = "C";
                break;
            case 6:
                valor = "R";
                break;
            default:
                valor = "**ERROR**";

        }
        return valor;
    }

    
    
    
}