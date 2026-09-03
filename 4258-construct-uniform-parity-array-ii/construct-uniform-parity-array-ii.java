class Solution {
    public boolean uniformArray(int[] nums1) {
        int me=Integer.MAX_VALUE;
        int mo=Integer.MAX_VALUE;
        int ce=0,co=0;
        int n=nums1.length;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                me=Math.min(nums1[i],me);
                ce++;
            }
            else{
                mo=Math.min(nums1[i],mo);
                co++;
            }
        }
        int mine=Math.min(mo,me);
        if(mine%2==1 || ce==n||co==n)return true;
        return false;
    }
}