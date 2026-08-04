class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n){
            int c=nums[i]-1;
            if(nums[c]!=nums[i]){
                int t=nums[c];
                nums[c]=nums[i];
                nums[i]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(nums[k]!=k+1){
                l.add(nums[k]);
            }
        }
        return l;
    }
}