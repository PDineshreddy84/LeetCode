class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>m=new HashMap<>();
        for(int ele:nums){
            m.put(ele,m.getOrDefault(ele,0)+1);
        }
        for(int ele:nums){
            if(m.get(ele)==n/2){
                return ele;
            }
        }
        return 0;
    }
}