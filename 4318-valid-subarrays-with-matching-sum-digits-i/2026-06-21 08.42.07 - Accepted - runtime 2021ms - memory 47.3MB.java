class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                String s=sum+"";
                if(s.charAt(0)-'0'==x && s.charAt(s.length()-1)-'0'==x){
                    c++;
                }
            }
        }
        return c;
    }
}