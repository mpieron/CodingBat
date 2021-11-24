package Warmup2;

public class ArrayCount9 {

    public int arrayCount9(int[] nums) {
        int ctr = 0;

        for (int num : nums) {
            if (num == 9)
                ctr++;
        }
        return ctr;
    }
}
