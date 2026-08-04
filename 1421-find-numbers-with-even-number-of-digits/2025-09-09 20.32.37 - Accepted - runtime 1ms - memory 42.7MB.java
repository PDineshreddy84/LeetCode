class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length,c=0,cou=0;
        for(int i=0;i<n;i++){
            c=(int)(Math.log10(nums[i])+1);
            if(c%2==0){
                cou++;
            }
        }
        return cou;
    }
}