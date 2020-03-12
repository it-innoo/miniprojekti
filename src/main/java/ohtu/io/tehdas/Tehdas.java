
package ohtu.io.tehdas;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * qwerty.
 * @author jukka
 */
public class Tehdas {
    static Map<String, Pyynto> operationMap = new HashMap<>();

    static {
        operationMap.put("q", new Lopeta());
        // more operators
    }

    public static Optional<Pyynto> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
