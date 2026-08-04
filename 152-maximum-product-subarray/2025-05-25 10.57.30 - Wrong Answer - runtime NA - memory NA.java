class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int l=1,r=1,j=n,m=0;
        for(int i=0;i<n;i++){
            if(l==0){
                l=1;
            }
            if(r==0){
                r=1;
            }
            l*=nums[i];
            j--;
            r*=nums[j];
            m=Math.max(l,Math.max(r,m));
        }
        return m;
    }
}