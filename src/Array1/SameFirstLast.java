package Array1;

public class SameFirstLast {

    public boolean sameFirstLast(int[] nums) {
        int length = nums.length;
        return length > 0 && nums[0] == nums[length-1];
    }
}
