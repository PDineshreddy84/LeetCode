class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
        int c=0,l=0,r=0,res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            while(m.get(nums[i])>k){
                m.put(nums[l],m.get(nums[l])-1);
                if(m.get(nums[l])==0){
                    m.remove(nums[l]);
                }
                l++;
            }
            c=i-l+1;
            res=Math.max(res,c);
        }
        return res;
    }
}