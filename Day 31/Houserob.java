class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0){
        return 0;
        }
        if (nums.length == 1) return nums[0];      
        int p2 = 0; 
        int p1 = 0;   
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int curr = Math.max(p1, num + p2);
            p2 = p1;
            p1 = curr;
        } 
        return p1;
    }
}

