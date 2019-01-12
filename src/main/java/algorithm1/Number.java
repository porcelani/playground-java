package algorithm1;

import static java.lang.String.valueOf;

public class Number {
    public static final String EMPTY = "";

    Integer valor;
    char[] chars;
    int length;
    int pointer = 0;


    public Number(Integer valor) {
        this.valor = valor;
        this.chars = valor.toString().toCharArray();
        this.length = valor == 0 ? 0 : chars.length;
    }

    public String getNextCaracter() {
        if (pointer >= length) {
            return EMPTY;
        } else {
            char element = chars[pointer];
            pointer++;
            return valueOf(element);
        }

    }

    public boolean isEmpty() {
        return pointer == length;
    }
}