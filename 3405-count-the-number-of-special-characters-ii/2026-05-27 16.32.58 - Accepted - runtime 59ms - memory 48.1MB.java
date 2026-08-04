class Solution {
    public int numberOfSpecialChars(String word) {
       Map<Character,Integer>cap=new HashMap<>();
       Map<Character,Integer>sml=new HashMap<>();
       int n=word.length();
       for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)&&!cap.containsKey(ch)){
                cap.put(ch,i);
            }
            else{
                sml.put(ch,i);
            }
       }
       int c=0;
       for(char ch:sml.keySet()){
        char up=Character.toUpperCase(ch);
        if(cap.containsKey(up) && sml.get(ch)<cap.get(up)){
            c++;
        }
       }
       return c;
    }
}