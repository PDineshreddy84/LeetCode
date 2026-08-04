class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int res[]=new int[2*n];
        int k=0;
        for(int i=0;i<2*n;i++){
            res[i]=nums[k];
            k++;
            if(k==n){
                k=0;
            }
        }
        return res;
    }
}