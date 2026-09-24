class Solution {
    public int maximumProduct(int[] a) {
        Arrays.sort(a);
      int n= a.length;
      int k=a[n-1]*a[n-2]*a[n-3];
      int k1=a[0]*a[1]*a[n-1];
      return Math.max(k,k1);}}

        