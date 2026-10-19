class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int a=purchaseAmount%10;
        if(a<5){
            purchaseAmount=purchaseAmount-a;
        }
        else{
            purchaseAmount=purchaseAmount+(10-a);
        }
        return 100-purchaseAmount;
        
    }
}