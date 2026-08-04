class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
        int n=nums.length,c=0;
        for(int i=0;i<n;i++){
            int cu=m.getOrDefault(nums[i],0);
            c+=cu;
            m.put(nums[i],cu+1);
        }
        return c;
    }
}