package Array1;

public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        if(nums.length < 2)
            return false;
        if((nums[nums.length-1] == 3 && nums[nums.length-2] == 1))
            return true;
        for(int i=0; i<2; i++){
            if((nums[i] == 1 && nums[i+1] == 3))
                return true;
        }
        return false;
    }
}
