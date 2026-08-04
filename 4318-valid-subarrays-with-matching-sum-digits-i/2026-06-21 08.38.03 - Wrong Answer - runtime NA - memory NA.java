class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int c=0;
        int n=nums.length;
        int pref[]=new int[n];
        int suff[]=new int[n];
        pref[0]=nums[0];
        suff[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
            suff[n-i-1]=suff[n-i]+nums[n-i-1];
        }
        for(int i=0;i<n;i++){
            String s1=pref[i]+"";
            String s2=suff[i]+"";
            if(s1.charAt(0)-'0'==x && s1.charAt(s1.length()-1)-'0'==x){
                c++;
            }
            if(s2.charAt(0)-'0'==x && s2.charAt(s2.length()-1)-'0'==x){
                c++;
            }
        }
        return c;
    }
}