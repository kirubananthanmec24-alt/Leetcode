class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int min=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<max){
                max=prices[i];
            }
            if(prices[i]-max>min){
                min=prices[i]-max;
            }}
            return min;}}