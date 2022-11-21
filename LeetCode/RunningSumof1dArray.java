public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int total = 0;
        for(int i = 0; i<length; i++){
            nums[i] = nums[i] + total;
            total = nums[i];
            
        }
        return nums;
    }

}
