class Solution {
    public String generateTag(String caption) {
        String res="";
        
        for(int i=0;i<caption.length();i++){
           char ch=caption.charAt(i);
            if(ch==' '){
                Character.toUpperCase(caption.charAt(i+1));
            }
            if((ch>='A' && ch<='Z') || ch>='a' && ch<='z'){
                res+=ch;
            }
        }
        return "#"+res;
    }
}