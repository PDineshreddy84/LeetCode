class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rem=purchaseAmount%10;
        if(rem<5){
            purchaseAmount-=rem;
        }
        else{
            purchaseAmount+=10-rem;
        }
        return 100-purchaseAmount;
    }
}