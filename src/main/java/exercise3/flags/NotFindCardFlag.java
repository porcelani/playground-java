package exercise3.flags;

public class NotFindCardFlag implements Flag {


    public boolean startNumberIsValid() {
        return false;
    }

    public boolean lengthIsValid() {
        return false;
    }

    public String getName() {
        return "Desconhecido";
    }
}
