class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        String ans1="";
        String ans2="";
        String ans3="";
        for(int i=0;i<len;i++){
            if(isPalindrome(s.substring(i,len))){
                ans1+=s.substring(i,len);
                break;
            }
        }
        for(int i=len-1;i>=0;i--){
            if(ans1.length()<i && isPalindrome(s.substring(0,i))){
                ans2=s.substring(0,i);
                break;
            }
        }
        String ans=ans1.length()>ans2.length()?ans1:ans2;
        int l=0;
        int r=len;
        while(l<r){
            if((r-l+1>ans.length()) && isPalindrome(s.substring(l,r))){
                ans3+=s.substring(l,r);
                break;
            }
            l++;
            r--;
        }
        return ans3.length()>ans.length()?ans3:ans;
    }
    public boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}