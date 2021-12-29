package Array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int halfLength = nums.length/2;
        return new int[] {nums[halfLength-1], nums[halfLength]};
    }
}
