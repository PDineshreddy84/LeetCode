class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] q) {
        int ql=q.length;
        int n=nums.length;
        int pref[]=new int[n];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1];
            if(nums[i]%2 == nums[i-1]%2){
                pref[i]++;
            }
        }
        boolean ans[]=new boolean[ql];
        for(int i=0;i<ql;i++){
            int ind1=q[i][0];
            int ind2=q[i][1];
            int c=pref[ind2]-pref[ind1];
            ans[i]=(c>=1)?false:true;
        }
        return ans;
    }
}