class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int [] a=new int[nums1.length];
         int count=0;
        for(int i=0;i<nums1.length;i++){
             for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    a[count]=nums1[i];
                    count++;
                
                nums2[j]=-1;
                break;}
            }
        }
        int [] b=new int[count];
        for(int i=0;i<count;i++){
            b[i]=a[i];
        }
        return b;
    }
}