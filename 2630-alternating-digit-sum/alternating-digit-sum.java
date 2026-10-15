class Solution {
    public int alternateDigitSum(int n) {
        int k=0,count=0;
        while(n!=0){
            int b=n%10;
            count++;
         
        if(count%2==0){
            b=-b;

        }
         k+=b; 
         n/=10;
        }
        if(count%2==0){
            k=-k;
        }
        return k;
        
    }
}