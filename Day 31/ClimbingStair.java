class Solution {
    public int climbStairs(int n) {
        int p1 = 1;
        int p2 = 0;
        for (int step = 0; step < n; ++step) {
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
}