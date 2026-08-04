class Solution {
    public String trimTrailingVowels(String s) {
        String v="aeiou";
        int n=s.length();
        int i=n-1;
        for(i=n-1;i>=0;i--){
            if(!v.contains(s.charAt(i)+"")){
                break;
            }
        }
        return s.substring(0,i+1);
    }
}