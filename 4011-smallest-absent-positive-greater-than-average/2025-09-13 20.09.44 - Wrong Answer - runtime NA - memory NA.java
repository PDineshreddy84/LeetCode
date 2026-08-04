class Solution {
    public int smallestAbsent(int[] nums) {
        int avg=0;
        int n=nums.length;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
            avg+=nums[i];
        }
        if(avg<=0){
            return 1;
        }
        avg/=n;
        avg++;
        while(s.contains(avg)){
            avg++;
        }
        return avg;
    }
}