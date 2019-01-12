package exercise3.flags;

public class AMEX implements Flag {

    private final String cardNumber;

    public AMEX(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean startNumberIsValid() {
        String value = cardNumber.substring(0, 2);
        return "34".equals(value) || "37".equals(value);
    }

    public boolean lengthIsValid() {
        return 15 == cardNumber.length();
    }

    public String getName() {
        return "AMEX";
    }

}
