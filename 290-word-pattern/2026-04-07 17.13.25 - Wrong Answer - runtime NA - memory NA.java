class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[]=s.split(" ");
       Set<String>s1=new HashSet<>();
       Set<String>s2=new HashSet<>();
       if(pattern.length()!=word.length)return false;
       for(int i=0;i<pattern.length();i++){
        s1.add(pattern.charAt(i)+"");
       }
       for(int i=0;i<word.length;i++){
        s2.add(word[i]);
       }
        return s1.size()==s2.size();
    }
}