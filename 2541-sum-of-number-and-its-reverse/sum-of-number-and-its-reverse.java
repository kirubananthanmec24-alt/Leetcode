class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            int n=i;
            int rev=0;
            while(n!=0){
            int k=n%10;
            rev=rev*10+k;
            n/=10;
            }
            if(rev+i==num){
                return true;
            }
        }
        return false;
        
    }
}