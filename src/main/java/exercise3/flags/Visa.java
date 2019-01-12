package exercise3.flags;

public class Visa implements Flag {

    private final String cardNumber;

    public Visa(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean startNumberIsValid() {
        return "4".equals(cardNumber.substring(0, 1));
    }

    public boolean lengthIsValid() {
        return 13 == cardNumber.length() || 16 == cardNumber.length();
    }

    public String getName() {
        return "VISA";
    }

}
