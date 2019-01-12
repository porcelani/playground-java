package algorithm1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Algorithm1Test {

    @Test
    public void shouldReturnSmallElement() {
        Algorithm1 algorithm1 = new Algorithm1(1, 2);
        int c = algorithm1.calculaC();

        assertEquals(12, c);
    }


    @Test
    public void shouldReturnMediumElement() {
        Algorithm1 algorithm1 = new Algorithm1(11, 222);
        int c = algorithm1.calculaC();

        assertEquals(12122, c);
    }

    @Test
    public void shouldReturnBigElement() {
        Algorithm1 algorithm1 = new Algorithm1(0, 1000000);
        int c = algorithm1.calculaC();

        assertEquals(1000000, c);
    }

    @Test
    public void shouldReturnBiggestElement() {
        Algorithm1 algorithm1 = new Algorithm1(1111, 2222);
        int c = algorithm1.calculaC();

        assertEquals(-1, c);
    }
}
