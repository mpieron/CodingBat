package Warmup1;

public class LoneTeen {

    public boolean loneTeen(int a, int b) {
        boolean isA  = a > 12 && a < 20;
        boolean isB  = b > 12 && b < 20;

        return isA != isB;
    }
}
