package exercise3.flags;

public class MasterCard implements Flag {

    private final String cardNumber;

    public MasterCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean startNumberIsValid() {
        Integer value = Integer.valueOf(cardNumber.substring(0, 2));
        return value >= 51 && value <= 55;
    }

    public boolean lengthIsValid() {
        return 16 == cardNumber.length();
    }

    public String getName() {
        return "MasterCard";
    }

}
