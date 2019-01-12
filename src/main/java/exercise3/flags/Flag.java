package exercise3.flags;

public interface Flag {

    default boolean isValid() {
        return startNumberIsValid() && lengthIsValid();
    }

    boolean startNumberIsValid();

    boolean lengthIsValid();

    String getName();

}
