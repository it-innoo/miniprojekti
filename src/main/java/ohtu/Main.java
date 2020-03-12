
package ohtu;

import ohtu.io.KonsoliIO;

/**
 * LinnkiVinkkiKirjasto
 * 
 * @author jukka
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Gradle!\n\n");
        new Vinkkikirjasto(new KonsoliIO()).launch(args);
    }
}
