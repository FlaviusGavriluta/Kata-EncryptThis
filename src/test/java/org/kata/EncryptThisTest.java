package org.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptThisTest {
    public class CalculatorTest {
        @Test
        public void testAddition() {
            Calculator calculator = new Calculator();
            int result = calculator.add(3, 5);
            assertEquals(8, result);
        }

        // More test cases can be added for other methods in the Calculator class
    }

}