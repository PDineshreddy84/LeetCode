class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int ec=0,oc=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    ec++;
                }
                else{
                    oc++;
                }
                if(oc==0)continue;
                else if(((float)ec/oc)<=((float)a/b)){
                    c++;
                }
            }
        }
        return c;
    }
}