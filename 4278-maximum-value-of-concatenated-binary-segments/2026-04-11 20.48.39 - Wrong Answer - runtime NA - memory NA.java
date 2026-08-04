class Solution {
    public int maxValue(int[] nums1, int[] nums0) {
        int n=nums1.length;
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx,(a,b)->{
            if(nums1[a]!=nums1[b]){
                return nums1[b]-nums1[a];
            }
            return nums0[a]-nums0[b];
        });
        long ans=0;
        long mod=1_000_000_007;
        for(int i:idx){
            for(int j=0;j<nums1[i];j++){
                ans=(ans*2+1)%mod;
            }
            for(int j=0;j<nums0[i];j++){
                ans=(ans*2)%mod;
            }
        }
        return (int)ans;
    }
}