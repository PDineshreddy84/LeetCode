class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,n=nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            while(i<n-1 && nums[i]==nums[i+1]){
                if(c<2){
                    nums[k++]=nums[i];
                }
                c++;
                i++;
            }
            if(c<2){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}