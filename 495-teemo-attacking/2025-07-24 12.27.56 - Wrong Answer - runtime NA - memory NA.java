class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int l=t.length;
        int res=0;
        for(int i=0;i<l;i++){
            if(res!=t[i]){
                res+=d;
            }
            else{
                res+=d-1;
                i++;
            }
        }
        return res;
    }
}