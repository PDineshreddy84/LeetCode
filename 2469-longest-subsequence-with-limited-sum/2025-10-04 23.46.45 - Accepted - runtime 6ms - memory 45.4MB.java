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
            int l=0,r=n-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if(queries[i]<pref[m]){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            res[i]=l;
        }
        return res;
    }
}