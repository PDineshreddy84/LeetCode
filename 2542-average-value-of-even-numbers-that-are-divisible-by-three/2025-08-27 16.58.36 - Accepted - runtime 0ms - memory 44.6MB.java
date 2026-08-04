class Solution {
    public int averageValue(int[] nums) {
        int s=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                s+=nums[i];
                c++;
            }
        }
        if(c==0){
            return 0;
        }
        return s/c;
    }
}