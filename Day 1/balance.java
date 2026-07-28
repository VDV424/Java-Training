class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount=((purchaseAmount+5)/10)*10;
        int num = 100 - roundedAmount;
        return num;
    }
}