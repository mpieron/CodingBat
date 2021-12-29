package Array1;

import java.util.Arrays;

public class No23 {
    public boolean no23(int[] nums) {
        return Arrays.stream(nums).filter(x -> x == 2 || x == 3).findAny().isEmpty();
    }
}
