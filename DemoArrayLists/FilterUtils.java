import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

public class FilterUtils {

    /**
     * Retorna un Predicate que filtra elementos no distintos.
     *
     * @param <T> El tipo de elementos en el stream.
     * @return Un Predicate que devuelve true si el elemento ya fue visto.
     */
    public static <T> Predicate<T> noDistinct() {
        Set<T> seen = ConcurrentHashMap.newKeySet();
        return t -> !seen.add(t);
    }
}