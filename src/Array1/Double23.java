package Array1;

import java.util.Arrays;

public class Double23 {
    public boolean double23(int[] nums) {
        return Arrays.stream(nums).filter(x -> x == 2).count() == 2
                || Arrays.stream(nums).filter(x -> x == 3).count() == 2;
    }
}
