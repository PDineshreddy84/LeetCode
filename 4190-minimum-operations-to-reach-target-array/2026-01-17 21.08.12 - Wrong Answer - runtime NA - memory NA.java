class Solution {
    public int minOperations(int[] nums, int[] target) {
        Map<Integer,Integer>m=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                continue;
            }
            else if(nums[i]!=target[i]){
                c++;
            }
            m.put(nums[i],target[i]);
        }
        return c;
    }
}