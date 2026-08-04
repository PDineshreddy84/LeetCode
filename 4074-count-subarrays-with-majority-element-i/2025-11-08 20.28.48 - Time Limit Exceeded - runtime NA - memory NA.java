class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        List<List<Integer>>l=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
             List<Integer>t=new ArrayList<>();
            for(int j=i;j<n;j++){
                t.add(nums[j]);
                l.add(new ArrayList<>(t));
            }
        }
        int res=0;
        for(List<Integer>sa:l){
            int c=0,sl=sa.size();
            for(int num:sa){
                if(num==target){
                    c++;
                }
            }
            int req=sl-c;
            if(c>req){
                res++;
            }
        }
        return res;
    }
}