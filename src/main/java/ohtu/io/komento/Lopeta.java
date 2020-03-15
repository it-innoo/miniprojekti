
package ohtu.io.komento;

import ohtu.io.IO;

/**
 * Lopeta Vinkkikirjasto.
 * @author jukka
 */
public class Lopeta extends Komento {

    public Lopeta(IO io) {
        super(io);
    }

    @Override
    public void suorita() {
        io.print("Kiitos ja näkemiin");
        System.exit(0);
    }
    
}
