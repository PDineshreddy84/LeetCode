class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,l=0,r=0;
        int n=s.length();
        Map<Character,Integer>m=new HashMap<>();
        int i=0;
        while(i<n){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),i);
            }
            else{
                l=m.get(s.charAt(i))+1;
                m.put(s.charAt(i),i);
            }
            max=Math.max(max,i-l+1);
            i++;
        }
        return max;
    }
}