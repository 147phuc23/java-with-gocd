package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add2Int() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void add2Int_2() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(1, 3));
    }

    @Test
    void add2Int_3() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(1, 3));
    }
}