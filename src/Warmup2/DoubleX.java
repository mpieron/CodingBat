package Warmup2;

public class DoubleX {

    boolean doubleX(String str) {
        int firstIndex = str.indexOf("x");

        return firstIndex != -1 && firstIndex + 1 < str.length() && str.charAt(firstIndex + 1) == 'x';
    }
}
