package Array1;

public class Sum2 {
    public int sum2(int[] nums) {
        return switch (nums.length) {
            case 0 -> 0;
            case 1 -> nums[0];
            default -> nums[0] + nums[1];
        };
    }
}
