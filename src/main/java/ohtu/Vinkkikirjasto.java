package ohtu;

import ohtu.io.IO;
import ohtu.io.komento.Komentotehdas;
import ohtu.io.tehdas.Pyynto;
import ohtu.io.tehdas.Tehdas;

/**
 * Returns an Image object that can then be painted on the screen.
 *
 * @author jukka
 */
public class Vinkkikirjasto {

    private final IO io;
    private Komentotehdas komennot;

    public Vinkkikirjasto(final IO io) {
        this.io = io;
        komennot = new Komentotehdas(io);
    }

    /**
     * Fires the application textUI.
     *
     * @param args command line arguments
     */
    public void launch(final String... args) {
        while (true) {
            io.print("komento: ");
            String komento = io.lueRivi("> ");
            komennot.hae(komento).suorita();
        }
    }

}
