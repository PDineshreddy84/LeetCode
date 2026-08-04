class Solution {
    public boolean isPalindrome(String s) {
        String ns=s.replaceAll("[^a-zA-Z0-9]","");
        ns=ns.toLowerCase();
        int n=ns.length();
        return helper(ns,0,n);
    }
    public static boolean helper(String s,int i,int n){
        if(i==n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return helper(s,i+1,n);
    }
}