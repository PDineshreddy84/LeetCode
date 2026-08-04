class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<2*n-1;i++){
            int k=1;
            long sum=0;
            while(k<n){
                sum+=nums[(i+k+1)%n]*k;
                k++;
            }
            max=Math.max(sum,max);
        }
        return (int)max;
    }
}