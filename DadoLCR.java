
/**
 * Write a description of class DadoLCR here.
 *
 * @author (Cecilia Curlango Rosas)
 * @version (a version number or a date)
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