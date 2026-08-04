class Solution {
    public int minElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums[0];
        int s=0;
        while(n!=0){
            int rem=n%10;
            s+=rem;
            n/=10;
        }
        return s;
    }
}