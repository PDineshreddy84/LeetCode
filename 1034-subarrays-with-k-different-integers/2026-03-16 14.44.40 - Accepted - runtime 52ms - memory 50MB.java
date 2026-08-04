class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
      int ans1=solve(nums,k);
      int ans2=solve(nums,k-1);
      return ans1-ans2;
    }
    int solve(int nums[],int k){
        if(k==0)return 0;
         int l=0,r=0,n=nums.length,c=0;
        Map<Integer,Integer>m=new HashMap<>();
        while(r<n){
            m.put(nums[r],m.getOrDefault(nums[r],0)+1);
            while(m.size()>k){
                m.put(nums[l],m.get(nums[l])-1);
                if(m.get(nums[l])==0){
                    m.remove(nums[l]);
                }
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}