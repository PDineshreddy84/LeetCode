class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,c=0;
        int n=s.length();
        Map<Character,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),1);
                c++;
            }
            else{
                m.put(s.charAt(i),0);
                c=1;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}