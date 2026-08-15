class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length,z=0,xor=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)z++;
            xor^=nums[i];
        }
        if(n==z)return 0;
        if(xor==0)return n-1;
        return n;
    }
}