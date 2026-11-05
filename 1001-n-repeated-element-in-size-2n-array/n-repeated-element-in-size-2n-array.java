class Solution {
    public int repeatedNTimes(int[] a) {
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]&&i!=j){
                    count++;
                }}
                if(count !=0){
                    return a[i];
                }}return 0;}
}