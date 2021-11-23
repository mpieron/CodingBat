package Warmup1;

public class Diff21 {

    public int diff21(int n) {

        int difference = Math.abs(21-n);

        if (n <= 21)
            return difference;
        return difference* 2;
    }
}
