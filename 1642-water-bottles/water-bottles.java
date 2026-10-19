class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a= numBottles;
        int b= numBottles;

        while (b>= numExchange) {
            int newBottles = b/numExchange;
            a+= newBottles;
            b=b%numExchange+newBottles;
        }

        return a;
    }
}