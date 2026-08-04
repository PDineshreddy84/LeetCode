class Solution {
    public int maxSum(int[] nums) {
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
                st.add(nums[i]);
        }
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        return sum;
    }
}