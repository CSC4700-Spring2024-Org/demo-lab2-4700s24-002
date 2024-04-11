import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    protected static final int DECIMAL_DIGITS = 2;

    public static void main(String[] args) {
        System.out.println("Hello Currency Converter 002");
        System.out.println("Add line from dev");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
        BigDecimal convertedAmount = originalAmount.multiply(conversionRate);
        return convertedAmount.setScale(DECIMAL_DIGITS, RoundingMode.HALF_UP);
    }

    public boolean isValidRate(BigDecimal conversionRate) {
        // TODO Auto-generated method stub
        // Tip: BigDecimal compareTo()
        return false;
    }

}
