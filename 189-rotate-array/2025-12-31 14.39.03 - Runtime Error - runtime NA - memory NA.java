class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        helper(0,n-k-1,nums);
        helper(n-k,n-1,nums);
        helper(0,n-1,nums);
    }
    public static void helper(int st,int ed,int nums[]){
        while(st<ed){
            int t=nums[st];
            nums[st]=nums[ed];
            nums[ed]=t;
            st++;
            ed--;
        }
    }
}