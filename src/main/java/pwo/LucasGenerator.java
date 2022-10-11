package pwo;

import java.math.BigDecimal;

public class LucasGenerator {
    
    public BigDecimal lucas(int n) {
        BigDecimal a = new BigDecimal(2);
        BigDecimal b = new BigDecimal(1);
        BigDecimal c = new BigDecimal(0);

        for(int i = 1; i<= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
}
