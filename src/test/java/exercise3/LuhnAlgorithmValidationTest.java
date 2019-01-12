package exercise3;

import org.junit.Before;
import org.junit.Test;

import static exercise3.LuhnAlgorithmValidation.isValid;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LuhnAlgorithmValidationTest {


    @Before
    public void setUp() {

    }

    @Test
    public void shouldValidateLuhnAlgorithm() {
        assertTrue(isValid("4408041234567893"));

        assertFalse(isValid("4417123456789112"));

        assertFalse(isValid("9111111111111111"));
    }

}