import java.util.Map;


public class Monedas {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBaseCode() {
        return base_code;
    }

    public Double getConversionRate(String targetCode) {
        return conversion_rates.get(targetCode);
    }
}