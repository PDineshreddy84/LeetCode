class Solution {
    public int largestAltitude(int[] gain) {
        int res=0;
        int max=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
            res+=gain[i];
            max=Math.max(max,res);
        }
        return max;
    }
}