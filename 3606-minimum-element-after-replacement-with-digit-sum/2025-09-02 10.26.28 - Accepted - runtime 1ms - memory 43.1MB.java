class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min=clac(nums[0]);
       for(int i=1;i<n;i++){
            int s=clac(nums[i]);
            if(min>s){
                min=s;
            }
       }
       return min;
    }
    public static int clac(int n){
        int s=0;
        while(n!=0){
            int rem=n%10;
            s+=rem;
            n/=10;
        }
        return s;
    }
}