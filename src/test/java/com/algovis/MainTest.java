
package com.algovis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void shouldAddTwoNumbers() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    void shouldCompareNumbers() {
        int a = 10;
        int b = 5;
        assertTrue(a > b);
    }
}
