class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int pref1[]=new int[n];
        int pref2[]=new int[n];
        int sum=0,c=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            pref1[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>-1;i--){
            sum+=nums[i];
            pref2[i]=sum;
        }
        for(int i=0;i<n-1;i++){
            if((pref1[i]-pref2[i+1])%2==0){
                c++;
            }
        }
        return c;
    }
}