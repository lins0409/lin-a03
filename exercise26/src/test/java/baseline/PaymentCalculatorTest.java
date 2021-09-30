package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOffTest() {
        double balance = 5000;
        double APR = 12;
        APR = APR/100;
        double payment = 100;
        double expected = 70;

        PaymentCalculator payCal = new PaymentCalculator(balance, APR, payment);
        double actual = payCal.calculateMonthsUntilPaidOff();

        assertEquals(expected, actual);
    }
}