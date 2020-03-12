
package ohtu.io;

import java.util.Scanner;

/**
 * TextIO.
 * 
 * @author jukka
 */
public final class KonsoliIO implements IO {
    private final Scanner lukija;

    public KonsoliIO() {
        lukija = new Scanner(System.in);
    }
    
    @Override
    public void print(final String str) {
        System.out.println(str);
    }

    @Override
    public int nextInt() {
        return Integer.parseInt(lukija.nextLine());
    }

    @Override
    public String lueRivi(String prompti) {
        System.out.print(prompti + " ");
        return lukija.nextLine();
    }
    
}
