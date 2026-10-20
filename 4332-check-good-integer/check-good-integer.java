class Solution {
    public boolean checkGoodInteger(int n) {
        int d=1;
        int c=0;
        while(n!=0){
            int a=n%10;
           int b=a*a;
           d+=b;
            c+=a;
            n/=10;
        }
        return d-c>=50;
        
    }
}