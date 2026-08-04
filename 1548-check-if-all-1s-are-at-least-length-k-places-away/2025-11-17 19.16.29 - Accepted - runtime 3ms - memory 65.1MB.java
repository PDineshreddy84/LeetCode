class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0,len=nums.length,i=0,st=0;
        int n=len-1;
        for(i=0;i<n;i++){
            if(nums[i]==1){
                st=i;
                break;
            }
        }
        for(i=0;i<len;i++){
            if(nums[i]==1){
                n=i;
            }
        }
        for(i=st+1;i<=n;i++){
            c=0;
            while(i<=n && nums[i]!=1){
                c++;
                i++;
            }
            if(c<k){
                return false;
            }
        }
        return true;
    }
}