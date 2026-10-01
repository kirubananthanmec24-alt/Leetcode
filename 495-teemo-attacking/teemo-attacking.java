class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration){
         int a = duration;
         for (int i = 1; i < timeSeries.length; i++) {
            a += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);}
            return a;}}