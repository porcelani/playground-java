package exercise1;

public class Exercise1 {


    public static final int MAX_NUMBER_OF_ELEMENTS_TO_RETURN = 6;
    public static final int MAX_C_VALUE = 1000000;

    private Number a;
    private Number b;


    public Exercise1(Integer a, Integer b) {
        this.a = new Number(a);
        this.b = new Number(b);
    }

    public Integer calculaC() {

        String c = "";
        for (int i = 0; i <= MAX_NUMBER_OF_ELEMENTS_TO_RETURN; i++) {
            c = c + a.getNextCaracter() + b.getNextCaracter();
        }

        Integer value = new Integer(c);
        if(!a.isEmpty() || !b.isEmpty() || value > MAX_C_VALUE){
            return -1;
        }

        return value;
    }


}
