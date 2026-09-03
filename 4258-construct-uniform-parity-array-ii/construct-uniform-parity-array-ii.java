class Solution {
    public boolean uniformArray(int[] nums1) {
        int mine=Integer.MAX_VALUE;
        int ce=0,co=0;
        int n=nums1.length;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                ce++;
            }
            else{
                co++;
            }
            mine=Math.min(nums1[i],mine);
        }
        if(mine%2==1 || ce==n||co==n)return true;
        return false;
    }
}