class Solution {
    public int majorityElement(int[] nums) {
        int c=0,el=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                c++;
            }
        }
        if(c>(n/2)){
            return el;
        }
        return -1;
    }
}