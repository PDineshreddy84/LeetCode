class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int res=nums[n-1]*nums[n-2]*nums[n-3];
        if(res<nums[0]*nums[1]*nums[2]){
            res=1;
            res=nums[0]*nums[1]*nums[2];
        }
        else if(res<nums[n-1]*nums[n-2]*nums[2] && n>5){
                res=1;
                res=nums[n-1]*nums[n-2]*nums[2];
        }
        else if(res<nums[0]*nums[1]*nums[n-1]){
                res=1;
                res=nums[0]*nums[1]*nums[n-1];
        }
        else if(res<nums[n-1]*nums[1]*nums[2] && n>5){
                res=1;
                res=nums[n-1]*nums[1]*nums[2];
        }
        return res;
    }
}