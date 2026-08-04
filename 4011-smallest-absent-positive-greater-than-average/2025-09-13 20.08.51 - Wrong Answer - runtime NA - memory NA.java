class Solution {
    public int smallestAbsent(int[] nums) {
        int avg=0;
        int n=nums.length;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
            avg+=nums[i];
        }
        avg/=n;
        avg++;
        while(s.contains(avg)){
            avg++;
        }
        return avg;
    }
}