package exercise3;

import exercise3.flags.*;

import java.util.ArrayList;

public class FlagValidation {
    public static Flag whatFlagIsTheCard(String cardNumber) {

        ArrayList<Flag> flags = new ArrayList<>();
        flags.add(new AMEX(cardNumber));
        flags.add(new Discover(cardNumber));
        flags.add(new MasterCard(cardNumber));
        flags.add(new Visa(cardNumber));

        return flags.stream()
                .filter(Flag::isValid)
                .findFirst()
                .orElse(new NotFindCardFlag());
    }
}