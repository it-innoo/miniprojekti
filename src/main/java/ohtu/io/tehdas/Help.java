
package ohtu.io.tehdas;

/**
 * Help text for application.
 * @author jukka
 */
public class Help implements Pyynto {

    private static String help() {
        String newLine = System.getProperty("line.separator");
        return new StringBuilder("Tervetuloa Vinkkikirjastoon")
                .append(newLine)
                .append(newLine)
                .append("Vianetsintää varten, käy sivulla https://it-innoo.github.io/miniprojekti/")
                .append(newLine)
                .append("h\t - Näyttää rämän helpin")
                .append(newLine)
                .append("q\t - Lopeta")
                .append(newLine)
                .toString();
    }
    
    @Override
    public boolean vastaus(String p) {
        System.out.println(help());
        return true;
    }
    
}
