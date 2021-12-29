package Array1;

import java.util.Arrays;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length-1]);

        return Arrays.stream(nums).map(x -> x=max).toArray();
    }
}
