package Array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int length = nums.length;
        int[] reversed = new int[length];
        for(int i=0; i<length; i++){
            reversed[i] = nums[length-i-1];
        }
        return reversed;
    }
}
