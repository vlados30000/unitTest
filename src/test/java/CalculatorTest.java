package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    Calculator calc;


    @BeforeEach
    void setCalculator() {
        calc = new Calculator();
    }


    @Test
    void plus() {
        // given:
        final int x = 10;
        final int y = 5;
        final int expented = 15;
        // when:
        final int result = calc.plus.apply(x, y);
        // then:
        Assertions.assertEquals(expented, result);

    }


    @Test
    void minus() {
        // given:
        final int x = 10;
        final int y = 5;
        final int expented = 5;
        // when:
        final int result = calc.minus.apply(x, y);
        // then:
        Assertions.assertEquals(expented, result);
    }

    @Test
    void devide() {
        // given:
        final int x = 10;
        final int y = 5;
        final int expented = 2;
        // when:
        final int result = calc.devide.apply(x, y);
        // then:
        Assertions.assertEquals(expented, result);
    }

    @Test
    void multiply() {
        // given:
        final int x = 10;
        final int y = 5;
        final int expented = 50;
        // when:
        final int result = calc.multiply.apply(x, y);
        // then:
        Assertions.assertEquals(expented, result);
    }

}