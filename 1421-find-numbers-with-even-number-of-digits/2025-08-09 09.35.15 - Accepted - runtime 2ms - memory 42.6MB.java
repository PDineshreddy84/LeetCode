class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length,c=0,cou=0;
        for(int i=0;i<n;i++){
            c=0;
            while(nums[i]!=0){
                c++;
                nums[i]/=10;
            }
            if(c%2==0){
                cou++;
            }
        }
        return cou;
    }
}