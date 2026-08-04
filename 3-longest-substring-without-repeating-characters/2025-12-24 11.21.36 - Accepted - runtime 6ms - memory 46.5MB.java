class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(!set.contains(ch)){
            set.add(ch);
            max=Math.max(right-left+1,max);
            right++;
            }
            else{
            set.remove(s.charAt(left++));
            }
        }    
    return max;
   }
}