class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] b=new int[2];
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i!=j){
                    count++;}}
                    if(count==2){
                        b[0]=nums[i];
                    }}
                    for (int i = 1; i <= nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    count++;
                }
            }

            if (count == 0) {
                b[1] = i;}}
                return b;}}

    