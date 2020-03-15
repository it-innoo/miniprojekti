package ohtu.domain;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Kirja vinkki.
 *
 * @author jukka
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Kirja extends AbstractPersistable<Long> {

    private String tyyppi;
    private String kirjoittaja;
    private String otsikko;

    /**
     * String representation of Kirja.
     * @return 
     */
    public String toString() {
        String newline = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder()
                .append("Kirjoittaja: ")
                .append(kirjoittaja)
                .append(newline)
                .append("Otsikko: ")
                .append(otsikko)
                .append(newline)
                .append("Tyyppi: ")
                .append(tyyppi);

        return sb.toString();
    }
}
