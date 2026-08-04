class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[2*n];
        int k=0,i=0;
        while(k<2*n){
            res[k]=nums[i];
            res[k+1]=nums[n+i];
            k+=2;
            i++;
        }
        return res;
    }
}