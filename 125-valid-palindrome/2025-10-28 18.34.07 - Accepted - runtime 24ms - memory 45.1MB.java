class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        StringBuilder str=new StringBuilder(s);
        String rev=str.reverse().toString();
        System.out.println(s+" "+str);
        return s.equals(rev);
    }
}