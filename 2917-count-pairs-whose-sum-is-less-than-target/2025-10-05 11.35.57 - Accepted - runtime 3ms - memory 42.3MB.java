class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        Collections.sort(nums);
        int l=0,r=n-1,p=0;
        while(l<r){
            if(nums.get(l)+nums.get(r)<target){
                p+=r-l;
                l++;
            }
            else{
                r--;
            }
        }
        return p;
    }
}