class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int num:nums){
            if(max<num){
                max=num;
            }
        }
        int res=0;
        for(int num:nums){
            res+=max-num;
        }
        return res;
    }
}