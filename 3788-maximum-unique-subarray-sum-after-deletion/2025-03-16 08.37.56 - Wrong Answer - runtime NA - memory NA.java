class Solution {
    public int maxSum(int[] nums) {
        int sum=0,r=0,l=0,c=0;
        Set<Integer>st=new HashSet<>();
        while(r<nums.length){
            if(!st.contains(nums[r])){
                st.add(nums[r]);
                c+=nums[r];
                r++;
                sum=Math.max(sum,c);
            }
            else{
                st.remove(nums[l]);
                c-=nums[l];
                l++;
            }
        }
        return sum;
    }
}