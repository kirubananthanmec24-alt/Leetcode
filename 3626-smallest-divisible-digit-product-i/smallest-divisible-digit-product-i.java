class Solution {
    public int smallestNumber(int n, int t) {
      
        while(true){  int k=n;
        int s=1;
        while(k!=0){
            int l=k%10;
           s=s*l;
            
            k/=10;
        }
        if(s%t==0){
            return n;
        }n++;
    }
}}