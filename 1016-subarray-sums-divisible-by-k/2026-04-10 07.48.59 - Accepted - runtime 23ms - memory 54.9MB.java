class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int ps=0;
        int res=0;
        Map<Integer,Integer>m=new HashMap<>();
        m.put(0,1);
        for(int i=0;i<n;i++){
            ps=(ps+nums[i]%k+k)%k;
            res+=m.getOrDefault(ps,0);
            m.put(ps,m.getOrDefault(ps,0)+1);
        }
        return res;
    }
}