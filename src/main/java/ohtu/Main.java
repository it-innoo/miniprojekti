
package ohtu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ohtu.io.KonsoliIO;

/**
 * LinkkiVinkkiKirjasto.
 * 
 * @author jukka
 */
public class Main {

    /**
     * Main access point.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        try {
            Connection db = DriverManager.getConnection("jdbc:sqlite:testi.db");
            new Vinkkikirjasto(new KonsoliIO()).launch(args);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
