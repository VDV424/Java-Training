import java.util.HashMap;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println("Has continuous subarray sum: " + checkSubarraySum(nums, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int rem = runningSum % k;
            
            // handle negative remainder
            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                if (i - map.get(rem) > 1) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
}
