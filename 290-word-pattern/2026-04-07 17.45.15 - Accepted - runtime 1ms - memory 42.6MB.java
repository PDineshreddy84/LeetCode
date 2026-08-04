class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[]=s.split(" ");
        Map<Character,String>m=new HashMap<>();
        if(pattern.length()!=word.length)return false;
        for(int i=0;i<pattern.length();i++){
            if(!m.containsValue(word[i]) && !m.containsKey(pattern.charAt(i))){
                m.put(pattern.charAt(i),word[i]);
            }
            else if(m.containsKey(pattern.charAt(i)) && !m.get(pattern.charAt(i)).equals(word[i])){
                return false;
            }
            if(!m.containsKey(pattern.charAt(i)))return false;
        }
        return true;
    }
}