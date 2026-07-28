class Solution {
    public boolean isSameAfterReversals(int num) {
        int unitdig=num %10;
        if(num ==0){
            return true;

        }
        else if(unitdig==0){
            return false;
        }
        return true;
    }
}