
package ohtu.io;

/**
 * TextIO.
 * 
 * @author jukka
 */
public final class KonsoliIO implements IO {

    @Override
    public void print(final String s) {
        System.out.println(s);
    }

    @Override
    public int nextInt() {
        return 0;
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
