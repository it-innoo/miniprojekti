
package ohtu.io.komento;

import ohtu.io.IO;

/**
 * Komennot for Vinkkikirjasto.
 * @author jukka
 */
public abstract class Komento {
    protected IO io;

    public Komento(IO io) {
        this.io = io;
    }

    public abstract void suorita();
}
