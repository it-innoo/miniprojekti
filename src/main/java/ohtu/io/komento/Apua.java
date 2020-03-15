
package ohtu.io.komento;

import ohtu.io.IO;

/**
 * Jelp text for Vinkkikirjasto.
 * @author jukka
 */
public class Apua extends Komento {

    public Apua(IO io) {
        super(io);
    }

    @Override
    public void suorita() {
        io.print("Tervetuloa Vinkkikirjastoon v1.0");
        StringBuilder sb = new StringBuilder("\n\n")
                .append("apu            - Näyttää tämän helpin\n")
                .append("lopeta         - Lopeta\n");
        System.out.println(sb.toString());
    }
    
}
