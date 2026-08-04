class Solution {
    public int maxSum(int[] nums) {
        int sum=Integer.MIN_VALUE,l=0,c=0;
        Set<Integer>st=new HashSet<>();
          for(int r=0;r<nums.length;r++){
              while(st.contains(nums[r])){
                  st.remove(nums[l]);
                  c-=nums[l];
                  l++;
              }
              st.add(nums[r]);
              c+=nums[r];
              sum=Math.max(sum,c);
          }
        return sum;
    }
}