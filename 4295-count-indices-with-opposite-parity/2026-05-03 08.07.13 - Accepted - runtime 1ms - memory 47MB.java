class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int ec[]=new int[n];
        int oc[]=new int[n];
        int o=0,e=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                e++;
            }
            else{
                o++;
            }
                oc[i]=o;
                ec[i]=e;
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[i]=oc[n-1]-oc[i];
            }
            else{
                ans[i]=ec[n-1]-ec[i];
            }
        }
        return ans;
    }
}