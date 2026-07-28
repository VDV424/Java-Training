class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int minLength = n + 1;
        for (int i = 0; i <= n; i++) {
            int left = i;
            int right = n;
            int firstTrueIndex = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (prefixSum[mid] >= prefixSum[i] + target) {
                    firstTrueIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (firstTrueIndex != -1) {
                minLength = Math.min(minLength, firstTrueIndex - i);
            }
        }
        return minLength <= n ? minLength : 0;
    }
}