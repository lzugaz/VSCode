import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i<nums.length;i++){
            int pair = k - nums[i];
            if(map.containsKey(pair) && map.get(pair) != i){
                counter++;
                map.remove(i);
                map.remove(nums[i]);
            }
        }
        return counter;
    }


    public static void main(String[] args){
        int [] nums = {1,2,3,4};
        int k = 5;
        maxOperations(nums,k);
    }
}
