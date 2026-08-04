class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char t=' ';
        for(int i=0;i<n/2;i++){
            t=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=t;
        }
    }
}