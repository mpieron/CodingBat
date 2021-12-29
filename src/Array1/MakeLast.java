package Array1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int doubleLength = nums.length*2;
        int[] arr = new int[doubleLength];

        arr[doubleLength-1] = nums[doubleLength/2-1];
        return arr;
    }
}
