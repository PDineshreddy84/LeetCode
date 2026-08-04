class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>m=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            else if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}