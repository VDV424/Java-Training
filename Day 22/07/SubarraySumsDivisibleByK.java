public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println("Subarrays divisible by " + k + ": " + subarraysDivByK(nums, k));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int[] map = new int[k];
        map[0] = 1;
        int runningSum = 0;
        int count = 0;

        for (int num : nums) {
            runningSum += num;
            int rem = runningSum % k;
            if (rem < 0) {
                rem += k;
            }
            count += map[rem];
            map[rem]++;
        }
        return count;
    }
}
