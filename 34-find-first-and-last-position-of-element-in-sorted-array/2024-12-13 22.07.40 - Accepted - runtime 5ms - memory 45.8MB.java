class Solution {
    public int[] searchRange(int[] nums, int target) {
       ArrayList<Integer>arr=new ArrayList<>(); 
        for(int i=0;i<nums.length;i++){
           arr.add(nums[i]);
        }
        int res[]=new int[2];
        res[0]=arr.indexOf(target);
        res[1]=arr.lastIndexOf(target);
        if(arr.size()==0){
             return new int[]{-1,-1};
    }
        return res;
    }
}