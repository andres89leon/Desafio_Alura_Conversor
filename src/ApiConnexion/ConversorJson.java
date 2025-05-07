package ApiConnexion;

import java.util.Map;

public record ConversorJson(String base_code, Map<String,Double> conversion_rates) {

}
