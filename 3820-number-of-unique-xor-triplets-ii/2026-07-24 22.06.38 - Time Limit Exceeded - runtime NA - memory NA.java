class Solution {
    public int uniqueXorTriplets(int[] nums) {
      Set<Integer>s=new HashSet<>();
      int n=nums.length;
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            s.add(nums[i]^nums[j]);
        }
      }
      Set<Integer>or=new HashSet<>();
      for(int x:s){
        for(int num:nums){
            or.add(x^num);
        }
      }
      return or.size();
    }
}
