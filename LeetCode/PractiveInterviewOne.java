import java.util.Arrays;

public class PractiveInterviewOne {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
    public String removeKdigits(String num, int k) {
        int len = num.length(), hi = 0, left = len - k;
        if (len == k) return "0";
        char[] res = new char[len];
        for (int i = 0; i < len; i++) {
            while (len - i + hi > left && k > 0 && hi > 0 && res[hi - 1] > num.charAt(i)) {
                hi--;
                k--;
            }
            if (hi < left) res[hi++] = num.charAt(i);
        }
        int lo = 0;
        while (lo < hi && res[lo] == '0') lo++;
        return lo == hi ? "0" : new String(res, lo, hi - lo);
    }   
}
