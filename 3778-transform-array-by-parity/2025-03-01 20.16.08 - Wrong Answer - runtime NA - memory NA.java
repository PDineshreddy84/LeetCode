class Solution {
    public int[] transformArray(int[] nums) {
        int new_arr[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           if(nums[i]%2==0){
               nums[i]=0;
           }
           else{
               nums[i]=1;
           }
       }
        Arrays.sort(nums);
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            new_arr[j]=nums[i];
            j++;
        }
        return new_arr;
    }
}