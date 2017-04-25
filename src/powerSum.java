import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * Created by jarek on 4/24/17.
 */
public class powerSum {

    BigDecimal powerCalculate(double number, double power) {

        return BigDecimal.valueOf(Math.pow(number, power));

    }

    int powerSum(BigDecimal power) {

        String powerString = power.toString();
        powerString = powerString.replace('.','0');
        int sum = 0;
        for (int i = 0; i < powerString.length(); i++) {
            int digit = powerString.charAt(i) - '0';
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        powerSum ps = new powerSum();
        BigDecimal bc = ps.powerCalculate(2, 4);
        System.out.println(bc);
        System.out.println(ps.powerSum(bc));
    }
}
