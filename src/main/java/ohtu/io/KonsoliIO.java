
package ohtu.io;

/**
 * TextIO.
 * 
 * @author jukka
 */
public final class KonsoliIO implements IO {

    @Override
    public void print(final String str) {
        System.out.println(str);
    }

    @Override
    public int nextInt() {
        return 0;
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
