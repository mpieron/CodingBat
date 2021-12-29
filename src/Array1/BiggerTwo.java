package Array1;

import java.util.Arrays;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        return Arrays.stream(a).sum() >= Arrays.stream(b).sum() ? a : b;
}
}
