package exercise3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {


    private CreditCardValidator creditCardValidator;

    @Before
    public void setUp() {
        creditCardValidator = new CreditCardValidator();
    }

    @Test
    public void shouldVerify() {
        assertEquals("VISA: 4111111111111111 (válido)", verify("4111111111111111"));
        assertEquals("VISA: 4111111111111 (inválido)", verify("4111111111111"));
        assertEquals("VISA: 4012888888881881 (válido)", verify("4012888888881881"));
        assertEquals("AMEX: 378282246310005 (válido)", verify("378282246310005"));
        assertEquals("Discover: 6011111111111117 (válido)", verify("6011111111111117"));
        assertEquals("MasterCard: 5105105105105100 (válido)", verify("5105105105105100"));
        assertEquals("MasterCard: 5105105105105106 (inválido)", verify("5105105105105106"));
        assertEquals("Desconhecido: 9111111111111111 (inválido)", verify("9111111111111111"));
    }

    private String verify(String cardNumber) {
        return creditCardValidator.verify(cardNumber);
    }

}