class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int Sum = 0;
        for (int i = 0; i < k; i++) {
            Sum += nums[i];
        }
        int max = Sum;
        for (int i = k; i < nums.length; i++) {
            Sum += nums[i] - nums[i - k];
            max = Math.max(max, Sum);
        }
        return (double) max / k;
    }
}