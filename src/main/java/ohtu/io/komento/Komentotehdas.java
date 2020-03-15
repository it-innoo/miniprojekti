
package ohtu.io.komento;

import java.util.HashMap;
import java.util.Map;
import ohtu.io.IO;

/**
 * Create komennot for Vinkkkirjasto.
 * @author jukka
 */
public class Komentotehdas {
    private final Map<String, Komento> komennot;
    private Komento tuntematon;

    /**
     * Konstuktori.
     * @param io IO
     */
    public Komentotehdas(IO io) {
        komennot = new HashMap<>();

        komennot.put("apu", new Apua(io));
        komennot.put("lopeta", new Lopeta(io));
        tuntematon = new Tuntematon(io);
    }

    public Komento hae(String operaatio) {
        return komennot.getOrDefault(operaatio, tuntematon);
    }
}
