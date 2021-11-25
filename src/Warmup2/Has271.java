package Warmup2;

public class Has271 {

    public boolean has271(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            int firstValue = nums[i];
            if(firstValue == nums[i+1]-5 && (Math.abs(firstValue-1-nums[i+2])) <= 2)
                return true;
        }
        return false;
    }
}
