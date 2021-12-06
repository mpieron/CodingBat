package Array1;

public class RotateLeft3 {

    public int[] rotateLeft3(int[] nums) {
        int length = nums.length;
        int[] num = new int[length];

        System.arraycopy(nums, 1, num, 0, length-1);
        num[length-1] = nums[0];
        return num;
    }
}
