package exercise3.flags;

public class Discover implements Flag {

    private final String cardNumber;

    public Discover(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean startNumberIsValid() {
        return "6011".equals(cardNumber.substring(0, 4));
    }

    public boolean lengthIsValid() {
        return 16 == cardNumber.length();
    }

    public String getName() {
        return "Discover";
    }

}
