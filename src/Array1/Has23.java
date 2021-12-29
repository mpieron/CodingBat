package Array1;

import java.util.Arrays;

public class Has23 {
    public boolean has23(int[] nums) {
        return Arrays.stream(nums).filter(x -> x == 2 || x == 3).findAny().isPresent();
    }
}
