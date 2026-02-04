package com.uvg.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

    private CalcImpl calc;

    @BeforeEach
    void setUp() {
        Stack<Integer> pila = new StackArrayList<>();
        calc = new CalcImpl(pila);
    }

    @Test
    void testSuma() {
        int result = calc.operate("2 3 +");
        assertEquals(5, result);
    }

    @Test
    void testResta() {
        int result = calc.operate("5 2 -");
        assertEquals(3, result);
    }

    @Test
    void testMultip() {
        int result = calc.operate("4 3 *");
        assertEquals(12, result);
    }

    @Test
    void testDivision() {
        int result = calc.operate("10 2 /");
        assertEquals(5, result);
    }

    @Test
    void testMultiple() {
        
        int result = calc.operate("5 1 2 + 4 * + 3 -");
        assertEquals(14, result);
    }

    @Test
    void testUni() {
        int result = calc.operate("42");
        assertEquals(42, result);
    }

    @Test
    void testDivCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.operate("10 0 /");
        });
        assertTrue(exception.getMessage().contains("/ by zero"));
    }

    @Test
    void testEmpty() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            calc.operate("");
        });
        assertTrue(exception.getMessage().contains("vacio") || exception.getMessage().contains("Stack"));
    }
}

