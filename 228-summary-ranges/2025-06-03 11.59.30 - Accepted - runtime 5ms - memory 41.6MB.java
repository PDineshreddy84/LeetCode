class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>l=new ArrayList<>();
        if(nums.length==0) return l;
        int s=nums[0];
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length || nums[i]!=nums[i-1]+1){
                if(s==nums[i-1]){
                    l.add(String.valueOf(s));
                }
                else{
                    l.add(s+"->"+nums[i-1]);
                }
                if(i<nums.length)  s=nums[i];
            }
        }
        return l;
    }
}