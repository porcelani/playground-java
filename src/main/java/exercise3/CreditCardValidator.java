package exercise3;

import exercise3.flags.Flag;

import static exercise3.FlagValidation.whatFlagIsTheCard;
import static exercise3.LuhnAlgorithmValidation.isValid;

public class CreditCardValidator {

    public String verify(String cardNumber) {

        Flag cardFlag = whatFlagIsTheCard(cardNumber);
        boolean valid = isValid(cardNumber);

        return cardFlag.getName() + ": " + cardNumber + " (" + getStatus(valid)+")";
    }

    private String getStatus(boolean status) {
        return status ? "válido" : "inválido";
    }
}
