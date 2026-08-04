class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        Arrays.sort(nums);
        int pref[]=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int k=0;
            while(k<n && pref[k]<=queries[i]){
                k++;
            }
            res[i]=k;
        }
        return res;
    }
}