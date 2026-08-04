class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int n=nums.length;
        Arrays.sort(nums);
        while(l<r){
            int m=l+(r-l)/2;
            if(target<=nums[m]){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        System.out.println(l+" ");
        List<Integer>list=new ArrayList<>();
        while(l < n && nums[l] == target){
            list.add(l);
            l++;
        }
        return list;
    }
}