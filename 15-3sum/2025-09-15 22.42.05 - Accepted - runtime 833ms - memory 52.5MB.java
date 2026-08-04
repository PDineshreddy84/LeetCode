class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>>result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}