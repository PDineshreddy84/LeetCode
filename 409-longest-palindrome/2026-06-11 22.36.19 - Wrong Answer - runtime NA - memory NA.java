class Solution {
    public int longestPalindrome(String s) {
        s=s.toLowerCase();
        int freq[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int res=0,f=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2==0){
                res+=freq[i];
            }
            else{
                res=res+freq[i]-1;
                f=1;
            }
        }
        return f==1?res+1:res;
    }
}