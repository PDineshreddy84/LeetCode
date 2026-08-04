class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>9){
                nums[i]=clac(nums[i]);
            }
            if(i==nums[i]){
                return i;
            }
        }
        return -1;
    }
    public static int clac(int ele){
        int s=0,rem=0;;
        while(ele!=0){
            rem=ele%10;
            s+=rem;
            ele/=10;
        }
        return s;
    }
}