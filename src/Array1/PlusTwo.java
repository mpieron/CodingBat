package Array1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusTwo {
    public int[] plusTwo(int[] a, int[] b){
        int[] arr = new int[4];
        for(int i=0; i<2; i++){
            arr[i] = a[i];
            arr[i+2] = b[i];
        }
        return arr;
    }

    public int[] plusTwoBiggerArrays(int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    }
}
