class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int len=word1.length()<word2.length()?word1.length():word2.length();
            for(int i=0;i<len;i++){
                str+=word1.charAt(i);
                str+=word2.charAt(i);
            }
        if(word1.length()>len){
            str+=word1.substring(len);
        }
        else if(word2.length()>len){
            str+=word2.substring(len);
        }
            return str;
    }
}