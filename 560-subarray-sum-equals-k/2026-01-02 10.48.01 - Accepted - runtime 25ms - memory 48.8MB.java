class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
        int n=nums.length;
        int ps=0,c=0;
        m.put(ps,1);
        for(int i=0;i<n;i++){
            ps+=nums[i];
            int r=ps-k;
            c+=m.getOrDefault(r,0);
            m.put(ps,m.getOrDefault(ps,0)+1);
        }
        return c;
    }
}