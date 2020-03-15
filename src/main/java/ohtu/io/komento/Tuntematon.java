
package ohtu.io.komento;

import ohtu.io.IO;

/**
 * Show help for unkown command.
 * @author jukka
 */
public class Tuntematon extends Komento {

    public Tuntematon(IO io) {
        super(io);
    }

    @Override
    public void suorita() {
        io.print("Tuntematon komento");
        StringBuilder sb = new StringBuilder("\n\n")
                .append("Käytettävissä olevat komennpt:\n")
                .append("apu            - Näyttää tämän helpin\n")
                .append("lopeta         - Lopeta\n")
                .append("\n\nLisätietoja: käy sivulla https://it-innoo.github.io/miniprojekti/\n");
        System.out.println(sb.toString());
    }
    
}
