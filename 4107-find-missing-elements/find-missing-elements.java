class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0],max=nums[0];
        Set<Integer>s=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        for(int x:nums){
            min=Math.min(x,min);
            max=Math.max(max,x);
            s.add(x);
        }
        for(int i=min+1;i<max;i++){
            if(!s.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}