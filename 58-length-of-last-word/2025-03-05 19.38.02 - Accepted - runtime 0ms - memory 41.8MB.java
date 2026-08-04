class Solution {
    public int lengthOfLastWord(String str) {
        String s=str.trim();
        int l=s.length();
        int len=0;
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)==' '){
                len=s.substring(i+1,l).length();
                break;
            }
        }
        if(len==0){
            return s.length();
        }
        return len;
    }
}