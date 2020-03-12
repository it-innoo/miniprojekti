package ohtu;

import ohtu.io.IO;
import ohtu.io.tehdas.Pyynto;
import ohtu.io.tehdas.Tehdas;

/**
 * Returns an Image object that can then be painted on the screen.
 *
 * @author jukka
 */
public class Vinkkikirjasto {

    private static String help() {
        String newLine = System.getProperty("line.separator");
        return new StringBuilder("Tervetuloa Vinkkikirjastoon")
                .append(newLine)
                .append(newLine)
                .append("For troubleshooting, visit https://help.gradle.org")
                .toString();
    }
    
    private final IO io;

    public Vinkkikirjasto(final IO io) {
        this.io = io;
    }

    /**
     * Fires the application textUI.
     *
     * @param args command line arguments
     */
    public void launch(final String... args) {
        boolean running = true;
        
        io.print(help());
        while (running) {
            String command = io.lueRivi(">");
            Pyynto pyynto = Tehdas
                    .getOperation(command)
                    .orElse(null);
            running = pyynto != null ? pyynto.vastaus(command) : true;
        }
    }

}
