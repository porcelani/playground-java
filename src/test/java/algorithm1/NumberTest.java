package algorithm1;

import org.junit.Test;

import static algorithm1.Number.EMPTY;
import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void shouldGetNextChar() {
        Number number = new Number(123);

        assertEquals("1", number.getNextCaracter());
        assertEquals("2", number.getNextCaracter());
        assertEquals("3", number.getNextCaracter());
        assertEquals(EMPTY, number.getNextCaracter());
    }

    @Test
    public void shouldIsEmpty() {
        Number number = new Number(12);

        assertFalse(number.isEmpty());

        number.getNextCaracter();

        assertFalse(number.isEmpty());

        number.getNextCaracter();

        assertTrue(number.isEmpty());
    }

    @Test
    public void shouldIsEmptyWithZero() {
        Number number = new Number(0);

        assertTrue(number.isEmpty());

        assertEquals(EMPTY, number.getNextCaracter());

        assertTrue(number.isEmpty());
    }
}