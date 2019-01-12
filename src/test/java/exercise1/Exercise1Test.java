package exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void shouldReturnSmallElement() {
        Exercise1 exercise1 = new Exercise1(1, 2);
        int c = exercise1.calculaC();

        assertEquals(12, c);
    }


    @Test
    public void shouldReturnMediumElement() {
        Exercise1 exercise1 = new Exercise1(11, 222);
        int c = exercise1.calculaC();

        assertEquals(12122, c);
    }

    @Test
    public void shouldReturnBigElement() {
        Exercise1 exercise1 = new Exercise1(0, 1000000);
        int c = exercise1.calculaC();

        assertEquals(1000000, c);
    }

    @Test
    public void shouldReturnBiggestElement() {
        Exercise1 exercise1 = new Exercise1(1111, 2222);
        int c = exercise1.calculaC();

        assertEquals(-1, c);
    }
}
