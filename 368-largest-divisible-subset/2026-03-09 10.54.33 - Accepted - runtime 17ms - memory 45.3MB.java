class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        int[] dp=new int[n];
        int[] parent=new int[n];
        Arrays.fill(dp,1);
        Arrays.sort(nums);
        int maxLen=0;
        int lastInd=0;
        for(int i=0;i<n;i++){
            parent[i]=i;
            for(int prevInd=0;prevInd<i;prevInd++){
                if(nums[i]%nums[prevInd]==0 && dp[i]<dp[prevInd]+1){
                    dp[i]=dp[prevInd]+1;
                    parent[i]=prevInd;
                }
            }
            if(dp[i]>maxLen){
                maxLen=dp[i];
                lastInd=i;
            }
        }
        int i=lastInd;
        while(parent[i]!=i){
            l.add(nums[i]);
            i=parent[i];
        }
        l.add(nums[i]);
        return l;
    }
}