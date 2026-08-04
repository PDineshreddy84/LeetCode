class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer>m=new HashMap<>();
       for(char ch:s.toCharArray()){
        m.put(ch,m.getOrDefault(ch,0)+1);
       }
       for(char ch:t.toCharArray()){
        m.put(ch,m.getOrDefault(ch,0)-1);
       }
       for(var v:m.entrySet()){
        if(v.getValue()!=0){
            return false;
        }
       }
       return true;
    }
}