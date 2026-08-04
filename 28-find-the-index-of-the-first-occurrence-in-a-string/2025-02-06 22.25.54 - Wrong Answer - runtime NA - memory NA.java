class Solution {
    public int strStr(String haystack, String needle) {
      int temp=-1;
        if(haystack.contains(needle)){
            for(int i=0;i<haystack.length();i++){
                if(needle.charAt(0)==haystack.charAt(i)){
                    temp=i;
                    break;
                }
            }
        }
        return temp;
    }
}