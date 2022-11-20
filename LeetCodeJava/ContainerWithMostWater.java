public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int l = 0, r = height.length - 1;
        while(l < r ) {
           max = Math.max(max, (r - l) * Math.min(height[r], height[l]));
           if(height[l] <= height[r]) {
               int hl = height[l];
               while(l < r && height[l] <= hl)
                l++;
           } else {
               int hr = height[r];
               while(l < r && height[r] <=  hr)
                r--;
           }
        }
        return max;
    }
}
