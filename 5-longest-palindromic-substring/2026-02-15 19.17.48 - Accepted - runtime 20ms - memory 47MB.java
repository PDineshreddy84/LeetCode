class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            int st=i,e=i;
            while(st>=0 && e<n && s.charAt(st)==s.charAt(e)){
                st--;
                e++;
            }
            String temp=s.substring(st+1,e);
            if(temp.length()>res.length())res=temp;
            st=i;
            e=i+1;
            while(st>=0 && e<n && s.charAt(st)==s.charAt(e)){
                st--;
                e++;
            }
            temp=s.substring(st+1,e);
            if(res.length()<temp.length())res=temp;
        }
        return res;
    }
}