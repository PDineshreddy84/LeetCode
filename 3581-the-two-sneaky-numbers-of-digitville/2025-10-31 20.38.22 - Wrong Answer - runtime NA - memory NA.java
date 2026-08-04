class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
       for(int i=0;i<n;i++){
            if(i!=nums[i]){
                int t=nums[i];
                nums[i]=nums[t];
                nums[t]=t;
            }
       }
       boolean f=false;
       int r1=-1,r2=-1;
        for(int i=0;i<n;i++){
            if(f==false && i!=nums[i]){
                r1=nums[i];
                f=true;
            }
            else if(i!=nums[i]){
                r2=nums[i];
                break;
            }
        }
        return new int[]{r1,r2};
    }
}