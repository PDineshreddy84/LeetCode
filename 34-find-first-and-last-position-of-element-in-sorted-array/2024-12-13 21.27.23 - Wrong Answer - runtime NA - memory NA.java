class Solution {
    public int[] searchRange(int[] nums, int target) {
       ArrayList<Integer>arr=new ArrayList<>(); 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                 arr.add(i);
            }
        }
        int res[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
    if(arr.size()==0){
    return new int[]{-1,-1};
    }
    else if(arr.size()==1){
        return new int[]{0,0};
    }
        return res;
    }
}