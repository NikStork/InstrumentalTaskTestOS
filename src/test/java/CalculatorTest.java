import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void additional() {
        assertEquals(2, calculator.AddcalculationsOperations(1, 1));
    }

    @Test
    void difference() {
        assertEquals(1, calculator.DiffcalculationsOperations(2, 1));
    }

    @Test
    void multiplication() {
        assertEquals(25, calculator.MultcalculationsOperations(5, 5));
    }

    @Test
    void division() {
        assertEquals(2, calculator.DelcalculationsOperations(10, 5));
    }
}
