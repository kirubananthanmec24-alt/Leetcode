class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int b=0;
        int c=x;
        while(x!=0){
            int a=x%10;
            b+=a;
            x/=10;
        }
        if(c%b==0){
            return b;
        }
        return -1;
        
    }
}