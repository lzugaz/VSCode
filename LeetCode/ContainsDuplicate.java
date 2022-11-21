import java.lang.reflect.Array;
import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length >= Math.pow(10,5)|| nums.length <= 1){
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if(i + 1 == nums.length){
                return false;
            }
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
