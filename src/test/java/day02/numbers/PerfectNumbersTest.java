package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    @Test
    void isPerfectNumber() {

        PerfectNumbers pn = new PerfectNumbers();

        assertTrue(pn.isPerfectNumber(6));
        assertTrue(pn.isPerfectNumber(8128));
        assertFalse(pn.isPerfectNumber(7246));
        assertFalse(pn.isPerfectNumber(9));


    }

}