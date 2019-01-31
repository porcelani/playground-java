package exercise3.flags;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiscoverTest {
    @Before
    public void setUp() {

    }

    @Test
    public void shouldVerifyStartNumber() {
        Flag creditCardFlagValid = new Discover("6011111111111117");

        assertTrue(creditCardFlagValid.startNumberIsValid());

        Flag creditCardFlagInvalid = new Discover("2011111111111117");

        assertFalse(creditCardFlagInvalid.startNumberIsValid());
    }

    @Test
    public void shouldVerifyLength() {
        Flag creditCardFlagValid = new Discover("6011111111111117");

        assertTrue(creditCardFlagValid.lengthIsValid());

        Flag creditCardFlagInvalid = new Discover("011111111111117");

        assertFalse(creditCardFlagInvalid.lengthIsValid());
    }
}