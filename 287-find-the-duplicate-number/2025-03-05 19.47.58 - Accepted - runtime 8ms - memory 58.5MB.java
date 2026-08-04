class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
       int freq[]=new int[1000000];
       for(int i=0;i<nums.length;i++){
        int ele=nums[i];
        freq[ele]++;
        if(freq[ele]==2){
            ans=ele;
            break;
        }
       }
        return ans;
    }
}