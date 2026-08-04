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
        if(avg<=0){
            avg=0;
        }
        avg++;
        while(s.contains(avg)){
            avg++;
        }
        return avg;
    }
}