import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<Long, Pessoa> mapa = new HashMap<>();
        Pessoa j = new Pessoa(1L, "jj");

        mapa.put(1L, j);

        Pessoa j2 = mapa.get(1L);

    }
}
