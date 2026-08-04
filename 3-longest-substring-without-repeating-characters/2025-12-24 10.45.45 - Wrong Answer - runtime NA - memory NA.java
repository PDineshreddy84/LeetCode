class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,l=0,r=0;
        int n=s.length();
        Set<Character>set=new HashSet<>();
        int i=0;
        while(i<n){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
                set.clear();
                set.add(s.charAt(i));
                l=i;
            }
            max=Math.max(max,i-l+1);
            i++;
        }
        return max;
    }
}