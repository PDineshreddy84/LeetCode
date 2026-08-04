class Solution {
    public int maxSum(int[] nums) {
        int sum=0;
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
            }
            st.add(nums[i]);
        }
        for(int i: st){
            sum+=i;
        }
        return sum;
    }
}