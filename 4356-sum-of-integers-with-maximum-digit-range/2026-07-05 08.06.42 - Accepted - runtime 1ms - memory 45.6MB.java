class Solution {
    int om=0;
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int dr[]=new int[n];
        for(int i=0;i<n;i++){
            dr[i]=getRange(nums[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(dr[i]==om){
                sum+=nums[i];
            }
        }
        return sum;
    }
    int getRange(int num){
        int min=Integer.MAX_VALUE;
        int max=0;
        while(num!=0){
            int rem=num%10;
            min=Math.min(min,rem);
            max=Math.max(max,rem);
            num/=10;
        }
        om=Math.max(max-min,om);
        return max-min;
    }
}