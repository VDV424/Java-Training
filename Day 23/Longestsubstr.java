import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash =new int[256];
        Arrays.fill(hash,-1);
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(hash[ch]>=l){
                l=hash[ch]+1;
            }
            int len = r-l+1;
            max=Math.max(len,max);
            hash[ch]=r;
        }
        return max;

    }
}