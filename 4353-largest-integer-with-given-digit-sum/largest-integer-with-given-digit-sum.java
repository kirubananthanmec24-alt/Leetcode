class Solution {
    public int largestInteger(int n, int s) {
        int k=(int)Math.pow(10,n);
        if(s==0){
            return 0;
        }
        for(int i=k-1;i>=1;i--){
            int l=0;
            int j=i;
            while(j!=0){
                int b=j%10;
                l+=b;
                j/=10;}
                if(l==s){
                    return i;

                }}
                return -1;}}


     