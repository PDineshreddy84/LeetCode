class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0,n=nums.length,i=0;
        for(i=0;i<n;i++){
            c=0;
            while(i<n && nums[i]!=1){
                c++;
                i++;
            }
            if(i>0 && c<k){
                return false;
            }
        }
        return true;
    }
}