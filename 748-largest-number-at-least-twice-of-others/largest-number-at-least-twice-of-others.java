class Solution {
    public int dominantIndex(int[] a) {
        int max=a[0];
        int count=0;
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                k=i;
            }}
          int b=max/2;
          for(int i=0;i<a.length;i++){
            if(a[i]>b&&a[i]!=max){
                return -1;

            }
          } return k;}}
              