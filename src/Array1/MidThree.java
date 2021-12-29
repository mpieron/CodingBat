package Array1;

import java.util.Arrays;

public class MidThree {
    public int[] midThree(int[] nums) {
        int middle = nums.length/2;
        return Arrays.copyOfRange(nums, middle-1, middle+2);
    }
}
